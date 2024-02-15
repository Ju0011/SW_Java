public class Main08_Constructor {
    public static void main(String[] args) {
        Child c = new Child();  // parent, child 모두 출력됌
    }
}

class Parent{
    Parent(){ System.out.println("Parent() 생성자"); }
    Parent(int i){ System.out.println("Parent(int i) 생성자"); }
}
class Child extends  Parent{  // 부모의 무인자 생성자를 디폴트로 호출
    Child(){
        //super(); //부모의 무인자 생성자 호출
        super(10 ) ; //Parent(int i) 호출
        System.out.println("Child() 생성자");
    }
}
