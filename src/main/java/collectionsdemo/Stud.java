package collectionsdemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stud {
	private String name;
	private List<String> friends;
	private Set<String> address;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Stud(String name, List<String> friends, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.friends = friends;
		this.address = address;
		this.courses = courses;
	}
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
