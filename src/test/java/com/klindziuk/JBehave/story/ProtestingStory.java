package com.klindziuk.JBehave.story;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.Steps;

import com.klindziuk.JBehave.step.ProtestingSteps;

public class ProtestingStory extends JUnitStories {

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(this.getClass().getClassLoader()))
				.useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats()
						.withFormats(Format.HTML, Format.CONSOLE).withRelativeDirectory("jbehave-report"));
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		ArrayList<Steps> stepFileList = new ArrayList<Steps>();
		stepFileList.add(new ProtestingSteps());

		return new InstanceStepsFactory(configuration(), stepFileList);
	}

	@Override
	protected List<String> storyPaths() {
		return new StoryFinder().findPaths("D:/Program Files/EclipseIDE/workspace/BehaveProtesting/src/test/resourses",
				Arrays.asList("**/*.story"), Arrays.asList(""));
	}

	@org.testng.annotations.Test
	public void run() throws Throwable {
		super.run();
	}
}
