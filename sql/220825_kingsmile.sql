-- 제약조건
CREATE TABLE userlist (
    id VARCHAR2(10)  CONSTRAINT id_pk PRIMARY key ,
    name varchar2(10) -- not null
);
/*
제약조건명 ==>  테이블명_필드명_성격(pk, fk, ck....)
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

insert into userlist(name) values('hong');  -- pk 는 (기본키) 중복안되고 not null 임
insert into userlist( id) values('gildong');  -- 중복허용 안됨
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
insert into userlist_uq(id) values('doyeon3');  -- 중복안됨, null 허용
---------------------------------------------------------------

CREATE TABLE ck_Test (
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL 
         CHECK (age BETWEEN 20 AND 30 ) 
                     --age컬럼의 값은 20~30사이만 허용
);

select * from ck_Test;
insert into ck_test values('doyeon', 22);
insert into ck_test values('doyeon', 77);  --
insert into ck_test values('doyeon', 30);
-------------------------------------------------------
CREATE TABLE de_Test (
    NAME VARCHAR2(10) NOT NULL,
    addr VARCHAR2(10) DEFAULT '서울'
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
    birdate date,  -- 생년월일 : '년-월-일'  or '년/월/일'    '88-12-20',   '88/12/20'
    age number,
    constraint  no_pk primary key(no)
);


select*from test;
select*from userlist;
--① 컬럼추가
--alter table 테이블이름 add
--(컬럼명 자료형 [제약조건] , 컬럼명 자료형 [제약조건] , ....)
alter table userlist add phone varchar2(15);
alter table userlist add (no number(2), gender char(2));

update userlist set no = 1; --전체 수정
update userlist set phone = '111-222';
update userlist set gender='F', phone ='333-555' where id = 'gildong';
rollback; -- 실행취소 DML명령에만 적용

--② 컬럼삭제
--alter table 테이블이름 drop column 컬럼이름
alter table userlist drop column no;  
alter table userlist drop (name, gender);  
select*from userlist;

--③ datatype변경
--alter table 테이블이름 modify 컬럼이름 변경자료형
desc userlist;
alter table userlist modify phone number, --컬럼에 데이터가 없었을 경우 타입 변경 가능
alter table userlist modify no date;

--delete from userlist;
update userlist set phone = null;

--④ 컬럼이름 변경
--alter table 테이블이름 rename column 기존컬럼명 to 변경컬럼명
alter table userlist rename column phone to tel;
alter talbe userlist rename column no to num;
select*from userlist;

--⑤ 테이블 삭제
--drop table 테이블이름
delete from userlist;
desc userlist;
drop table userlist;

--삭제 테이블보기
show recyclebin;
desc recyclebin;
--복구 (삭제된 테이블)
flashback table userlist to before drop;
select*from userlist;

--레코드 삽입/수정/삭제
--insert into 테이블이름(컬럼명, 컬럼명,...) values(값, 값, ...)
--insert into 테이블이름 values(값, 값, ...)
--=>모든 컬럼에 모두 값을 넣을 때 사용

--update 테이블이름
--set 컬럼명=변경값 , 컬럼명=변경값 , 컬럼명=변경값 , .....
--[ where 조건식 ]

--Delete table이름 [ where 조건식 ]
--truncate table 테이블이름 ; => 모든 레코드 삭제
select*from emp2;
delete emp2;
rollback;

truncate table emp2; --where emp_type='인턴직'; 
--where절 사용 불가 롤백 불가(DML명령어가 아니기 때문)














