CREATE TABLE TRADE(
INO NUMBER NOT NULL PRIMARY KEY,	-- 물품번호 PK
INAME VARCHAR(32),							-- 물품명
IPRICE VARCHAR(32),							-- 물품가격
S_CNO   NUMBER,								-- 판매자 CNO
B_CNO   NUMBER								-- 구매자 CNO
);