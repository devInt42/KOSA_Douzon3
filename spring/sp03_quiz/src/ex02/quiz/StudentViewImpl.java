package ex02.quiz;

public class StudentViewImpl implements IPersonView {
	private String school;
	private String name, age, sex;

	// setter�� ����
	@Override
	public void print() {
		System.out.println("�б� : " + school);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex + "\n\n");
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