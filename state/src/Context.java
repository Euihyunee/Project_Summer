public class Context {
    private State state;

    public Context() {
        // 초기값 엘리베이터 정지 상태
        this.state = StopState.getInstance();
    }

    // 상태 변경 메소드
    public void setState(State state) {
        this.state = state;
    }

    public void pushUpButton() {
        state.pushUpButton();
        this.setState(UpState.getInstance());
    }

    public void pushDownButton() {
        state.pushDownButton();
        this.setState(DownState.getInstance());
    }

    public void pushStopButton() {
        state.pushStopButton();
        this.setState(StopState.getInstance());
    }
}