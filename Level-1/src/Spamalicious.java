import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalicious implements ActionListener{
	static final String FAKE_USERNAME = "iHateGreenBeansDaddy";
	static final String FAKE_PASSWORD = "carrots4life";

	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JTextField textfield;
	
	public static void main(String[] args) {
		Spamalicious spamalicious = new Spamalicious();
	}

	Spamalicious(){
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		textfield = new JTextField();
		textfield = new JTextField();
		panel.add(textfield);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Good");
		button2.setText("Bad");
		button1.addActionListener(this);
		button2.addActionListener(this);
		textfield.setText("Phone Number or E-mail");
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 100; i++) {
			sendSpam(textfield.getText(),"Join the dark side","go eat a dum dum wrapper");
		}
	}
private boolean sendSpam(String recipient, String subject, String content) {

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
		}
	});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FAKE_USERNAME));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		message.setText(content);
		Transport.send(message);
		return true;

	} catch (MessagingException e) {
e.printStackTrace();
return false;
	}
}
}

