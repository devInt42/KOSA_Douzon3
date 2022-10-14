package model;

public class GiftVO { // model - ~~VO, ~~DAO, ~~TO
//value object DataAccessObject TransferObject
	public final String ClassName = "Gift";

	// gno,gname,g_start,g_end

	private int gno, g_start, g_end;
	private String gname;

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public int getG_start() {
		return g_start;
	}

	public void setG_start(int g_start) {
		this.g_start = g_start;
	}

	public int getG_end() {
		return g_end;
	}

	public void setG_end(int g_end) {
		this.g_end = g_end;
	}

	public String getGname() {
		return gname;
	}

	public String getClassName() {
		return ClassName;
	}
}
