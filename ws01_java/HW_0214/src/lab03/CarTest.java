package lab03;

import java.util.ArrayList;
public class CarTest {
	static ArrayList<Car> cars = new ArrayList<Car>();

	public static void main(String[] args) {
		boolean isSuccess;
		isSuccess = addCar(new Sonata("nf001"));
		printMsg(isSuccess);

		isSuccess = addCar(new Sonata("nf002"));
		printMsg(isSuccess);

		isSuccess = addCar(new Sonata("ef001"));
		printMsg(isSuccess);

		isSuccess = addCar(new Sonata("nf002"));
		printMsg(isSuccess);
	}
	static Car searchCar(String id) {
		// cars 배열에 id가 같은 car객체가 있으면 반환
		for (Car car : cars) {
			if (car.getId().equals(id)) {
				return car;
			}
		}

		return null; // id가 같은 car객체가 없으면 null 반환

	}
	static boolean addCar(Car c) {
		// cars 배열에 c.id와 같은 car객체가 없는 경우만 cars에 저장
		// add 성공 시 true 반환됨.
		if (searchCar(c.getId()) == null) {
			cars.add(c);
			return true;
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