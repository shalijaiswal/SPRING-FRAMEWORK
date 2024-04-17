package mvc;

public class StudentController {
//model object
	//view object
	private Student model;
	private StudentView view;
//role of constructor to receive model object and view object and assign to local properties	
public StudentController(Student model,StudentView view)
{
	this.model=model;
	this.view=view;
}
//control model object
public void setStudentName(String name) {
	model.setName(name);
	
}
public void setStudentRollNum(String rollNo) {
	model.setRollNo(rollNo);
	
}
public String getStudentrno() {
	return model.getRollNo();
	
}
public String getStudentName() {
	return model.getName();
}


//control view object
public void updateView()
{
	view.printStudentDetails(model.getName(), model.getRollNo());}
}
