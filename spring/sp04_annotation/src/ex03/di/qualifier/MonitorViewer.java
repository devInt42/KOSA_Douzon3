package ex03.di.qualifier;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {

	private Recorder recorder;
	
	//@Inject     /*  Injection �Ǵ� Ÿ���� ��ü(bean)�� �������� �ʾƵ� Error ���� ���� ���� */
	//public MonitorViewer( Recorder recorder) {
	@Autowired(required = false)
	public MonitorViewer(@Qualifier("cord") Recorder recorder) {
		this.recorder = recorder;
		System.out.println("@Autowired �ڵ� ����");
	}
	
	/*
	@Autowired
	public void setRecorder(@Qualifier("aa") Recorder recorder) {
		this.recorder = recorder;
		System.out.println("@Autowired �ڵ� ����");
	} 
	*/
	
	/*
	@Autowired
	//@Qualifier("recorder1")  // id="recorder1"
	//@Qualifier("key")  //  <qualifier value="key" />
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	} 
	*/
	
	public void show() {
		recorder.show();
		System.out.println("MonitorViewer  show method call~~~");
	}
}
