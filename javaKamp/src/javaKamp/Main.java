package javaKamp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//test
		Instructor person1 = new Instructor(1,"Cantürk","Ataş",26,"atascanturk@gmail.com");
		Student person2 = new Student(2,"Ayça","Ataş",26,"atascanturk@gmail.com");
		Student person3 = new Student(3,"Eren","Ataş",10,"atascanturk@gmail.com");
		
		User[] users = {person1,person2,person3};
		
		for(User user:users) {
			System.out.println(user.getFirstName());
		}
		
		
		Course course1 = new Course();
		course1.setId(1);;
		course1.setName("Java & React");
		course1.setInstructor(person1);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setName("C# & Angular");
		course2.setInstructor(person1);
		
		Course[] courses = {course1,course2};
		
		for(Course course:courses) {
			System.out.println(course.getName());
		}
		
		UserManager userManager = new UserManager();
		userManager.AddUser(person1);
		userManager.UpdateUser(person1);
	}

}
