package edu.kosa.board.controller;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dbclose.util.CloseUtil;
import edu.kosa.board.model.GiftVO;

public class GiftDAO {
	private static GiftDAO instance = new GiftDAO();
	
	public static GiftDAO getInstance() {
		return instance;
	}
	
	//생성자
	public GiftDAO() {}
	
	//DB연결
	public Connection getConnection() throws Exception{
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc:GiftDB");
		DriverManager.setLogWriter(new PrintWriter(System.out));
		return ds.getConnection();
	}
	
	public ArrayList<GiftVO> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		ArrayList<GiftVO> list = new ArrayList<GiftVO>();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT GNO, GNAME, G_START, G_END FROM GIFT");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				GiftVO vo = new GiftVO();
				vo.setGno(rs.getInt("gno"));
				vo.setGname(rs.getString("gname"));
				vo.setG_start(rs.getInt("g_start"));
				vo.setG_end(rs.getInt("g_end"));
				list.add(vo);
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			CloseUtil.close(rs);			CloseUtil.close(pstmt);			CloseUtil.close(conn);
		}
		return list;
	}
}
