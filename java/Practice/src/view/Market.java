package view;

import java.sql.SQLException;

import controller.LoginController;
import controller.MarketController;
import controller.ParentsController;

public class Market {

	public static void main(String[] args) throws SQLException {
		LoginController.connect();
		MarketController.connect();
		MarketController.menu();

	}

}
