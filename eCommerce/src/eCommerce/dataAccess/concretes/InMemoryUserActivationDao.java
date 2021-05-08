package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import eCommerce.core.crudOperations.EntityCrudBase;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;
import eCommerce.entities.concretes.UserActivation;

public class InMemoryUserActivationDao implements eCommerce.dataAccess.abstracts.UserActivationDao {

private List<UserActivation> userActivationList;
	
	public InMemoryUserActivationDao() {
		this.userActivationList = new ArrayList<UserActivation>();
	}

	@Override
	public void add(UserActivation entity) {
		
		this.userActivationList.add(entity);
	}

	@Override
	public void update(UserActivation entity) {
		this.userActivationList.set(this.userActivationList.indexOf(entity),entity);
		
	}

	@Override
	public void delete(UserActivation entity) {
		this.userActivationList.remove(this.userActivationList.indexOf(entity));
		
	}

	@Override
	public UserActivation get(Predicate<UserActivation> predicate) {
		return this.userActivationList.stream().filter(predicate).findFirst().orElse(null);
	}

	@Override
	public List<UserActivation> getAll() {
		return this.userActivationList.stream().collect(Collectors.toList());
	}

	@Override
	public List<UserActivation> getAll(Predicate<UserActivation> predicate) {
		return this.userActivationList.stream().filter(predicate).collect(Collectors.toList());
	}


}
