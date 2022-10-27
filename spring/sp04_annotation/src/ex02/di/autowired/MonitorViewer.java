package ex02.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	// ���� ����(��ü)
	
	//1. member field ����
	/*
	@Autowired
	private Recorder  recorder;

	public Recorder getRecorder() {
		return recorder;
	}
	*/
	
	//2. setter �� ���� �ڵ� ����
	/*
	private Recorder  recorder;
	
	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	*/
	
	//3. �Ϲ� �޼ҵ带 ���� �ڵ� ����
	private Recorder  recorder;
	
	@Autowired
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("�����(�Ϲ�) �޼ҵ� �̿��� �ڵ� ����");
	}
	
	public void print() {
		System.out.println("user method ���� : " +  this.recorder);
		recorder.show();
	}
}








