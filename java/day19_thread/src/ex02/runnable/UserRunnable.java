package ex02.runnable;

public class UserRunnable implements Runnable {
	
	String name;
	
	public UserRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {   // 스레드 실행부(구현부)
//		System.out.println("runnable run() call~");
		
		for (int i = 1; i <=10; i++) {
			if( i == 4 ) {
				try {
					Thread.sleep(1000);  // 예외발생,  1/1000 <=== 1초 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}  
				System.out.println(name);
			} //  if end
		
			System.out.println(i);
		}  // for end
	}

}
