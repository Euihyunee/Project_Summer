public class DownState implements State {

    // 싱글톤으로 구현, 하나의 객체만 가지도록 함, 마로 발표 5번째꺼
    private DownState(){}

    public static DownState getInstance() {
        return DownStateHolder.instance;
    }
    private static class DownStateHolder{
        private static final DownState instance = new DownState();
    }

    @Override
    public void pushUpButton() {
        System.out.println("올라감");
    }

    @Override
    public void pushDownButton() {
        System.out.println("동작 없음");
    }

    @Override
    public void pushStopButton() {
        System.out.println("멈춤");
    }
}