CREATE TABLE CUSTOMER(
    CNO INT NOT NULL, --ȸ����ȣ 100���ͽ��� �ڵ����� PK
    CID VARCHAR2(32)not null, -- ȸ�� ���̵�
    CNAME VARCHAR2(32) not null, -- ȸ�� �̸�
    PWD VARCHAR2(32)not null, -- �н�����
    ADDR VARCHAR2(128)not null, -- �ּ� EX) ��⵵ �����ֽ� �ٻ굿
    TEL VARCHAR2(16) not null, -- ��ȭ��ȣ EX) 010-9246-9642
    CMANAGER INT DEFAULT NULL, -- ������ 1, �Ѱ����� 0, �Ϲ�ȸ�� NULL
    PRIMARY KEY(CNO)
);

CREATE SEQUENCE SEQ_CNO START WITH 100 INCREMENT BY 1 NOCYCLE; --SEQUENCE �̹� �߰������� �����ʿ� x

SELECT*FROM CUSTOMER;
INSERT INTO CUSTOMER VALUES (SEQ_CNO.NEXTVAL, 'INT42', '������', 'Frenzy12!!', '��⵵ �����ֽ� �ٻ굿', '010-9246-9642',0);
INSERT INTO CUSTOMER VALUES (SEQ_CNO.NEXTVAL, 'wjdtn402', '������', 'Frenzy12!!', '��⵵ �����ֽ� �ٻ굿', '010-9246-9642','');
COMMIT;