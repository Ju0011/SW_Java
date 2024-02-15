public class Main07_Constructor {
    public static void main(String[] args) {
        Member m = new Member(90);
        System.out.println(m.i);
    }
}
class Member{
    int i = 10; //1) 초기화  문장 : 생성자보다 먼저 실행
    Member(int i){  //생성자
        this.i = i;
    }
}