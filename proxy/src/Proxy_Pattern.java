// 적용 main문
public class Proxy_Pattern {
    public static void main(String args[]) {
        Image image1 = new Proxy_Image("test1.jpg");
        Image image2 = new Proxy_Image("test2.jpg");

        image1.displayImage();
        image2.displayImage();
    }
    // Real_Image를 만들어 주지 않았는데 돌아감
    // 결과에서 Real_Image클래스에 접근하지 않고
    // Proxy_Image클래스에서 객체를 생성하여 대신 일 수행
}