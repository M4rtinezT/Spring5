package spring5Demo3.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5Demo3.AOP.User;

/**
 * @author TJ
 * @create 2021-0915 14:35
 */
public class testAop {
    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5Demo3/bean1.xml");

        User user = context.getBean("user", User.class);
        user.add();
    }

}
