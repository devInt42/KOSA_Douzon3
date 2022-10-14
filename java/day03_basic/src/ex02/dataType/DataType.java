package ex02.dataType;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sh = -32768;		// -32768 ~ 32767
		int su = 32768;			
		
		su = sh; // 묵시적(자동) 형변환
		sh = (short)su; //명시적 형변환	-> 데이터 손실 발생  ( int 4byte에서 short 2byte로 변경했기때문)
		
		sh = (short)su;
		
		System.out.println(sh + ",  " + su);
		
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
		
		
		
		
	}

}
