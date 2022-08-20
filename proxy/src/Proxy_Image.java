public class Proxy_Image implements Image {
    private String fileName;
    private Real_Image realImage;

    // 생성자
    public Proxy_Image(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        // realImage객체가 없으면 여기서 생성하여 대신 일 수행
        if (realImage == null) {
            realImage = new Real_Image(fileName);
        }
        realImage.displayImage();
    }
}