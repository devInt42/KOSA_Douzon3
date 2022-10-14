package ex02stringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();   // 초기 용량  16
		
		System.out.println(sb.hashCode()); // 1521118594
		
		System.out.println("length         /                 capacity");
		int len = sb.length();		int size = sb.capacity();
		System.out.println(len + "           /          "+ size);
		System.out.println("-----------------------------------------");
		
		sb.append("kosa");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "           /          "+ size);
		System.out.println("-----------------------------------------");
		
		sb.append("121343245355 4958340do");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "           /          "+ size);
		System.out.println("-----------------------------------------");
		sb.append("121343245355 4958340do 34834832 ");
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "           /          "+ size);
		System.out.println("-----------------------------------------");
		System.out.println(sb.hashCode());  // 1521118594
		
		sb.trimToSize();  // 메모리 공간 사이즈에 맞게 재조정
		len = sb.length();		size = sb.capacity();
		System.out.println(len + "           /          "+ size);
		System.out.println("-----------------------------------------");
	}
}
