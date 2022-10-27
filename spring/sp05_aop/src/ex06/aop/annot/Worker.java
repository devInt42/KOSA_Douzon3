package ex06.aop.annot;

public class Worker {   // 회사원 클래스
	
	private String name;
	private int age;
	private String job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {  // DI
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void getWorkerInfo() {
		System.out.println("이름 : " + getName() );
		System.out.println("나이 : " + age );
		System.out.println("직업 : " + job );
	}
	
}
