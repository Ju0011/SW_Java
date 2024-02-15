package answer.lab02;

import lab02.Car;

public class Morning extends Car {
	public void run() { System.out.println("Morning 움직이기 시작"); }
	public void stop(){ System.out.println("Morning 정지"); }
	public void turnRight(){ System.out.println(  "45 의 각도로 Morning  오른쪽 회전"); }
	public void turnLeft(){ System.out.println(    "45의 각도로 “Morning  왼쪽 회전"); }
}