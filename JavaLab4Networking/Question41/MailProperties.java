package JavaLab4Networking.Question41;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;

import java.util.Properties;


/**
 * Note : Before starting pls download jakarta.mail-api
 */
public class MailProperties {

    public static final String USERNAME = "x@gmail.com"; //email here
    private static final String PASSWORD = ""; //get password with google 2fa;

    public static Session getMailSession() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        return Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(USERNAME, PASSWORD);
                    }
                });
    }
}
