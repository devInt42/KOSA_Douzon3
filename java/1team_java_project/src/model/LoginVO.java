package model;

public class LoginVO {
	public final String ClassName = "CUSTOMER";
	private int CNo;
	private String CID;
	private String PWD;
	private String TEL;
	private String ADDR;
	private String CNAME;
	private int CMANAGER;

	public int getCNo() {
		return CNo;
	}

	public void setCNo(int cNo) {
		CNo = cNo;
	}

	public String getCID() {
		return CID;
	}

	public void setCID(String cID) {
		CID = cID;
	}

	public String getPWD() {
		return PWD;
	}

	public void setPWD(String pWD) {
		PWD = pWD;
	}

	public String getTEL() {
		return TEL;
	}

	public void setTEL(String tEL) {
		TEL = tEL;
	}

	public String getADDR() {
		return ADDR;
	}

	public void setADDR(String aDDR) {
		ADDR = aDDR;
	}

	public String getCNAME() {
		return CNAME;
	}

	public void setCNAME(String cNAME) {
		CNAME = cNAME;
	}

	public int getCMANAGER() {
		return CMANAGER;
	}

	public void setCMANAGER(int cMANAGER) {
		CMANAGER = cMANAGER;
	}

	public String getClassName() {
		return ClassName;
	}

}
