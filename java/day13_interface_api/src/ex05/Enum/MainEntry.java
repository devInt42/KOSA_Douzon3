package ex05.Enum;

public class MainEntry {
	// [ 접근지정자 ] enum 열거형이름 { 필요한 상수들 나열 }
	public enum UserStatus{
		PENDING,	//0번
		ACTIVE,		//1번
		INACTIVE,	//2번
		DELETE;		//3번
	}
	
	
	
	
	public static void main(String[] args) {
		//1.
		System.out.println(UserStatus.DELETE);
		
		//2.
		for(UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
	}
}
