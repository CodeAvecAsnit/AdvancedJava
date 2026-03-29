package JavaLab4Networking.Question41;

import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;


/**
 * Note : Before starting pls download jakarta.mail-api
 */
public class SendMail {
    public static void main(String[] args) {
        Session session = MailProperties.getMailSession();
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(MailProperties.USERNAME));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("asnitbakhati@gmail.com"));
            message.setSubject("Advanced Java is fun");
            message.setText("Working with Mail with the help of jakarta");
            Transport.send(message);
            System.out.println("Sent!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
