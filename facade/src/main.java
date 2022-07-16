public class main {
    public static void main(String[] args){

        // facade 객체 생성
        Facade facade = new Facade();

        // 부를때 System01과 같은 서브 시스템의 복잡한 과정을 생각하지 않고 사용이 가능
        facade.process();
        facade.process2();
    }
}
