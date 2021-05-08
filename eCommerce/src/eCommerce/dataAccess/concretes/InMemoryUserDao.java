package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	private List<User> userArrayList;

	public InMemoryUserDao() {
		this.userArrayList = new ArrayList<User>();
	}

	
	@Override
	public void add(User entity) {
		this.userArrayList.add(entity);
		System.out.println("Eklendi");

	}

	@Override
	public void update(User entity) {
		this.userArrayList.set(this.userArrayList.indexOf(entity), entity);

	}

	@Override
	public void delete(User entity) {
		this.userArrayList.remove(this.userArrayList.indexOf(entity));

	}

	@Override
	public User get(Predicate<User> predicate) {
		return this.userArrayList.stream().filter(predicate).findFirst().orElse(null);
	}

	@Override
	public List<User> getAll() {
		return this.userArrayList.stream().collect(Collectors.toList());
	}

	@Override
	public List<User> getAll(Predicate<User> predicate) {
		return this.userArrayList.stream().filter(predicate).collect(Collectors.toList());
	}

}