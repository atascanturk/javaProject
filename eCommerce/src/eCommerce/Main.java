package eCommerce;

import java.util.ArrayList;
import java.util.List;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserActivationService;
import eCommerce.business.abstracts.UserCheckService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.UserValidationService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.SignUpManager;
import eCommerce.business.concretes.UserActivationManager;
import eCommerce.business.concretes.UserCheckManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.UserValidationManager;
import eCommerce.business.serviceAdapters.GoogleCheckServiceAdapters;
import eCommerce.core.services.MailManager;
import eCommerce.core.services.MailService;
import eCommerce.dataAccess.abstracts.UserActivationDao;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.InMemoryUserActivationDao;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
	
		UserDao userDao = new InMemoryUserDao();
		UserValidationService userValidationService = new UserValidationManager();
		UserCheckService userCheckService =  (UserCheckService) new UserCheckManager(userDao);
		
		UserActivationDao userActivationDao = new InMemoryUserActivationDao();
		MailService mailService = new MailManager();	
		UserActivationService userActivationService = new UserActivationManager(userDao, userActivationDao, mailService);
		UserService userService = new UserManager(userDao,userValidationService,userCheckService,userActivationService);
		
		User user = new User(1,"Cantürk","Ataş","atascanturk@gmail.com","123456",false);
		
		
		AuthService authService = new AuthManager(userDao, new GoogleCheckServiceAdapters(userService));
		authService.register(user);
		
		userActivationService.activate("");
		
		authService.login("atascanturk@gmail.com", "123456");

	}

}
