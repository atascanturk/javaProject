package javaKamp;

public class Instructor extends User  {

	private String instructorNumber = "INS" + this.getId();

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(int id, String firstName, String lastName, int age, String mail) {
		super(id, firstName, lastName, age, mail);
		// TODO Auto-generated constructor stub
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}
	
}
