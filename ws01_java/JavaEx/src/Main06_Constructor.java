public class Main06_Constructor {
    public static void main(String[] args) {
        //Emp one = new Emp(); 오류남 : 무인자 생성자를 호출 전
        Emp two = new Emp(); // 무인자 생성자를 호출
        Emp one = new Emp("박주영");
    }
}

class Emp{
    String name;
    //생성자가 아예 없으면 무인자 생성자 자동생성됨. Emp() {} //무인자 생성
    //생성자가 하나라도 있으면 무인자 생성자는 자동생성 안됨
    Emp(String name){this.name = name;}
    Emp( ){ } //생성자 다중정의 (매개인자 갯수와 타입만 다르면)
}
