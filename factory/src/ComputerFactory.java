public class ComputerFactory extends Factory{

    // factory 클래스
    // input에 따라 인스턴스 리턴 값 달라짐
    @Override
    public Computer getComputer(String type, String ram,
                                       String hdd, String cpu) {
        switch (type) {
            case "pc":
                return new PC(ram, hdd, cpu);
            case "server":
                return new Server(ram, hdd, cpu);
            default:
                throw new RuntimeException(type.toString() +
                        " is not existed");
        }
    }
}
//        if("PC".equalsIgnoreCase(type))
//            return new PC(ram, hdd, cpu);
//        else if("Server".equalsIgnoreCase(type))
//            return new Server(ram, hdd, cpu);
//
//        return null;
