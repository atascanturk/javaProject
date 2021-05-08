package eCommerce.business.abstracts;


import java.util.List;
import java.util.function.Predicate;




import eCommerce.core.utils.results.DataResultBase;
import eCommerce.core.utils.results.ResultBase;
import eCommerce.entities.concretes.User;

public interface UserService {

	ResultBase add(User user);
	ResultBase update(User user);
	ResultBase delete(User user);
	DataResultBase<User> get(Predicate<User> predicate);
	DataResultBase<List<User>> getAll();
	DataResultBase<List<User>> getAll(Predicate<User> predicate);

}
