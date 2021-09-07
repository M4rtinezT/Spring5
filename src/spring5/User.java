package spring5;

/**
 * @author TJ
 * @create 2021-0701 14:14
 */
public class User {
    private String uName;
    public void add(){
        System.out.println("add.......");
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuName() {
        return uName;
    }

    public static void main(String[] args) {
        String[] ans = new String[]{"asdasd",null};
        System.out.println(ans[1]);
    }
}
