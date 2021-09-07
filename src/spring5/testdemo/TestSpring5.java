package spring5.testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.Orders;
import spring5.User;

/**
 * @author TJ
 * @create 2021-0701 14:19
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5/bean1.xml");
        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        System.out.println(user.getuName());
    }
    @Test
    public void testConstructor(){
        //1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5/bean2.xml");
        //2 获取配置创建的对象
        Orders orders = context.getBean("ordersA", Orders.class);
        System.out.println(orders);
        orders.orderTest();
    }
    @Test
    public void testCollection(){
        //1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5/bean3.xml");
        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
