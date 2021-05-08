package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.core.services.SignUpService;
import eCommerce.core.utils.consts.Messages;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserDao userDao;
	private SignUpService signUpService;
	
	public AuthManager(UserDao userDao, SignUpService signUpService) {		
		this.userDao = userDao;
		this.signUpService = signUpService;
	}

	@Override
	public void login(String email, String password) {
		if(this.userDao.get(u -> u.getEmail() == email && u.getPassword() == password) != null) {
			System.out.println(Messages.userLoggedIn);
		}else {
			System.out.println(Messages.userEmailOrPasswordNotFound);
		}
		
	}

	@Override
	public void register(User user) {
		this.signUpService.register(user);
		
	}

}
