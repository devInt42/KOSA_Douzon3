package com.kosa.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

@Component
public class BoardDAO {

	private SqlSessionFactory  sqlSessionFactory;
	
	public BoardDAO() {
		//sqlSessionFactory = Sq
	}
}
