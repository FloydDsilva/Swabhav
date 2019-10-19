package com.techlabs.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	public static void sendEmail(String to)
    {
        final String username = "floyddsilva619@gmail.com";
        final String password = "demomail123";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));
            message.setSubject("Test Mail Header !!!");
            message.setText("Dear Sir,"
                + "\n\n This is a dummy Mail! Sorry for the inconvinence.");

            Transport.send(message);

            System.out.println("Done");

        } 

        catch (MessagingException e) 
        {
            // throw new RuntimeException(e);
        	e.printStackTrace();
            System.out.println("Username or Password are incorrect ... exiting !");
        }
    }


    public static void main(String[] args) 
    {
        String to = "kannan@swabhavtechlabs.com";
        sendEmail(to);
    }
}
