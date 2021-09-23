package spring5Demo5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import spring5Demo5.config.TxConfig;
import spring5Demo5.service.UserService;

import java.applet.AppletContext;
import java.lang.management.PlatformLoggingMXBean;

/**
 * @author TJ
 * @create 2021-0917 15:09
 */
public class testUser {
    @Test
    public void testUser(){



        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring5Demo5/bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);


        userService.accountMoney();

    }
    @Test
    public void testGenericApplicationContext(){
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2.调用context的方法注册对象
        context.refresh();
        context.registerBean("user1",User.class,() -> new User());
        //3.获取在spring注册的对象
        User user1 = (User) context.getBean("user1");

    }
}
