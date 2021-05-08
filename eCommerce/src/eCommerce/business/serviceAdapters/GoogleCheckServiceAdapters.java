package eCommerce.business.serviceAdapters;

import eCommerce.business.abstracts.SignUpManagerBase;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.services.GoogleCheckManager;
import eCommerce.core.services.GoogleCheckService;
import eCommerce.core.services.UserCheckService;
import eCommerce.core.utils.consts.Messages;
import eCommerce.entities.concretes.User;

public class GoogleCheckServiceAdapters  extends SignUpManagerBase {
	
	
	public GoogleCheckServiceAdapters(UserService userService) {
		super(userService);		
	}

	
	
	@Override
	public void register(User user) {
		GoogleCheckManager googleSignUpManager = new GoogleCheckManager();
		boolean result = googleSignUpManager.login(user.getEmail());
		if(result) {
			super.register(user);
			System.out.println(Messages.googleSignUpSuccessful);
		}else {
			System.out.println(Messages.googleSignUpFailed);
		}
	}

}
