public class TestFactory {

    public static void main(String[] args) {
        Factory factory = new ComputerFactory();
        Computer pc = factory.get("pc","2 GB","500 GB","2.4 GHz");
        Computer server = factory.get("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }

}