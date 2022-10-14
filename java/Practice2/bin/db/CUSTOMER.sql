CREATE TABLE CUSTOMER(
    CNO INT NOT NULL, --회원번호 100부터시작 자동증가 PK
    CID VARCHAR2(32)not null, -- 회원 아이디
    CNAME VARCHAR2(32) not null, -- 회원 이름
    PWD VARCHAR2(32)not null, -- 패스워드
    ADDR VARCHAR2(128)not null, -- 주소 EX) 경기도 남양주시 다산동
    TEL VARCHAR2(16) not null, -- 전화번호 EX) 010-9246-9642
    CMANAGER INT DEFAULT NULL, -- 관리자 1, 총관리자 0, 일반회원 NULL
    PRIMARY KEY(CNO)
);

CREATE SEQUENCE SEQ_CNO START WITH 100 INCREMENT BY 1 NOCYCLE; --SEQUENCE 이미 추가했으니 만들필요 x

SELECT*FROM CUSTOMER;
INSERT INTO CUSTOMER VALUES (SEQ_CNO.NEXTVAL, 'INT42', '류정수', 'Frenzy12!!', '경기도 남양주시 다산동', '010-9246-9642',0);
INSERT INTO CUSTOMER VALUES (SEQ_CNO.NEXTVAL, 'wjdtn402', '류정수', 'Frenzy12!!', '경기도 남양주시 다산동', '010-9246-9642','');
COMMIT;