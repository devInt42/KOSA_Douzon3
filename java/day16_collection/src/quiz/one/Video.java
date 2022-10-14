package quiz.one;

import java.text.SimpleDateFormat;
import java.util.*;
 
public class Video {  // model
	protected  String title;     //비디오 제목
	protected  String category;  // 장르
	protected  String lend;   // 대여여부
	protected  String lendName;  //대여자(고객명)
	protected  String lendDate;   // 대여날짜(오늘날짜)
	
	static Scanner sc = new Scanner(System.in);
	
	public Video() { }

	public Video(String title, String category) {
		this.title = title;
		this.category = category;
		System.out.print("대여 여부를 입력하세요. ( Y / N ) : ");
		this.lend = sc.next();
		if( this.lend.equalsIgnoreCase("y") ) {
			System.out.print("대여자(고객명)을 입력하세요 : ");
			this.lendName = sc.next();
			this.lendDate = todayDate();
		}
	} // constructor end

	public String todayDate() {
		Calendar  cal = Calendar.getInstance(); // 시스템이 갖고 있는 날짜 얻어옴
		Date day = cal.getTime();
		SimpleDateFormat  today = new SimpleDateFormat("yy-MM-dd  EEEE");
		
		return today.format(day);
	}
	
	public void input(String title){ }
}
