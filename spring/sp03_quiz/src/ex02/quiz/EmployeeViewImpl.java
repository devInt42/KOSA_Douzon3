package ex02.quiz;

public class EmployeeViewImpl implements IPersonView {

	private String company;
	private String name, age, sex;

	// setter�� ����

	@Override
	public void print() {
		System.out.println("���� : " + company);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);
	}

	public void setCompany(String company) {
		this.company = company;
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
