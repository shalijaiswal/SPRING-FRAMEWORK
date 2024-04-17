package mvc;

public class DemoMVCPattern {

	public static void main(String[] args) {
		Student model=retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model,view);
		controller.updateView();
		controller.setStudentRollNum("33");
		controller.updateView();
	
	}// TODO Auto-generated method stub
		private static Student retrieveStudentFromDatabase() {
			
		Student student=new Student();
		student.setName("shalini");
		student.setRollNo("22");
		return student;
		}
	}

	

