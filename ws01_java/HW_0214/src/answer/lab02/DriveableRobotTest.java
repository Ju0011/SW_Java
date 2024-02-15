package answer.lab02;

import lab02.DriveableRobot;
import lab02.Morning;
import lab02.Palisade;

public class DriveableRobotTest  {
	public static void main(String[] args) {
		lab02.Palisade s = new lab02.Palisade() ;
		lab02.Morning m = new lab02.Morning() ;
		lab02.DriveableRobot drobot = new lab02.DriveableRobot();
		drobot.drive(s);
		drobot.drive(m);
	}
}
