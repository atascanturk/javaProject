package eCommerce.core.services;

import eCommerce.entities.concretes.User;

public class GoogleCheckService  {
	
	private User user;
	
	public GoogleCheckService(User user) {
		super();
		this.user = user;
	}

	public boolean login(User user) {
		user.setActive(true);
		
		return true;
	}
	
}
