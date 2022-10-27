package board.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardVO {
	
	private int seq;
	private String title, writer, content;
	private Date regdate;
	private int readcount;
	private String searchCondition;
	private String searchKeyword;
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + "\n title=" + title + "\n writer=" + writer + "\n content=" 
					+ content + "\n regdate="	+ regdate + "\n readcount=" + readcount + "]";
	}
		
	
}




