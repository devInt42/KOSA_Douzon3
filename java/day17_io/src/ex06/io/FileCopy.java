package ex06.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {	//예외처리 위임
		//읽기 객체 - FileInputStream
		InputStream is =new FileInputStream("C:\\Users\\KOSA\\Pictures\\Saved Pictures\\common.jpg");
		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("C:\\더존비즈온\\data\\copy.jpg");
		
		long start = System.currentTimeMillis();	//시작 시간 저장
		
		while(true) {
			int inpuData = is.read();
			if(inpuData == -1) break;
			os.write(inpuData);
		}//end while
		
		long end = System.currentTimeMillis();
		System.out.println(end - start); //복사 (작업)에 걸린 시간
		
		is.close();os.close();
		System.out.println("copy Success");
	
	
	}
}
