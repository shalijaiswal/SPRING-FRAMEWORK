package autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiring/autoconfig.xml");
		Emp employee=(Emp) context.getBean("emp1");
		System.out.println(employee);
	}

}
