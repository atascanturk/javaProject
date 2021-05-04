package javaKamp;

public class UserManager  {
	public void AddUser (User user) {
		System.out.println(user.getFirstName()+" adında yeni bir kişi eklendi.");
	}
	
	public void UpdateUser (User user) {
		System.out.println(user.getFirstName()+" kullanıcısının bilgileri güncellendi.");
	}
}
