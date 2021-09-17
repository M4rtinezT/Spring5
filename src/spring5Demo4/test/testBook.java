package spring5Demo4.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5Demo4.entity.Book;
import spring5Demo4.service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TJ
 * @create 2021-0915 19:58
 */
public class testBook {
    @Test
    public void testJDBCTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5Demo4/bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> list = new ArrayList<>();

        Object[] o1 = {"7"};
        Object[] o2 = {"8"};
        Object[] o3 = {"9"};
        list.add(o1);
        list.add(o2);
        list.add(o3);

        bookService.batchDelete(list);

    }
}
