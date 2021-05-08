package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;


public interface UserActivationService {

	public void activate(String activationCode);
	public void add(User user);
}
