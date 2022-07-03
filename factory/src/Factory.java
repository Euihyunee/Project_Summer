abstract class Factory{
    public final Computer get(String type, String ram, String hdd, String cpu) {

        return this.getComputer(type, ram, hdd, cpu);
    }

    // factory 클래스
    // input에 따라 인스턴스 리턴 값 달라짐
    abstract public Computer getComputer(String type, String ram, String hdd, String cpu);
}