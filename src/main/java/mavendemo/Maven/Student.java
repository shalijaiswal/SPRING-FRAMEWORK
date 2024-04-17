package mavendemo.Maven;

public class Student {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("passing the id now");
		this.id = id;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		System.out.println("this is passing the name");
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
