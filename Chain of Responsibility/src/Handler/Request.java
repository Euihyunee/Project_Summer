package Handler;

// 요청인 Request 객체
public class Request {
    String body;

    // 생성자
    public Request(String body){
        this.body = body;
    }
    // body 반환
    public String getBody(){
        return body;
    }
}
