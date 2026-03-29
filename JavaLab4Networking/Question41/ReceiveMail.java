package JavaLab4Networking.Question41;

import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Store;


/**
 * Note : Before starting pls download jakarta.mail-api
 */
public class ReceiveMail {
    public static void main(String[] args) {
        Session session = MailProperties.getMailSession();
        try{
            Store store = session.getStore("imap");
            store.connect(MailProperties.USERNAME, "password");
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            Message[] messages = inbox.getMessages();
            for (int i = messages.length - 1; i >= messages.length - 5; i--) {
                Message msg = messages[i];
                System.out.println("Subject: " + msg.getSubject());
                System.out.println("From: " + msg.getFrom()[0]);
                System.out.println("Content: " + msg.getContent());
            }

            inbox.close(false);
            store.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
