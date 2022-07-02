package Java.Singleton;

public class Singleton {
    //선언과 동시에 초기화
    private static Singleton instance = new Singleton(0);
    private int msg;

    private Singleton(int msg) {
        try {
            Thread.sleep(100);
            this.msg = msg;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Singleton getInstance() {
        return instance;
    }
    public int getMsg() {
        return msg;
    }
}