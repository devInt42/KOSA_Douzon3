package quiz;

public class MainEntry {
	public static void main(String[] args) {
		String str = "abcDEFGHeijwEIMPYmnqr";
		caseTest(str);
		System.out.println(caseTest(str));
	}

	public static String caseTest(String str) {
		String res = "";
		for (char i : str.toCharArray()) {
			if (i >= 'a' && i <= 'z')
				res += Character.toUpperCase(i);
			if (i >= 'A' && i <= 'Z')
				res += Character.toLowerCase(i);
		}
		return res;
	}
}
