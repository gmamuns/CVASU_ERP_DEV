package utils;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author mamuns
 */
public class Bulk_Mail_Sending {

    public static void main(String[] args) {
        final String username = "gmamuns";
        final String password = "***********8888";
        String from = "gmamuns@gmail.com";
        String to = "ymamuns@yahoo.com";
        String subject = "Hi";
        String msg = "hello";

        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }

        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(msg);
            Transport.send(message);

            //System.out.println("your mail send successfully.....");
            JOptionPane.showMessageDialog(null, "Your mail send successfully...", "Confirmation", JOptionPane.PLAIN_MESSAGE);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
