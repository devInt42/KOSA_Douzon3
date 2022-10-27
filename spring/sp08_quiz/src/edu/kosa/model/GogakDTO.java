package edu.kosa.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data     // setter , getter,  toString
@Component
public class GogakDTO {
	private int gno, point;
	private String gname, jumin;
	
}
