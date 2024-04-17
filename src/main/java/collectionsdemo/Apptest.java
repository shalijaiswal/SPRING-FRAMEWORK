package collectionsdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Apptest {
	public static void main(String args[])
	{
	ApplicationContext context=	new ClassPathXmlApplicationContext("collectionsdemo/config.xml");
	Stud obj=(Stud) context.getBean("beanssj");
	System.out.println(obj.getName());
	System.out.println(obj.getAddress());
	System.out.println(obj.getFriends());
	System.out.println(obj.getCourses());
	}

}
