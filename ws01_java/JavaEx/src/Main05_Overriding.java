public class Main05_Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();
    }
}

class Animal{
    void move(){
        System.out.println("Animal move");
    }
}
class Tiger extends Animal{
    void move(){
        //재정의 : 메소드 이름, 매개인자 타입, 갯수, 반환형이 같아야함
        //접근 제한자는 같거나 더 넓은 범위 가능
        System.out.println("Animal move");

    }

    // 다중정의 : 매개인자 타입이나 갯수가 다른 것. 메소드 이름은 같음
    void move(int i){}
    int move(int i, long l){
        return  0;
    }

}
