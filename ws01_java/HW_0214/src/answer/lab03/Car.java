package answer.lab03;

class Car {
	String id;
	Car(String id) {
		this.id = id;
	}
	void run() {
		System.out.println("Car가 달린다");
	}
}
class Sonata extends Car {
	Sonata(String id) {
		super(id);
	}
	void run() {
		System.out.println("소나타가 달린다");
	}
}