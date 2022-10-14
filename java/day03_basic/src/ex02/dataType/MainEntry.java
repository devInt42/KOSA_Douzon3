package ex02.dataType;

public class MainEntry {
	public static void main(String[] args) {
		char ch = 'A';
		int num = 9; // 10진수
		int oNum1 = 0x9; // 0x숫자 16진수
		int xNum2 = 011; // 0숫자 8진수
		int bNum = 0b1011011; //2진수 0b숫자
		
		
		System.out.println(ch + "ASCII code =" + (int)ch);	//ASCII 로 변화 (int)변수 이런식으로
		System.out.println(oNum1 + "," + xNum2 + "," +bNum);
		
	}
}
