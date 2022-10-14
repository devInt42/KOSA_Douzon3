package view;

import java.sql.SQLException;

import controller.DeptController;

public class MainEntry {
	public static void main(String[] args) throws SQLException {
		DeptController.connect();
		DeptController.menu();

	}
}
