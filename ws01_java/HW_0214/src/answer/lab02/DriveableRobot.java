package answer.lab02;

import lab02.AutoParkable;
import lab02.Car;
import lab02.Driveable;

public class DriveableRobot implements lab02.Driveable {
	public void drive(Car r) {
		r.run();
		r.turnRight();
		r.turnLeft();
		r.stop();
		if (r instanceof lab02.AutoParkable) {
			lab02.AutoParkable a = (lab02.AutoParkable) r;
			a.autoPark();
		}
	}
}
