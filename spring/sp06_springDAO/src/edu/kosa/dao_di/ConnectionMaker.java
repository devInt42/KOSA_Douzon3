package edu.kosa.dao_di;

import java.sql.Connection;

// Ȯ��, ���� �����ϰ� ó�� 
public interface ConnectionMaker {

	Connection makeConnection() throws Exception;
}
