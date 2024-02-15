//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Shape s = new Shape();  // 오류  abstract class의 객체 생성 못함.

    }
}


abstract class Shape{ //  객체가 될 만큼 충분한 정보 없는 클래스를 추상클래스로 생성
    abstract void draw();
    //추상메소드 : 구현할 만큼 충분한 정보가 없을 때 추상메소드로 생성
}
class Circle extends Shape{
    void draw() {   }
}
class Rectangle extends Shape{
    void draw() {   }
}