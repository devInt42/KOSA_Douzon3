package quiz02;

public abstract class Trans {
	String name = " ";
	abstract public void Start();

	abstract public void Stop();

	public String name(String name) {
		return name;
	}
}
