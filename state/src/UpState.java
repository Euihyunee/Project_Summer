public class UpState implements State {

    // 싱글톤으로 구현, 하나의 객체만 가지도록 함, 마로 발표 5번째꺼
    private UpState(){}

    public static UpState getInstance() {
        return UpStateHolder.instance;
    }
    private static class UpStateHolder{
        private static final UpState instance = new UpState();
    }

    @Override
    public void pushUpButton() {
        System.out.println("동작 없음");
    }

    @Override
    public void pushDownButton() {
        System.out.println("내려감");
    }

    @Override
    public void pushStopButton() {
        System.out.println("멈춤");
    }
}