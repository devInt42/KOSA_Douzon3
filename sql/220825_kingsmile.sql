-- ��������
CREATE TABLE userlist (
    id VARCHAR2(10)  CONSTRAINT id_pk PRIMARY key ,
    name varchar2(10) -- not null
);
/*
�������Ǹ� ==>  ���̺��_�ʵ��_����(pk, fk, ck....)
CREATE TABLE userlist(
    id VARCHAR2(10) ,
    name varchar2(10) -- not null
    CONSTRAINT id_pk PRIMARY key
);*/
drop table userlist;
select * from userlist;
insert into userlist values('kingsmile', 'doyeon');
insert into userlist(name, id) values('kang', 'aaa');
insert into userlist( id) values('gildong');

insert into userlist(name) values('hong');  -- pk �� (�⺻Ű) �ߺ��ȵǰ� not null ��
insert into userlist( id) values('gildong');  -- �ߺ���� �ȵ�
----------------------------------------------------
CREATE TABLE fk_member (
    code number(2) NOT NULL , 
    id VARCHAR2(20) NOT NULL 
        CONSTRAINT id_fk REFERENCES MEMBER(id) ,
    etc VARCHAR2(10)
);
-----------------------------------------------------------
CREATE TABLE userlist_uq (
    id VARCHAR2(10) CONSTRAINT userlist_id_pk PRIMARY key, 
    jumin char(13)  CONSTRAINT jumin_un unique
  --  jumin char(13) not null CONSTRAINT jumin_un unique
);
drop table userlist_uq;
select * from userlist_uq;
insert into userlist_uq values('doyeon', '11111111');
insert into userlist_uq values('doyeon2', '11111112');
insert into userlist_uq(id) values('doyeon3');  -- �ߺ��ȵ�, null ���
---------------------------------------------------------------

CREATE TABLE ck_Test (
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL 
         CHECK (age BETWEEN 20 AND 30 ) 
                     --age�÷��� ���� 20~30���̸� ���
);

select * from ck_Test;
insert into ck_test values('doyeon', 22);
insert into ck_test values('doyeon', 77);  --
insert into ck_test values('doyeon', 30);
-------------------------------------------------------
CREATE TABLE de_Test (
    NAME VARCHAR2(10) NOT NULL,
    addr VARCHAR2(10) DEFAULT '����'
);

select * from de_test;
insert into de_test values('yuna', 'jeju');
insert into de_test values('yuna', default);  --
insert into de_test(name) values('yuna22');  -- default value
insert into de_test(name) values('yuna33');
insert into de_test values('yuna', 'null');
insert into de_test values('yuna', null);  --
-------------------------------------------------------
create table test 
(
    no  number not null,   -- primary key,  number : 4byte ( -9999 ~ 9999 )
    name VARCHAR2(10)  not null,
    birdate date,  -- ������� : '��-��-��'  or '��/��/��'    '88-12-20',   '88/12/20'
    age number,
    constraint  no_pk primary key(no)
);


select*from test;
select*from userlist;
--�� �÷��߰�
--alter table ���̺��̸� add
--(�÷��� �ڷ��� [��������] , �÷��� �ڷ��� [��������] , ....)
alter table userlist add phone varchar2(15);
alter table userlist add (no number(2), gender char(2));

update userlist set no = 1; --��ü ����
update userlist set phone = '111-222';
update userlist set gender='F', phone ='333-555' where id = 'gildong';
rollback; -- ������� DML��ɿ��� ����

--�� �÷�����
--alter table ���̺��̸� drop column �÷��̸�
alter table userlist drop column no;  
alter table userlist drop (name, gender);  
select*from userlist;

--�� datatype����
--alter table ���̺��̸� modify �÷��̸� �����ڷ���
desc userlist;
alter table userlist modify phone number, --�÷��� �����Ͱ� ������ ��� Ÿ�� ���� ����
alter table userlist modify no date;

--delete from userlist;
update userlist set phone = null;

--�� �÷��̸� ����
--alter table ���̺��̸� rename column �����÷��� to �����÷���
alter table userlist rename column phone to tel;
alter talbe userlist rename column no to num;
select*from userlist;

--�� ���̺� ����
--drop table ���̺��̸�
delete from userlist;
desc userlist;
drop table userlist;

--���� ���̺���
show recyclebin;
desc recyclebin;
--���� (������ ���̺�)
flashback table userlist to before drop;
select*from userlist;

--���ڵ� ����/����/����
--insert into ���̺��̸�(�÷���, �÷���,...) values(��, ��, ...)
--insert into ���̺��̸� values(��, ��, ...)
--=>��� �÷��� ��� ���� ���� �� ���

--update ���̺��̸�
--set �÷���=���氪 , �÷���=���氪 , �÷���=���氪 , .....
--[ where ���ǽ� ]

--Delete table�̸� [ where ���ǽ� ]
--truncate table ���̺��̸� ; => ��� ���ڵ� ����
select*from emp2;
delete emp2;
rollback;

truncate table emp2; --where emp_type='������'; 
--where�� ��� �Ұ� �ѹ� �Ұ�(DML��ɾ �ƴϱ� ����)














