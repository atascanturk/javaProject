package eCommerce.business.concretes;



import java.util.List;
import java.util.function.Predicate;

import eCommerce.business.abstracts.UserActivationService;
import eCommerce.business.abstracts.UserCheckService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.UserValidationService;
import eCommerce.core.utils.results.DataResultBase;
import eCommerce.core.utils.results.ResultBase;
import eCommerce.core.utils.results.SuccessDataResult;
import eCommerce.core.utils.results.SuccessResult;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

    UserDao userDao;
    private UserValidationService userValidationService;
	private UserCheckService userCheckService;
	private UserActivationService userActivationService;
	
	

	public UserManager(UserDao userDao, UserValidationService userValidationService, UserCheckService userCheckService,
			UserActivationService userActivationService) {
		
		this.userDao = userDao;
		this.userValidationService = userValidationService;
		this.userCheckService = userCheckService;
		this.userActivationService = userActivationService;
	}

	public ResultBase add(User user) {
		boolean thrown = false;
		try {
			this.userValidationService.validate(user);
			this.userCheckService.check(user);
			
			
		} catch (Exception e) {
			thrown = true;
			e.printStackTrace();
		} finally {

			if(!thrown) {
				this.userDao.add(user);
				System.out.println("User created : " + user.toString());
				this.userActivationService.add(user);
			}	
		}
		return new SuccessResult("Eklendi");
	}

	@Override
	public ResultBase update(User user) {
		try {
			this.userValidationService.validate(user);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		this.userDao.update(user);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public ResultBase delete(User user) {
		this.userDao.delete(user);
		return new SuccessResult("Silindi");
	}

	@Override
	public DataResultBase<User> get(Predicate<User> predicate) {
		
		return new SuccessDataResult<User>(this.userDao.get(predicate),"Kayıt başarıyla getirildi.");
	}

	@Override
	public DataResultBase<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.getAll(),"Kayıt başarıyla getirildi.");
	}

	@Override
	public DataResultBase<List<User>> getAll(Predicate<User> predicate) {
		return new SuccessDataResult<List<User>>(this.userDao.getAll(predicate),"Kayıt başarıyla getirildi.");
	}

}
