package ex03.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizeEx2 {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("사과=5|초콜렛=3|샴페인=1", "=|", true);

		while (token.hasMoreTokens()) {
//			  System.out.println(token.nextToken());

			String str = token.nextToken();
			
			if(str.equals("=")) System.out.println("\t");
			else if(str.equals("|")) System.out.println("\n");
			else System.out.println(str);
		}

		
	}
}
