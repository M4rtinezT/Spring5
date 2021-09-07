package Spring5Demo1;

import org.springframework.stereotype.Component;

/**
 * @author TJ
 * @create 2021-0722 14:36
 */
@Component(value = "user") //value默认为类名称首字母小写
public class User {
    public void add(){
        System.out.println("add....");
    }
}
