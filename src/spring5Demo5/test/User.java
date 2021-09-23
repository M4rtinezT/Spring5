package spring5Demo5.test;

/**
 * @author TJ
 * @create 2021-0923 18:55
 */
public class User {
    public String id;

    public User(String id) {
        this.id = id;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                '}';
    }
}
