public class Facade {

    private System01 system01;
    private System02 system02;
    private System03 system03;

    public Facade(){
        system01 = new System01();
        system02 = new System02();
        system03 = new System03();
    }

    public void process(){
        system01.process();
        system02.process();
        system03.process();
    }
    public void process2(){
        system01.process();
        system02.process();
    }
}

