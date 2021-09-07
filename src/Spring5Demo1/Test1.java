package Spring5Demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author TJ
 * @create 2021-0722 14:31
 */
public class Test1 {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring5Demo1/bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
