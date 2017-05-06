package com.klindziuk.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	private static final String RECIEVER = "reciever@gmail.com";
	private static final String SENDER = "sender@gmail.com";
	private static final String USERNAME = "username@gmail.com";
	private static final String PASSWORD = "password";
	private static final String MSG = "Hey Klindziuk, tests started after commit at " + new Date().toString();

	public void sendMail() {
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(USERNAME, PASSWORD);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(SENDER));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(RECIEVER));
			message.setSubject("Test suit started");
			message.setText(MSG);
			Transport.send(message);
			System.out.println("Message sent to " + RECIEVER);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}