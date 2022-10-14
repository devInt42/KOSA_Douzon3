package quiz02;

public class Plane extends Trans {

	@Override
	public void Start() {
		System.out.println(name("비행기") +"가 출발합니다. Lady스 and Gentleman this is Captain 매버릭 speaking");

	}

	@Override
	public void Stop() {
		System.out.println(name("비행기") + "가 멈춥니다.");

	}

}
