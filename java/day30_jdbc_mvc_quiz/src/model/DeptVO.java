package model;

public class DeptVO {
	public final static String ClassName = "Dept";
	private String dname, loc;
	private int deptno;

	public String getDname() {
		return dname;
	}

	public  String getClassName() {
		return ClassName;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
