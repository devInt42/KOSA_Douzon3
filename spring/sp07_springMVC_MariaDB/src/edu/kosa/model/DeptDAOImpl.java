package edu.kosa.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("dao")  // bean name 지정할 수 있다.
//@Component     //  deptDAOImpl   bean 생성한다
public class DeptDAOImpl implements DeptDAO {
	
	@Autowired
	private JdbcTemplate   jdbcTemplate;   // DML - insert, delete, update, select

	@Override
	public List listDept() {   // select
		String sql = "SELECT * FROM DEPT ORDER BY DEPTNO DESC";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void insertDept(DeptDTO dto) {   // insert
		String sql = "INSERT INTO DEPT(DEPTNO, DNAME, LOC) VALUES(?, ?, ?)";
		Object[] arr = { dto.getDeptno(), dto.getDname(), dto.getLoc() };
		
		this.jdbcTemplate.update(sql, arr);
	}

	@Override
	public void deleteDept(DeptDTO dto) {
		String sql = "DELETE FROM DEPT WHERE ";
		
	}
}




