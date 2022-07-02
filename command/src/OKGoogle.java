public class OKGoogle {
    private Command command;

    // 기능들을 선택하는 곳
    public void setCommand(Command command){
        this.command = command;
    }

    // 객체 참조 없이 실행 가능, 기능들을 직접 호출하지 않음
    // 캡슐화한 command 인터페이스의 메서드를 호출
    public void talk(){
        command.run();
    }
}