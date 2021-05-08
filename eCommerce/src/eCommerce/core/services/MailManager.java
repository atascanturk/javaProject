package eCommerce.core.services;

public class MailManager implements MailService {
	@Override
	public void sendMail(String to, String message) {
		System.out.println("Mail `" + message + "` sended to : " + to);
	}
}
