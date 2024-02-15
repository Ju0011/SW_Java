package answer.lab03;

import lab03.Car;
import lab03.Sonata;

import java.util.ArrayList;

public class CarTest {
	static ArrayList<lab03.Car> cars = new ArrayList<lab03.Car>();

	public static void main(String[] args) {
		boolean isSuccess;
		isSuccess = addCar(new lab03.Sonata("nf001"));
		printMsg(isSuccess);
		isSuccess = addCar(new lab03.Sonata("nf002"));
		printMsg(isSuccess);
		isSuccess = addCar(new lab03.Sonata("ef001"));
		printMsg(isSuccess);
		isSuccess = addCar(new lab03.Sonata("nf002"));
		printMsg(isSuccess);
	}

	static lab03.Car searchCar(String id) {
		for (int i = 0; i < cars.size(); i++) {
			lab03.Car c = cars.get(i);
			// Car c=(Car)cars.get(i);
			if (c.id.equals(id)) {
				// id가 같은 car객체가 있으면 반환
				return c;
			}
		}
		return null; // id가 같은 car객체가 없으면 null 반환
	}

	static boolean addCar(lab03.Car c) {
		lab03.Car oldCar = searchCar(c.id);
		if (oldCar == null) {
			// c.id와 같은 car객체가 없는 경우만 cars에 저장
			return cars.add(c);// add 성공 시 true 반환됨.
		}
		return false; // add 하지 못한 경우 false 반환

	}

	static void printMsg(boolean flag) {
		if (flag)
			System.out.println(" 성공");
		else
			System.out.println(" 실패");
	}
}