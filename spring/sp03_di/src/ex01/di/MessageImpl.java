package ex01.di;

public class MessageImpl implements IMessage {
	
	private String name, greeting;
	
	//1. constructor(생성자)이용 <---------- DI
	public MessageImpl() { }
	public MessageImpl(String name, String greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}
	//2. setter method <-------- DI
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello() {
	System.out.println(greeting + " / " + name + "!!!!");
		
	}

}
