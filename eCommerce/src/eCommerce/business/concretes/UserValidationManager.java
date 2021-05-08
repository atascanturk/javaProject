package eCommerce.business.concretes;

import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserValidationService;
import eCommerce.core.utils.RunTools;
import eCommerce.core.utils.consts.Messages;
import eCommerce.core.utils.results.ErrorResult;
import eCommerce.core.utils.results.ResultBase;
import eCommerce.core.utils.results.SuccessResult;
import eCommerce.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	public UserValidationManager() {

	}

	@Override
	public void validate(User user) throws Exception {
		// TODO Auto-generated method stub

		ResultBase[] results = RunTools.runValidationRules(this.checkFirstNameNotNull(user.getFirstName()),
				this.checkLastNameNotNull(user.getLastName()), this.checkEmailNotNull(user.getEmail()),
				this.checkPasswordNotNull(user.getPassword()), this.checkPasswordMinLength(user.getPassword()),
				this.checkEmailIsValid(user.getEmail()), this.checkFirstNameMinLength(user.getFirstName()),
				this.checkLastNameMinLength(user.getLastName()));
		for (ResultBase result : results) {
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
	}



	private ResultBase checkFirstNameNotNull(String firstName) {
		if (firstName.isEmpty() || firstName == null) {
			return new ErrorResult(Messages.firstNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

	private ResultBase checkLastNameNotNull(String lastName) {
		if (lastName.isEmpty() || lastName == null) {
			return new ErrorResult(Messages.lastNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

	private ResultBase checkEmailNotNull(String email) {
		if (email.isEmpty() || email == null) {
			return new ErrorResult(Messages.emailCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

	private ResultBase checkPasswordNotNull(String password) {
		if (password.isEmpty() || password == null) {
			return new ErrorResult(Messages.passwordCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

	private ResultBase checkPasswordMinLength(String password) {
		if (password.length() < 6) {
			return new ErrorResult(Messages.passwordLeastCharacter.replace("`n`", "6"));
		}
		return new SuccessResult();
	}

	private ResultBase checkEmailIsValid(String email) {
		String regexString = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		if (!Pattern.compile(regexString).matcher(email).matches()) {
			return new ErrorResult(Messages.emailNotValid);
		}
		return new SuccessResult();
	}

	private ResultBase checkFirstNameMinLength(String firstName) {
		if (firstName.length() < 2) {
			return new ErrorResult(Messages.firstNameLeastCharacter);
		}
		return new SuccessResult();
	}

	private ResultBase checkLastNameMinLength(String lastName) {
		if (lastName.length() < 2) {
			return new ErrorResult(Messages.lastNameLeastCharacter);
		}
		return new SuccessResult();
	}

}