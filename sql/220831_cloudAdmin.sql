-- rownum / rowid
select ename, job, rownum from emp;
select rownum, ename, job from emp;

delete from emp where ROWNUM = 4; -- rownum 은 select에만 적용, 삭제, 수정에는 사용 불가

select ename, job, rowid, rownum from emp;

select rownum, ename, sal
    from (select*from emp order by sal);

--- Sequence--자동증가---
/*
Sequence 생성방법>
create sequence 시퀀스 이
create sequence 시퀀스이름 -- 1부터 시작
[start with 시작값 ]
[increment by 증가치 ]
[maxvalue 최대값 ]
[minvalue 최소값 ]
[cycle | nocycle ]
[cache | nocache ]
*/

drop sequence autonum;
create SEQUENCE autonum; -- 1부터 시작해서 1씩 증가

select autonum.nextval from dual;
select autonum.currval from dual;

create table kosa_T(
 no number,
 name varchar2(20)
 );
 insert into kosa_T values(autonum.nextval, 'aa');
  insert into kosa_T values(autonum.nextval, 'bb');
 insert into kosa_T values(autonum.nextval, 'cc');
 insert into kosa_T values(autonum.nextval, 'dd');

 
 select*from kosa_T;
 
 drop table kosa;
 create sequence seq_kosa;
create table kosa(
 num number,
 id varchar2(20),
 name varchar2(20)
 );
 insert into kosa values(seq_kosa.nextval, 'aa','name');
 insert into kosa values(seq_kosa.nextval, 'bb','name');
 insert into kosa values(seq_kosa.nextval, 'cc','name');
 insert into kosa values(seq_kosa.nextval, 'dd','name');

drop sequence seq_kosa;

 select*from kosa;
create sequence seq_kosa
increment by 100;
 
 select*from kosa;
 
 create SEQUENCE seq_board
 maxvalue 1000;
 
 create table kosa2(
 num number,
 id varchar2(20),
 name varchar2(20)
 );
 
 insert into kosa2 values(seq_board.nextval, 'aa','name');
 insert into kosa2 values(seq_board.nextval, 'bb','name');
 insert into kosa2 values(seq_board.nextval, 'cc','name');
 insert into kosa2 values(seq_board.nextval, 'dd','name');
 
 select*from kosa2;
drop sequence seq_jumin_no;
create SEQUENCE seq_jumin_no
    INCREMENT by 10
    START with 10
    MAXVALUE 150
    MINVALUE 9
    cycle
    cache 2;
    
create table jumin_T(
    seq number,
    name varchar2(20),
    phone VARCHAR2(15)
);

insert into jumin_T values(seq_junmin_no.nextval, 'aa', '1111');
insert into jumin_T values(seq_junmin_no.nextval, 'bb', '2222');
insert into jumin_T values(seq_junmin_no.nextval, 'cc', '3333');
insert into jumin_T values(seq_junmin_no.nextval, 'dd', '4444');

select * from jumin_T;
    
------transaction--------------------
create table c_emp100
as select * from emp where 1=2; --조건에 맞지 않는 상태

---------------------------------
/*
begin
 for i in 1..10000 loop
    insert into c_emp100
    select*from emp;
 end loop;
end;
*/
-----------------------------------

select * from c_emp100;

rollback;
commit;

update c_emp100 set sal = 1000;
delete from c_emp100 where deptno = 20;
rollback;
---------------------------------------------------------
update c_emp100 set sal = 888 where deptno = 20;
savepoint update_sal; --savepoint 식별자;

update c_emp100 set sal = 999 where deptno = 30;
savepoint update_sal_30;

update c_emp100 set sal = 1 where deptno = 30;

select* from c_emp100;

select sum(sal) from c_emp100;

rollback to savepoint update_sal;

select * from c_emp100;

-----------------------------------
savepoint create_tt;
create table tt(id number);

insert into tt values(1);
insert into tt values(2);

insert into tt values(3);
insert into tt values(4);

select*from tt;
rollback to savepoint create_tt;

drop table tt;
--
--commit/rollback = DML명령어에만 가능 (select, insert, delete, update)
--                DDL명령어 불가능(create, 등등)
show user;
select * from emp2;








