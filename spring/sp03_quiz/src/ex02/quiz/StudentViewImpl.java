package ex02.quiz;

public class StudentViewImpl implements IPersonView {
	private String school;
	private String name, age, sex;

	// setter로 주입
	@Override
	public void print() {
		System.out.println("학교 : " + school);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex + "\n\n");
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
