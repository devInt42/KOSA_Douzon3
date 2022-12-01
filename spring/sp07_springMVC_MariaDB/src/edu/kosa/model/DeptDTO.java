package edu.kosa.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data     // setter , getter,  toString
@Component
public class DeptDTO {   // model      ~VO , ~DTO,  ~TO

	private int deptno;
	private String dname,  loc;
	
//	DEPTNO NOT NULL NUMBER(2)    
//	DNAME           VARCHAR2(14) 
//	LOC             VARCHAR2(13) 
}
