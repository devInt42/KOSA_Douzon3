package quiz01;
import java.util.Scanner;

public class Sales extends Regular{
    Scanner sc = new Scanner(System.in);
    protected int commission;
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("커미션 : ");
		commission = sc.nextInt();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sal=" +(sal+ (sal*0.2)*commission) +", "+ "empNo=" + empNo + ", name=" + name + ", dept=" + dept + ", phone=" + phone;
	}
	
}
