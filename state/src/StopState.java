public class StopState implements State {

    // 싱글톤으로 구현, 하나의 객체만 가지도록 함, 마로 발표 5번째꺼
    private StopState(){}

    public static StopState getInstance() {
        return StopStateHolder.instance;
    }
    private static class StopStateHolder{
        private static final StopState instance = new StopState();
    }

    @Override
    public void pushUpButton() {
        System.out.println("올라감");
    }

    @Override
    public void pushDownButton() {
        System.out.println("내려감");
    }

    @Override
    public void pushStopButton() {
        System.out.println("동작 없음");
    }
}