package gameMaster.Concrete;

import gameMaster.Abstract.UserService;
import gameMaster.Entities.User;

public class UserManager implements UserService {

	@Override
	public void add(User[] users) {
		
		for (User user : users) {
			System.out.println("Kullanıcı eklendi: " + user.getFirstName() +" " + user.getLastName());
		}
			
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi: " + user.getFirstName() +" " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: " + user.getFirstName() +" " + user.getLastName());
		
	}

}
