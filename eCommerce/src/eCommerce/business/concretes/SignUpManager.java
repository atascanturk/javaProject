package eCommerce.business.concretes;

import eCommerce.business.abstracts.SignUpManagerBase;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.services.SignUpService;
import eCommerce.core.utils.RunTools;
import eCommerce.core.utils.consts.Messages;
import eCommerce.core.utils.results.ErrorResult;
import eCommerce.core.utils.results.ResultBase;
import eCommerce.core.utils.results.SuccessResult;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class SignUpManager extends SignUpManagerBase {

	public SignUpManager(UserService userService) {
		super(userService);
		
	}
			
}