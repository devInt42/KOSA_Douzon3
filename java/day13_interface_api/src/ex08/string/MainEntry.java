package ex08.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 9;
		String str = "abc";
		System.out.println("str : " + str);
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));

		char[] data = { 'k', 'b', 's' };
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println("kbs");

		String msg = "defgijklmn";
		System.out.println("korea " + msg);
		System.out.println(msg);

		String str2 = "abcdefghijklmn".substring(2);
		System.out.println(str2);

		str2 = "abcdefghijklmn".substring(2, 5); // 0부터 시작값 포함, 끝값 미포함
		System.out.println(str2);

		String s1 = new String("kosa");
		String s2 = new String("kosa");
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());

		String s3 = "seoul";
		String s4 = "seoul";

		if (s3 == s4)
			System.out.println("same");
		else
			System.out.println("not  same");
		System.out.println("=======================");
		if (s1 == s2)
			System.out.println("same");
		else
			System.out.println("not same");

		String xx = "abc";
		String yy = "kbs";
		System.out.println(xx + ", " + yy + ", " + yy.hashCode());	//
		yy= xx;
		System.out.println(xx + ", " + yy + ", " + yy.hashCode());	//
		yy = "mbc";
		System.out.println(xx + ", " + yy + ", " + yy.hashCode());
		xx = "korea";
		System.out.println(xx + ", " + yy + ", " + yy.hashCode());
		String z = "korea";
		System.out.println(xx + ", " + yy + ", " + z + ", " + yy.hashCode() + ", " + z.hashCode());
	}
}

class Point extends Object {

}
