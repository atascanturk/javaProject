package eCommerce.business.abstracts;

import eCommerce.core.services.SignUpService;
import eCommerce.entities.concretes.User;

public abstract class SignUpManagerBase implements SignUpService {

	private UserService userService;

	public SignUpManagerBase(UserService userService) {		
		this.userService = userService;
	}
	
	
	
	//@override
	public void register(User user) {
		this.userService.add(user);
	}
}
