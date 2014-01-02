package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
	
	

	@Test
	public void testUserDao(){
		 ApplicationContext contex=new ClassPathXmlApplicationContext("resource/applicationContext.xml");
		 System.out.println(contex.getBean("userDao"));
	
	}
}
