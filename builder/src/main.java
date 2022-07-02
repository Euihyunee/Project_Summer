import Java.Builder.Computer;
import Java.Singleton.Singleton;

public class main {
    public static int num = 1;
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setisGpuEnabled(true)
                .build();
        System.out.println(comp.getHDD());
        System.out.println(comp.getRAM());
        System.out.println(comp.isGpuEnabled());
        System.out.println(comp.isBluetoothEnabled());

        Runnable run = () -> {
            num++;
            Singleton singleton = Singleton.getInstance();
            System.out.println("instance : " + singleton.getMsg());
        };
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(run);
            thread.start();
        }
    }
}