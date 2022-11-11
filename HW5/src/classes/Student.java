package classes;

public class Student {
	private int id;
	private String name;

	public String getName() {
		return name;
	}
	
	public Project getProject() {
		return Project;
	}

	public Student(int id, String name, Project project) {
		this.id = id;
		this.name = name;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
}
