package ex05.Enum;


public class MainEntry {
	
	// [접근지정자] enum 열거형이름 { 필요한 상수들 나열,.....}
	public enum UserStatus {
		PENDING,
		ACTIVE,
		INACTIVE,
		DELETE ;
	}
	
	public static void main(String[] args) {
		//1.
		System.out.println(UserStatus.DELETE);
		System.out.println("--------------------------");
		
		//2.
		for (UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
	}
}
