package answer.lab01;

class Arms{
	int energy ;
	public void run() {
		energy=energy - 1 ;
	}
}
class CleanArms extends Arms{
	public void run() {
		super.run();
		System.out.println("팔로 청소를 합니다.");
	}
}
class BattleArms extends Arms{
	public void run() {
		super.run();
		System.out.println("팔로 전투를 합니다.");
	}
}
class Robot{
	Arms a;
	public void move(){
		a.run();
	}
}
public class RobotEx {
	public static void main(String[] args) {
		CleanArms ca = new CleanArms();
		Robot r1 = new Robot();
		r1.a = ca;

		BattleArms ba = new BattleArms();
		Robot r2 = new Robot();
		r2.a = ba;

		r1.move();
		r2.move();
	}
}