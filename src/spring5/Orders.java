package spring5;

/**
 * @author TJ
 * @create 2021-0714 13:50
 */
public class Orders {
    private String oName;
    private String address;

    public Orders(String oName, String address) {
        this.oName = oName;
        this.address = address;
    }
    public void orderTest(){
        System.out.println(oName +"::"+ address);
    }

}
