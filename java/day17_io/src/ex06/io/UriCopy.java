package ex06.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		//읽기 객체
		InputStream is = url.openStream();
		//쓰기 객체
		OutputStream os = new FileOutputStream("C:\\\\더존비즈온\\\\data\\\\google.jpg");
	
		
		while(true) {
			int inpuData = is.read();
			if(inpuData == -1) break;
			os.write(inpuData);
		}//end while
		
		is.close();os.close();
		System.out.println("copy Success");
		
	}
}
