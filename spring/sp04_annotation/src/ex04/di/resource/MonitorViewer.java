package ex04.di.resource;

import javax.annotation.Resource;

public class MonitorViewer {
	
	private Recorder  recorder;  // member field
	
	@Resource
	//@Resource(name = "y")
	//@Resource(name = "r1")
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		
		//String record = Resource.class.getTypeName().equals("record1");
		if( Resource.class.getTypeName().equals("record1") ) {
			System.out.println("@Resource 주입 - 1111");
		} else if( Resource.class.getTypeName().equals("record2") ) {
			System.out.println("@Resource 주입 - 222");
		} else if( Resource.class.getTypeName().equals("record3") ) {
			System.out.println("@Resource 주입 - 333");
		} else {
			System.out.println("@Resource 주입에 이름이 없어요!!!");
		} // end if
		
		System.out.println("@Resource 주입");
	}
	
	
}
