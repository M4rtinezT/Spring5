package spring5Demo5.test;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import spring5Demo5.service.UserService;

/**
 * @author TJ
 * @create 2021-0923 20:48
 */

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:spring5Demo5/bean1.xml")

@SpringJUnitConfig(locations = "classpath:spring5Demo5/bean1.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
