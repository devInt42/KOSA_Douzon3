package spring;

public class Client2 {
	
	private String host;

	public void setHost(String host) {   // DI
		this.host = host;
		System.out.println("Client2.setHost() call : " + host);
	}
	
	public void connect() throws Exception {
		System.out.println("Client2.connect() ����  - �ʱ�ȭ �޼ҵ�");
	}
	
	public void send() {
		System.out.println("Client2.send() call : " + host);
	}
	
	public void close() throws Exception {
		System.out.println("Client2.close() call  - �Ҹ� �޼ҵ�");
	}
}
