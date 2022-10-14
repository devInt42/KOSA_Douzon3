package quiz02;

public class Subway extends Trans {

	@Override
	public void Start() {
		System.out.println(name("지하철") + "이 출발합니다. 이수역은 침수된 관계로 그냥 지나칩니다");

	}

	@Override
	public void Stop() {
		System.out.println(name("지하철") +"이 멈춥니다.");

	}

}
