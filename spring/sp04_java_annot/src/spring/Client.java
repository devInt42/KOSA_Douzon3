package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {
	
	private String defaulthost;

	
	public Client() {
		System.out.println("Client Default Constructor");
	}
	
	public Client(String defaulthost) {
		super();
		this.defaulthost = defaulthost;
		System.out.println("Client ������ : " + this.defaulthost);
	}
	
	private String host;
	

	public void setDefaulthost(String defaulthost) {	// setter DI
		this.defaulthost = defaulthost;
	}

	public void setHost(String host) {
		this.host = host;
	}
		
	// �ʱ�ȭ �޼��� (�̺�Ʈ�� ���������� ������ �ڵ� ȣ�� : ȣ�����)
	// InitializingBean ���� ������
	// afterPropertiesSet : property injection �Ŀ�
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Client.afterPropertiesSet() ����");
	}
	
	// �Ҹ� �޼��� (�̺�Ʈ�� ���������� ������ �ڵ� ȣ�� : ȣ�����)
	// DisposableBean ���� ������
	
	@Override
	public void destroy() throws Exception { /* ctx.close(); */
		System.out.println("Client.destroy() ����");
	}

	public void send() { /* <property name = "host" value = "����" */
		System.out.println("Client.send() to : " + host);
	}
	
}