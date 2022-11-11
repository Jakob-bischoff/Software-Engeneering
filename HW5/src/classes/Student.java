package classes;

public class Student {
	private int id;
	private String name;

	public String getName() {
		return name;
	}
	//in case constructors do not count as operations
	//public Project getProject() {
	//	return project;
	//} 

	public Student(int id, String name, Project project) {
		this.id = id;
		this.name = name;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
}
