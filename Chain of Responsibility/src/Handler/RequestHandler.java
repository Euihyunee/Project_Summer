package Handler;

// handler임
// 다음 필터로 이어지는 추상 클래스가 필요하기 때문에 interface가 아닌 추상 클래스로 만듬
public abstract class RequestHandler {
    private RequestHandler nextHandler;

    // 생성자
    public RequestHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    // nextFilter가 없을 경우 정지 있으면 실행
    // 다음 filter로 넘어가는 부분
    public void handle(Request request){
        if(nextHandler != null)
            nextHandler.handle(request);
    }
}
