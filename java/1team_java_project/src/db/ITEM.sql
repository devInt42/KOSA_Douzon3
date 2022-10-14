CREATE TABLE ITEM (
INO 		NUMBER 		    NOT NULL 	PRIMARY KEY,    -- �Ǹ� ��ǰ ��ȣ
INAME		VARCHAR(32) 	NOT NULL,                   -- �Ǹ� ��ǰ��
IPRICE		VARCHAR(32) 	NOT NULL,                   -- �Ǹ� ����
SELLER_CNO	NUMBER 		    NOT NULL,                   -- �Ǹ��� CNO
CHAT		VARCHAR2(8)	   	DEFAULT Null ,               -- ä�ù� ��������
CHAT_SELLER VARCHAR2(8)	   	DEFAULT Null,                -- �Ǹ����� ä�ù� ���� ����
 CONSTRAINT FK_CNO FOREIGN KEY(SELLER_CNO) REFERENCES CUSTOMER(CNO) ON DELETE CASCADE
);
DESC ITEM;
drop Sequence seq_ino;
SELECT * FROM ITEM;
CREATE SEQUENCE SEQ_INO START WITH 1000 INCREMENT BY 1; --SEQUENCE �̹� �߰������� �����ʿ� x
