package com.kosa.config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionFactory {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		String source = "./sqlMapConfig.xml";   
		try {
			Reader reader = Resources.getResourceAsReader(source);
			sqlSessionFactory = (SqlSessionFactory) new SqlSessionFactoryBuilder().build(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end static
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}







