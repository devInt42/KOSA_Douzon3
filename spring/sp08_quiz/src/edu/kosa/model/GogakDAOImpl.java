package edu.kosa.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("dao") //bean name	//만약 작성안할시 앞자리가 소문자인 gogakDAOImpl을 지정
public class GogakDAOImpl implements GogakDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;	//DML - insert, delete, update, select
	
	@Override
	public List listGogak() {
		String sql = "SELECT * FROM GOGAK ORDER BY GNO DESC";
		return jdbcTemplate.queryForList(sql);	
	}

	@Override
	public void insertGogak(GogakDTO dto) {
		String sql = "INSERT INTO GOGAK(GNO, GNAME, JUMIN, POINT) VALUES (?, ?, ?, ?)";
		Object[] arr = {dto.getGno(), dto.getGname(), dto.getJumin(), dto.getPoint()};
		
		this.jdbcTemplate.update(sql, arr);
	}
	@Override
	public void deleteGogak(GogakDTO dto) {
		String sql = "DELETE  FROM GOGAK WHERE GNO = ?";
		Object[] arr = {dto.getGno()};
		this.jdbcTemplate.update(sql, arr);
	}
	@Override
	public void updateGogak(GogakDTO dto) {
		String sql = "UPDATE GOGAK SET GNAME = ? , JUMIN = ? , POINT = ? WHERE GNO = ?" ;
		Object[] arr = {dto.getGname(), dto.getJumin(), dto.getPoint(), dto.getGno()};
 		
		this.jdbcTemplate.update(sql, arr);
	}
}
