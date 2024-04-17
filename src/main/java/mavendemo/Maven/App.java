package mavendemo.Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student obj=(Student) context.getBean("bean1");
        
        //Student obj1=(Student) context.getBean("bean2");
        System.out.println(obj);
        //System.out.println(obj1);
    }
}
