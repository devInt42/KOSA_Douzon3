package model;

public class ItemVO {
	public final String ClassName = "CUSTOMER";

	private int ino;
	private String iname, iprice, seller_cno, chat, chat_seller;

	public int getIno() {
		return ino;
	}

	public void setIno(int ino) {
		this.ino = ino;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getIprice() {
		return iprice;
	}

	public void setIprice(String iprice) {
		this.iprice = iprice;
	}

	public String getSeller_cno() {
		return seller_cno;
	}

	public void setSeller_cno(String seller_cno) {
		this.seller_cno = seller_cno;
	}

	public String getChat() {
		return chat;
	}

	public void setChat(String chat) {
		this.chat = chat;
	}

	public String getChat_seller() {
		return chat_seller;
	}

	public void setChat_seller(String chat_seller) {
		this.chat_seller = chat_seller;
	}

	public String getClassName() {
		return ClassName;
	}

}
