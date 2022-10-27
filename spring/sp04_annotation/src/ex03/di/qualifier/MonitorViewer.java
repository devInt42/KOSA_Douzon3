package ex03.di.qualifier;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {

	private Recorder recorder;
	
	//@Inject     /*  Injection 되는 타입의 객체(bean)가 존재하지 않아도 Error 없이 실행 가능 */
	//public MonitorViewer( Recorder recorder) {
	@Autowired(required = false)
	public MonitorViewer(@Qualifier("cord") Recorder recorder) {
		this.recorder = recorder;
		System.out.println("@Autowired 자동 주입");
	}
	
	/*
	@Autowired
	public void setRecorder(@Qualifier("aa") Recorder recorder) {
		this.recorder = recorder;
		System.out.println("@Autowired 자동 주입");
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
