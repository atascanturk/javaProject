package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserValidationService {
	public void validate(User user) throws Exception;
}
