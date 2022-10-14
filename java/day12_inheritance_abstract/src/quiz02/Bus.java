package quiz02;

public class Bus extends Trans {

	@Override
	public void Start() {
		System.out.println(name("버스") +"가 출발합니다. 릉부릉부!");

	}

	@Override
	public void Stop() {
		System.out.println(name("버스") +"가 멈춥니다.");

	}

}
