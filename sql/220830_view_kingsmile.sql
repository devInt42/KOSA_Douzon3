-- View ----------------------------------------
/*
create or replace view ���̸�
    as    ���� ����;
    
drop view ���̸�;
*/

select * from professor;
select * from emp;

create or replace view  v_emp
    as   select empno, ename, deptno from emp; -- where deptno=20;
    
select * from v_emp;
drop view v_emp;

--emp ���̺� �����ϸ�  v_emp ?   ���� O
--v_emp ���̺� �����ϸ�  emp ?   ���� X


drop view v_student_join;

create or replace view  v_student_join
as
    select p.profno, p.name as "�����̸�", p.position,
             s.studno, s.name �л�����, s.grade, d.dname , p.deptno 
        from professor p join student s
        on p.profno = s.profno  join  department d
        on s.deptno1 = d.deptno ;

select * from v_student_join;

--����10] 30�� �μ� ������� ����, �̸�, ������ ���� view ���̺� ����� (emp)
drop view v_emp_30;

create view v_emp_30
as 
    select job , ename , sal
        from emp
        where deptno= 30;

select * from v_emp_30;

--����11] 30�� �μ� ������� ����, �̸�, ������ ���� view ���̺� ����µ�,
--    �÷����� ����, ����̸�, �޿��� Alias�� �ְ� ������ 2000���� ���� ����鸸 �����Ѵ�
create view v_emp30
as select job ����, ename "��� �̸�", sal ����, deptno
    from emp
    where sal > 2000 and deptno=30 ;

select * from v_emp30;

--����12] �μ��� �ִ�޿�, �ּұ޿�, ��ձ޿��� ���� view ����ÿ�
select avg(sal) from emp;

create view v_emp_deptno
as
    select deptno "�μ�", max(sal) �ִ�޿�, min(sal) �ּұ޿�, round(avg(sal), 3) "��ձ޿�"
--    select deptno "�μ�", max(sal) �ִ�޿�, min(sal) �ּұ޿�, avg(sal) "��ձ޿�"
        from emp
        group by deptno
        order by deptno ; 
        
select * from v_emp_deptno;

--����13] �μ��� ��ձ޿��� ���� view ����µ�, ��ձ޿��� 2000�̻��� �μ��� ����ϼ���.
create view v_emp_2000
as select deptno, round(avg(sal), 2) "�μ����"
    from emp
    group by deptno
    having avg(sal) > 2000 ;   -- ����

select * from v_emp_2000;

select * from emp;
desc emp;
insert into emp(empno, ename, job, sal, deptno) values(8000, 'doyeon', 'manager', 4500, 40);
update emp set deptno = 50 where empno = 8000;  -- error
select * from dept;

--����14]������ �ѱ޿��� ���ϴ� view ���̺� ����µ�, ����(job)�� manager�� ������� �����ϰ�
--    �ѱ޿��� 3000 �̻��� �����鸸 ������ ���̺� �����
CREATE OR REPLACE VIEW v_emp_job AS 
    SELECT * FROM emp 
        WHERE job not in ('MANAGER', 'manager')  -- 
        AND sal >= 3000;
--------------------------------------------
CREATE OR REPLACE VIEW v_emp_job2 AS 
    SELECT job, sum(sal) "�ѱ޿�"
        FROM emp 
        where job <> 'MANAGER' and job <> 'manager'   -- WHERE job != 'MANAGER' and job != 'manager' 
        group by job
        having sum(sal) > 3000;

select * from v_emp_job2;    
    
--����15]�л� ���̺��� �г⺰ ��� Ű�� �����԰� Ű�� 165 �̻��̰�,
--    �����Դ� 60�̻��� ����鸸 ����ϴ� �� ���̺� �����
create view v_student_�г⺰���Ű
as
    select name �̸�, grade �г�, round(avg(height), 1) ���Ű, round(avg(weight), 1) ��ո�����
        from student
        GROUP by grade, name
        having avg(height) >= 165 and avg(weight) >= 60 ;
    
select * from v_student_�г⺰���Ű;
drop view v_student_�г⺰���Ű;
    
--����16]�������̺��� ���Ӱ��� �鸸 �ִ� ���� ���̺� �����

-- �������� Ȯ��(���̺� & Į��) �� �������� ����
select *
    from all_constraints
    where TABLE_NAME = '���̺��' ;   -- ������ ��ųʸ����� �빮��
    
select *
    from all_constraints
    where TABLE_NAME = 'DEPT' ; 
--    where TABLE_NAME = 'EMP' ; 
--    where TABLE_NAME = 'C_EMPALL' ;   -- �������� ������� �ʴ´�.

-- �������� ����
alter table ���̺��  drop CONSTRAINT �������Ǹ� cascade ;
ex) alter table Board  drop CONSTRAINT board_no_pk cascade

alter table dept  drop CONSTRAINT pk_dept ;  -- ORA-02273: ����/�⺻ Ű�� �ܺ� Ű�� ���� �����Ǿ����ϴ�
alter table dept  drop CONSTRAINT pk_dept cascade; 

-- PK ����
alter table ���̺��  add ( CONSTRAINT �������Ǹ�  primary key (�÷���1, �÷���2,...) );
alter table dept  add (CONSTRAINT pk_dept  primary key (deptno) );

select * from c_empall;
desc c_empall;

alter table c_empall  add (CONSTRAINT empno_pk  primary key (empno) );
ALTER TABLE c_empall ADD CONSTRAINT PK_empall PRIMARY KEY (empno);

select * from cal;
desc cal;
alter table cal  add (CONSTRAINT cal_num_pk  primary key (NUM_DAY) );

select *
    from all_constraints
    where TABLE_NAME = 'CAL' ; 
    
-- ���ڵ� ���� -------------------------
--����>
insert into ���̺��̸�
    select �÷���, ... from ���̺��̸� ;
    
select * from c_emp4;

create table c_emp6
    as   select ename, empno, hiredate from emp where 1=0;
select * from c_emp6;

insert into c_emp6
    select  EMP_TYPE , pay, BIRTHDAY from emp2 ;  -- ���ڵ� ����, ������ Ÿ��, ������ ũ�� ���߸� ��.
    
alter table c_emp6 modify ename varchar(16);
alter table c_emp6 modify empno number;

desc c_emp6;
desc emp2;   -- EMP_TYPE , pay, BIRTHDAY
------------------------------------------------------------
�ǽ� ���� Oracle SQL_PLSQL_PPT > ppt 4, 5, 10�� 




