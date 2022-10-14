package quiz2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.io.*;

public class BmiManager extends BMI {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<BMI> Bmi_list = new ArrayList<BMI>();
	static HashMap<String, ArrayList<BMI>> map = new HashMap<String, ArrayList<BMI>>();
	FileManager FM;
	static int top = 0;
	static int bmiNo = 0;

	static void input() {
		BMI bmi = new BMI();
		int no = bmiNo;
		bmi.setNo(no);
		System.out.println("측정자 이름을 입력하세요 : ");
		String name = sc.next();
		bmi.setName(name);
		System.out.println("측정자 몸무게를 입력하세요 : ");
		int weight = sc.nextInt();
		bmi.setWeight(weight);

		System.out.println("측정자 신장을 입력하세요 : ");
		int height = sc.nextInt();
		bmi.setHeight(height);

		System.out.println("측정자 성별을 입력하세요 : ");
		String sex = sc.next();
		bmi.setSex(sex);
		double obesity;
		if (bmi.getSex().equals("남")) {
			obesity = (double) weight / (((double) height / 100) * (0.9) * ((double) height / 100) * (0.9));
		} else {
			obesity = (double) weight / (((double) height / 100) * (0.85) * ((double) height / 100) * (0.85));
		}

		bmi.setObesity(obesity);
		String res;
		if (bmi.getObesity() < 18.5) {
			res = "저체중";
		} else if (bmi.getObesity() >= 18.5 && bmi.getObesity() < 23) {
			res = "정상";
		} else if (bmi.getObesity() >= 23 && bmi.getObesity() < 25) {
			res = "과체중";
		} else {
			res = "비만";
		}
		bmi.setRes(res);
		Bmi_list.add(bmi);
		map.put(name, Bmi_list);
		top++;
		bmiNo++;
	}// input()

	static void delete() {
		System.out.print("삭제하실 측정자의 번호를 입력 해주세요. : ");
		disp();
		int index = sc.nextInt();
		if (index < Bmi_list.size()) {
			Bmi_list.remove(index);
			System.out.println("삭제 되었습니다.");
			top--;
		} else {
			System.out.println("측정자의 이름을 잘못 입력 하셨습니다. 해당 정보가 없습니다. ");
		}
	}

	static void modify() {
		System.out.println("수정할 측정자의 번호를 입력 해주세요. : ");
		disp();
		int index = sc.nextInt();
		if (index < Bmi_list.size()) {
			Bmi_list.remove(index);
			input();
		} else {
			System.out.println("번호를 잘못 입력하셨습니다. ");
		}
	}

	static void disp() {
		System.out.println("총 측정자 수 : " + top); // map.size()
		System.out.println("번호---이름--- 키 -몸무게 - 성별 ---- 비만도---결과");
		for (int i = 0; i < Bmi_list.size(); i++) {
			System.out.print(Bmi_list.get(i).getNo() + "\t");
			System.out.print(Bmi_list.get(i).getName() + "\t");
			System.out.print(Bmi_list.get(i).getHeight() + "\t");
			System.out.print(Bmi_list.get(i).getWeight() + "\t");
			System.out.print(Bmi_list.get(i).getSex() + "\t");
			System.out.printf("%.3f ", Bmi_list.get(i).getObesity());
			System.out.printf(" %s\n", Bmi_list.get(i).getRes());

		}

	}

	void save() throws IOException {
		try {
			OutputStream output = new FileOutputStream("BMI.txt");

			System.out.println("------ 측정자 리스트 저장 중 -------");
			for (int i = 0; i < Bmi_list.size(); i++) {
				String str = "\n";
				str += "측정자 번호 : " + Bmi_list.get(i).getNo() + "\n";
				str += "측정자 이름: " + Bmi_list.get(i).getName() + "\n";
				str += "측정자 키 : " + Bmi_list.get(i).getHeight() + "\n";
				str += "측정자 몸무게 : " + Bmi_list.get(i).getWeight() + "\n";
				str += "측정자 성별 : " + Bmi_list.get(i).getSex() + "\n";
				str += "측정자 비만도 : " + Bmi_list.get(i).getObesity() + "\n";
				str += "측정자 결과 : " + Bmi_list.get(i).getRes() + "\n\n";

				byte[] by = str.getBytes();
				output.write(by);
			}
			System.out.println("저장 완료");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
