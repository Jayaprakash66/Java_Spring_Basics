package Has_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Personconfig.xml");
		Browser b1=(Browser)context.getBean("b1");
		System.out.println(b1);

	}

}
