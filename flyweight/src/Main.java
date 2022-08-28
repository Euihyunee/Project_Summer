public class Main {
    public static void main(String[] args){
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        for(int i = 0; i< 10; i++){
            Circle circle = (Circle)ShapeFactory.getCircle(colors[(int)(Math.random()*4)]);
            circle.setX((int)(Math.random()*100));
            circle.setY((int)(Math.random()*4));
            circle.setRadius((int)(Math.random()*10));
            circle.draw();
        }
    }
}
/* 실행 결과!!
=== 새로운 객체 생성 : Yellow색 원 ===
Circle [color = Yellow, x=47, y=1, radius=4]
=== 새로운 객체 생성 : Green색 원 ===
Circle [color = Green, x=83, y=2, radius=2]
=== 새로운 객체 생성 : Blue색 원 ===
Circle [color = Blue, x=78, y=2, radius=6]
Circle [color = Green, x=53, y=2, radius=7]
=== 새로운 객체 생성 : Red색 원 ===
Circle [color = Red, x=12, y=0, radius=8]
Circle [color = Green, x=47, y=0, radius=5]
Circle [color = Blue, x=59, y=0, radius=5]
Circle [color = Blue, x=82, y=1, radius=9]
Circle [color = Yellow, x=67, y=3, radius=4]
Circle [color = Green, x=43, y=0, radius=0]
 */