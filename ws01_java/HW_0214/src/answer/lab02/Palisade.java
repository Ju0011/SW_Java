package answer.lab02;

import lab02.AutoParkable;
import lab02.Car;

public class Palisade  extends Car implements lab02.AutoParkable {
	public void run() { System.out.println("소나타가 움직이기 시작"); }
	public void stop(){ System.out.println("소나타가 정지"); }
	public void turnRight(){ System.out.println( getAngle() + " 의 각도로 소나타가 오른쪽 회전"); }
	public void turnLeft(){ System.out.println(  getAngle() + " 의 각도로  소나타가 왼쪽 회전"); }
	public void autoPark() { System.out.println("자동 주차 "); }
}
