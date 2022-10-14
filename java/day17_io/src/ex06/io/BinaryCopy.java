package ex06.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("C:\\Windows\\explorer.exe");
		File dist = new File("C:/더존비즈온/data/explorerCopy.dat"); // \\가 인식이 안되면 /로

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;

		try {
			fis = new FileInputStream(src); // 파일 입력 바이트 스트림 연결
			fos = new FileOutputStream(dist); // 파일 출력 바이트 스트림 연결
			bis = new BufferedInputStream(fis); // 버퍼 입력 스트림 연결
			bos = new BufferedOutputStream(fos); // 버퍼 출력 스트림 연결

			while ((c = bis.read()) != -1) {// not null인동안
				bos.write((char) c);
			} // while end
			System.out.println("파일 복사 성공!!!");
			bis.close();
			bos.close();
			fis.close();
			fos.close(); // 습관들이기
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("파일 복사 오류 발생!!");
			e.printStackTrace();
		}
	}
}
