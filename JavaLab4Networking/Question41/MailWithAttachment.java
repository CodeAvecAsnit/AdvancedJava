package JavaLab4Networking.Question41;

import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.io.File;


/**
 * Note : Before starting pls download jakarta.mail-api
 */
public class MailWithAttachment {
    public static void main(String[] args) {
        Session session = MailProperties.getMailSession();
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(MailProperties.USERNAME));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("asnitbakhati@gmail.com"));
            message.setSubject("Mail with Attachment");
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText("Please find the attachment.");
            MimeBodyPart filePart = new MimeBodyPart();
            filePart.attachFile(new File("copy.png"));
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);
            multipart.addBodyPart(filePart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Mail with attachment sent!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
