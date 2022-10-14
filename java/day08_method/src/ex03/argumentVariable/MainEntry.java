package ex03.argumentVariable;

public class MainEntry {
	
	public static void plus(int... x) {  // 가변길이 배열
		int sum =0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	public static void plus(String... x) {  // 가변길이 배열
		String sum = "";
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		plus("kbs ", "mbs");
		plus("kbs ", "mbs", "sbs");
		plus("aa ", "mbs", "bb", "77", "123");
		
		plus(1,2,3,4,5,6,7,8,9,10);
		plus(1,2,3);
		plus(1,2,3,4,5,6,7);
	}


//	public static void plus(int x, int y, int z, int a, int b) {
//		int hap = x + y + z + a+ b;
//		System.out.println(hap);
//	}
//	
//	public static void plus(int x, int y, int z, int a, int b, int c, int d) {
//		int hap = x + y + z + a+ b+c+d;
//		System.out.println(hap);
//	}
//	
//	private static void plus(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r) {
//		// TODO Auto-generated method stub
//		
//	}

}





