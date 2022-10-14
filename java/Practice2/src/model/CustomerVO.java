package model;

public class CustomerVO {
	public final String ClassName = "CUSTOMER";

	private int cno;
	private String cid, cname, pwd, addr, tel, cmanager;

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCmanager() {
		return cmanager;
	}

	public void setCmanager(String cmanager) {
		this.cmanager = cmanager;
	}

	public String getClassName() {
		return ClassName;
	}

}
