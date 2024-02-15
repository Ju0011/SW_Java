public class Main10_hiding_overriding {
    public static void main(String[] args) {
        CC one = new CC(); System.out.println(one.p);
        one.mp();
    }
}
class P{
    int p = 10;
    void mp(){  System.out.println("mp");  }
}
class CC extends P{
    int p = 20;// 은닉(부모의 p)
    void mp(){
        System.out.println(p); // 현재 클래스의 변수
        System.out.println(super.p); // 은닉된 부모의 p
        super.mp(); // 부모의 mp()
        System.out.println("mCCCCC");}//재정의
}