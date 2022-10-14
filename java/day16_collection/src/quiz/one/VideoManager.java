package quiz.one;

import java.util.HashMap;
import java.util.Set;

public class VideoManager extends Video {  // controller
	
	static HashMap<String, Video> map = new HashMap<String, Video>();
	static int top = 0;

	// 추가/ 출력 / 수정 / 삭제 / 종료
	public static void insert() {
		System.out.print("비디오 제목을 입력 하세요 : ");
		String title = sc.next();
		System.out.print("장르를 입력 하세요 : ");
		String category = sc.next();
		map.put(title, new Video(title, category));
		top++; // 비디오 개수 처리 변수
	} // insert() end

	public static void print() {
		System.out.println("보유하고 있는 비디오 개수 : " + top);  // map.size()
		System.out.println("비디오 제목 ---- 장르 ---- 대여정보 ---- 대여자 ---- 대여날짜");
		Set<String> set = map.keySet();

		for (String video : set) {
			String title = map.get(video).title;
			String category = map.get(video).category;
			String lend = map.get(video).lend;
			if (lend.equalsIgnoreCase("y")) {
				lend = "대여";
			} else {
				lend = "대여안함";
			} // if end

			String lendName = map.get(video).lendName;
			if (lendName == null)
				lendName = "정보 없음";

			String lendDate = map.get(video).lendDate;
			if (lendDate == null)
				lendDate = "정보 없음";

			System.out.println(title + "\t" + category + "\t" + lend + "\t" + lendName + "\t" + lendDate);
		} // for end
	} // print() end

	public static void modify() {
		System.out.print("변경하실 비디오 제목을 입력하세요 : ");
		String title = sc.next();
		String category = map.get(title).category;

		if (map.containsKey(title)) {
			map.put(title, new Video(title, category));
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("비디오 제목을 잘못 입력 하셨습니다. 해당 정보가 없습니다. ");
		} // if end
	} // modify() end

	public static void delete() {
		System.out.print("삭제하실 비디오 제목을 입력 해주세요. : ");
		String title = sc.next();
		if (map.containsKey(title)) {
			map.remove(title);
			System.out.println("삭제 되었습니다.");
			top--;
		} else {
			System.out.println("비디오 제목을 잘못 입력 하셨습니다. 해당 정보가 없습니다. ");
		}
	}
}
