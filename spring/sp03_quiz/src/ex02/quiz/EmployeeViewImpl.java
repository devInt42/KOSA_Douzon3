package ex02.quiz;

public class EmployeeViewImpl implements IPersonView {

	private String company;
	private String name, age, sex;

	// setter로 주입

	@Override
	public void print() {
		System.out.println("직장 : " + company);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
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
