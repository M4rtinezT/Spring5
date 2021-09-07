package ThreadTest;
/**
 * @author TJ
 * @create 2021-0713 13:28
 */
public class ThreadTest1{
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二十");
        t3.setName("窗口三十五");

        t2.start();
        t1.start();
        t3.start();
    }
}


class Window implements Runnable{
    public int ticket = 1000;

    @Override
    public void run() {
        while(true){
            show();
        }
    }
    public synchronized void show(){
        if(ticket > 0){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}