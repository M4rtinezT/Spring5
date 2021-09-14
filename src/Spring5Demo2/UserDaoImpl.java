package Spring5Demo2;

/**
 * @author TJ
 * @create 2021-0914 13:59
 */
public class UserDaoImpl implements UserDao{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
