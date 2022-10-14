package quiz02;

public class Bicycle extends Trans {

	@Override
	public void Start() {
		System.out.println(name("자전거") + "가 출발합니다. 엄복동 가즈아!");
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println(name("자전거") +"가 멈춥니다.");

	}

}
