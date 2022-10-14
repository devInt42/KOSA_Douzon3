package ex09_break_Continue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean flag = true;

		first: {
			second: {
				third: {
					int k = 100;
					System.out.println("Before the break");
					if (flag) break second;
					System.out.println("This won't execute");
				} // end third
		
		System.out.println("우리반 화이팅!");
			} // end second
		System.out.println("This is after second block");
		} // end first
	}
}
