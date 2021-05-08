package eCommerce.business.concretes;


import eCommerce.business.abstracts.UserCheckService;
import eCommerce.core.utils.RunTools;
import eCommerce.core.utils.consts.Messages;
import eCommerce.core.utils.results.ErrorResult;
import eCommerce.core.utils.results.ResultBase;
import eCommerce.core.utils.results.SuccessResult;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

private UserDao userDao;
	
	public UserCheckManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void check(User user) throws Exception  {
		ResultBase[] results = RunTools.runChecks(this.checkDuplicateEmail(user.getEmail()));
		
		for (ResultBase result : results) {
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
	}
	
	private ResultBase checkDuplicateEmail(String email) {
		if(this.userDao.get(u -> u.getEmail() == email) != null) {
			return new ErrorResult(Messages.emailAlreadyExists);
		}
		
		return new SuccessResult();
	}
	
}