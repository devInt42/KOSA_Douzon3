package quiz;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManager extends Employee {
	static HashMap<String, Employee> map = new HashMap<String, Employee>();
	static int top = 0;

	public static void insert() {
		System.out.println("사원 이름을 입력하세요 : ");
		String name = sc.next();

		System.out.println("부서를 입력하세요 : ");
		String dept = sc.next();
		map.put(name, new Employee(name, dept));
		top++; // 사원수 처리 변수
	}// insert() end

	public static void modify() {
		System.out.print("변경하실 사원의 이름을 입력하세요 : ");
		String name = sc.next();
		String dept = map.get(name).dept;

		if (map.containsKey(name)) {
			map.put(name, new Employee(name, dept));
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("사원 이름을 잘못 입력 하셨습니다. 해당 정보가 없습니다. ");
		} // if end
	}

	public static void delete() {
		System.out.print("삭제하실 사원의 이름을 입력 해주세요. : ");
		String name = sc.next();
		if (map.containsKey(name)) {
			map.remove(name);
			System.out.println("삭제 되었습니다.");
			top--;
		} else {
			System.out.println("사원 이름을 잘못 입력 하셨습니다. 해당 정보가 없습니다. ");
		}
	}

	public static void print() {
		System.out.println("사원 수 : " + top); // map.size()
		System.out.println("--이름 ---- 연락처 ------ 부서 ---- 직급 ---- 급여");
		Set<String> set = map.keySet();
		for (String employee : set) {
			String name = map.get(employee).name;
			String hp = map.get(employee).hp;
			String dept = map.get(employee).dept;
			String title = map.get(employee).title;
			String sal = map.get(employee).sal;
			System.out.println(name + "\t" + hp + "\t" + dept + "\t" + title + "\t" + sal);
		}

	}

	public static void save() throws IOException {
		try {
			OutputStream output = new FileOutputStream(
					"C:\\더존비즈온\\workspace\\day17_io\\src\\quiz\\Emp.txt");
			Set<String> set = map.keySet();
			for (String employee : set) {
				String str = "";
				String name = map.get(employee).name;
				String hp = map.get(employee).hp;
				String dept = map.get(employee).dept;
				String title = map.get(employee).title;
				String sal = map.get(employee).sal;
	   
	            str += "==========임직원 이름: " + name+ "==========\n";
	            str += "임직원 연락처 : " + hp + "\n";
	            str += "임직원 부처 : " + dept + "\n";
	            str += "임직원 직급 : " +  title  + "\n";
	            str += "임직원 급여 : " + sal + "\n";

				
				
				byte[] by = str.getBytes();
				output.write(by);
			}

		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
