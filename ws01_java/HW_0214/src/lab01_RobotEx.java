public class lab01_RobotEx {
    public static void main(String[] args) {
        CleanArms R1 = new CleanArms(); //동작 : 1) HW_0214.CleanArms 객체 를 가지는 HW_0214.Robot 객체를 만듭니다.
        BattleArms R2 = new BattleArms(); //2) HW_0214.BattleArms 객체 를 가지는 HW_0214.Robot 객체를 만듭니다.
        R1.run(); //3) 첫번째 HW_0214.Robot 객체의 move() 함수를 호출 합니다.
        R2.run(); //4) 두번째 HW_0214.Robot 객체의 move() 함수를 호출 합니다.
    }
}

class Arms{
    int energy;
    public void run(){
        energy = energy -1;
    };
}

class CleanArms extends  Arms {
    public void run() {
        energy = energy -1;
        System.out.println("팔로 청소합니다.");
    };
}

class BattleArms extends  Arms {
    public void run() {
        energy = energy -1;
        System.out.println("팔로 전투를 합니다.");
    };
}

class Robot{
    Arms a;
    public void move(){
        a.run();
    };  //동적바인딩, 다형성
}