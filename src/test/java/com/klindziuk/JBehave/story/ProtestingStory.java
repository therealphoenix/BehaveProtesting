package com.klindziuk.JBehave.story;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;

import org.jbehave.core.steps.InstanceStepsFactory;

import com.klindziuk.JBehave.step.ProtestingSteps;

public class ProtestingStory extends JUnitStory {
	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
				// where to find the stories
				.useStoryLoader(new LoadFromClasspath(this.getClass()))
				// CONSOLE and TXT reporting
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
	}

	// Here we specify the steps classes
	@Override
	public List<CandidateSteps> candidateSteps() {
		// varargs, can have more that one steps classes
		return new InstanceStepsFactory(configuration(), new ProtestingSteps()).createCandidateSteps();
	}

	@org.testng.annotations.Test
	public void run() throws Throwable {
		super.run();
	}

}
