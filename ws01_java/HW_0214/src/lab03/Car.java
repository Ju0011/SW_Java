package lab03;

class Car {
	String id;
	Car(String id) {
		this.id = id;
	}
	void run() {
		System.out.println("Car가 달린다");
	}

	//Getter
	public String getId(){
		return id;
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