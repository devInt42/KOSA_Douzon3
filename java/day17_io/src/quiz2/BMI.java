package quiz2;

public class BMI {
	protected String name, sex, res;
	protected int height, weight, no;
	protected double obesity;

	public BMI() {
	}

	public BMI(String name, int height, int weight, String sex, int no, double obesity, String res) {
		this.no = no;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.obesity = obesity;
		this.res = res;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res =res;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BMI [name=" + name + ", sex=" + sex + ", res=" + res + ", height=" + height + ", weight=" + weight
				+ ", no=" + no + ", obesity=" + obesity + "]";
	}

}
