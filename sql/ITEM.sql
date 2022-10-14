CREATE TABLE ITEM (
INO 		NUMBER 		    NOT NULL 	PRIMARY KEY,    -- �Ǹ� ��ǰ ��ȣ
INAME		VARCHAR(32) 	NOT NULL,                   -- �Ǹ� ��ǰ��
IPRICE		VARCHAR(32) 	NOT NULL,                   -- �Ǹ� ����
SELLER_CNO	NUMBER 		    NOT NULL,                   -- �Ǹ��� CNO
CHAT		VARCHAR2(8)	   	DEFAULT Null ,               -- ä�ù� ��������
CHAT_SELLER VARCHAR2(8)	   	DEFAULT Null                -- �Ǹ����� ä�ù� ���� ����
);
DESC ITEM;
drop Sequence seq_ino;
SELECT * FROM ITEM;
CREATE SEQUENCE SEQ_INO START WITH 1000 INCREMENT BY 1; --SEQUENCE �̹� �߰������� �����ʿ� x

INSERT INTO ITEM VALUES (SEQ_INO.NEXTVAL, '������13', '10000', 100 , NULL, null);
INSERT INTO ITEM VALUES (SEQ_INO.NEXTVAL, '����2', '13000', 100 , NULL, null);
