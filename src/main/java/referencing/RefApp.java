package referencing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mavendemo.Maven.Student;

public class RefApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("referencing/refconfig.xml");
         A obj=(A) context.getBean("aref");
         System.out.println(obj.getX());
         System.out.println(obj.getOb().getY());

	}

}
