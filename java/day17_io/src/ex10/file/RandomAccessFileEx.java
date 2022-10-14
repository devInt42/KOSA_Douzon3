	package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("sample.txt", "rw");
	
		for(int i = 0 ; i <= 10; i++) {
			raf.seek(i*100);	//예외발생
			String str = "hello";
			raf.writeUTF(str);
		}
		
		for(int i = 0 ; i <= 10; i++) {
			raf.seek(i*100);	//예외발생
			System.out.println(raf.readUTF());;
		}
		
		System.out.println("success!!");
		raf.close();
	
	}

}
