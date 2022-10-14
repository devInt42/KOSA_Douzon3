CREATE TABLE ITEM (
INO 		NUMBER 		    NOT NULL 	PRIMARY KEY,    -- 판매 물품 번호
INAME		VARCHAR(32) 	NOT NULL,                   -- 판매 물품명
IPRICE		VARCHAR(32) 	NOT NULL,                   -- 판매 가격
SELLER_CNO	NUMBER 		    NOT NULL,                   -- 판매자 CNO
CHAT		VARCHAR2(8)	   	DEFAULT Null ,               -- 채팅방 개설여부
CHAT_SELLER VARCHAR2(8)	   	DEFAULT Null                -- 판매자의 채팅방 참여 여부
);
DESC ITEM;
drop Sequence seq_ino;
SELECT * FROM ITEM;
CREATE SEQUENCE SEQ_INO START WITH 1000 INCREMENT BY 1; --SEQUENCE 이미 추가했으니 만들필요 x

INSERT INTO ITEM VALUES (SEQ_INO.NEXTVAL, '아이폰13', '10000', 100 , NULL, null);
INSERT INTO ITEM VALUES (SEQ_INO.NEXTVAL, '버즈2', '13000', 100 , NULL, null);
