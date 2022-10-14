package ex04.staticMember;

class Atm {
	int count;
	static int total;

	public Atm(int amount) {	//constructor method
		count += amount;	//count = count + amount
		total += amount;
	}

	public static void view() {	// static method 에서는 일반 멤버 변수는 사용할 수 없다.
		total = total + 100;

	}

	public void display() {	// instance method에서는 둘다 사용 가능
		count = count + 200;
		total = total + 200;
		System.out.println("count = " + count);
		System.out.println("total = " + count);
	}

	public void show(int count, int total) {	
		this.count = count;
//		this.total = total;
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		System.out.println(at.count);
		System.out.println(Atm.total);
		at.display(); // c : 1000, t: 1000
		System.out.println("===============================");
		Atm at2 = new Atm(1000);
		at2.display(); // c : 1000, t: 2000
		System.out.println("===============================");
		Atm at3 = new Atm(1000);
		at3.display();

	}
}
