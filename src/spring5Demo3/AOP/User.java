package spring5Demo3.AOP;

import org.springframework.stereotype.Component;

/**
 * @author TJ
 * @create 2021-0915 14:12
 */

//被增强类
@Component
public class User {
    public void add(){
        System.out.println("add.......");
    }
}
