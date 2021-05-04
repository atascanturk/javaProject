package javaKamp;

public class Course  {
 int id;
 private String name;
 private Instructor instructor;
	
 public Course() {
	 
 }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Instructor getInstructor() {
	return instructor;
}

public void setInstructor(Instructor instructor) {
	this.instructor = instructor;
}
}
