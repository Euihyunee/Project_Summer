package Handler;

public class LoggingRequestHandler extends RequestHandler{
    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request){
        System.out.println("요청을 Logging 합니다");
        super.handle(request);
    }
}
