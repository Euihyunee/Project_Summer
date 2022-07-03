public abstract class Computer {

    // 추상 클래스, 인터페이스, 그냥 자바 클래스여도 상관없음
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}