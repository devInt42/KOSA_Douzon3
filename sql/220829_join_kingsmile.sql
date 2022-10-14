-- ����----------------
-- �ΰ� �̻��� ���̺��� �ϳ��� ���̺�� ����� �ѹ��� �˻����� ���� �÷��� ������ Ȯ���� �� �����
--inner Join
--Outer Join
--    left outer Join
--    right outer Join
--    full outer Join

select*from emp; -- ���ڵ� 14��
select*from dept; -- ���ڵ� 4��
select*from emp, dept;

select ename, job, sal, e.deptno, dname -- ���̺��.�ʵ��
from emp e, dept d
where e.deptno = d.deptno; --inner join

select ename, job, sal, e.deptno, dname
 from emp e join dept d --inner join
 on e.deptno = d.deptno;


select ename, job, sal, e.deptno, dname
 from emp e left outer join dept d 
 -- left outer join : ���ʿ� �ִ� ������ ���, ������ ��ġ�ϴ� �����͸�
 on e.deptno = d.deptno;

select ename, job, sal, e.deptno, dname
 from emp e right outer join dept d 
  -- right outer join : ������ �ִ� ������ ���, ���� ��ġ�ϴ� �����͸�
 on e.deptno = d.deptno;

desc dept;
insert into dept(deptno, loc) values(50,'SEOUL');
select * from dept;

select ename, job, sal, e.deptno, dname
 from dept d right outer join emp e
  -- right outer join : ������ �ִ� ������ ���, ���� ��ġ�ϴ� �����͸�
 on e.deptno = d.deptno;
 
-- ����] professor / student table �̿�
-- inner join
-- outer join - left/right
select*from professor;
select*from student;
--�����̸�, ����, �а��ڵ�, �����ڵ�, �л��̸�, �й�, �г�, �������а�

--�̳�����
select p.name as "�����̸�" , p.position as "����", p.deptno "�а���ȣ", s.profno as "�����ڵ�", s.name "�л��̸�", s.studno as "�й�", s.grade as "�г�", s.deptno1 " �������а�"
    from professor p join student s
    on p.deptno = s.deptno1;

--left outer join
select p.name as "�����̸�" , p.position as "����", p.deptno "�а���ȣ", s.profno as "�����ڵ�", s.name "�л��̸�", s.studno as "�й�", s.grade as "�г�", s.deptno1 " �������а�"
    from professor p left outer join student s
    on p.profno = s.profno;    

--right outer join
select p.name as "�����̸�" , p.position as "����", p.deptno "�а���ȣ", s.profno as "�����ڵ�", s.name "�л��̸�", s.studno as "�й�", s.grade as "�г�", s.deptno1 " �������а�"
    from professor p right outer join student s
    on p.profno = s.profno;
    
    
--select �÷���, 
--from ���̺�� ��Ī joint ���̺�� ��Ī
--on ��Ī.�÷��� = ��Ī.�÷���

select * from department;

select p.profno as "������ȣ", p.name as "������", 
s.studno as "�й�", s.name as "�л��̸�", d.dname as "���̸�"
from professor p join student s
on p.profno = s.profno right outer join department d
on s.deptno1 = d.deptno;

--����̸�, �μ��̸�, ��å, �Ŵ�����ȣ ��� emp/dept ���̺� �̿�
select*from emp e, dept d;
select*from emp;
select*from dept;
select e.ename as"����̸�", d.dname as "�μ��̸�", 
e.job as "��å", e.mgr as "�Ŵ��� ��ȣ"
from emp e join dept d
on e.deptno = d.deptno;

--self join
select e.ename as"����̸�", e.job as "��å", 
e.mgr as "�Ŵ��� ��ȣ", em.ename as "�Ŵ��� �̸�"
from emp e join emp em
on e.mgr = em.empno;

--���̺� ���� / ���ڵ� ���� ---------------
/* ����>
Creat table ���̺� �̸�
    as select �ʵ��, .... from ���̺��;
*/
select*from emp;
create table c_empAll
    as select * from emp;   --�������� ���� �ȵ�

select * from c_empAll;
desc c_empAll;
desc emp;

create table c_emp_20
    as select*from emp where deptno=20;
    
select*from c_emp_20;

create table c_emp_30
    as select empno ���, ename �����, job ��å, sal �޿� from emp where deptno=30;
    
select*from c_emp_30;

select*from c_empAll;  --���ǿ� �°� ����
select * from c_emp_20; --���ǿ� �°� ����
select * from c_emp_30; --���ǿ� �°� ����

-- �������� Ȯ�ι�� 1) Ʋ�̿� 2) ��ɾ�
select * from all_constraints
    where Table_name = 'EMP'; --������ ��ųʸ����� ��κ� �빮�ڷ� �����

--����1] ���� ���̺��� ���Ӱ��縸 �̾Ƽ� ���̺� �����ϱ�
select*from professor;
create table c_prof as select*from professor where position = '���Ӱ���';
select * from c_prof;

--����2] emp ���̺��� mgr�� 7566���� ����� �����ؼ� ���ο� ���̺� �����ϱ�
select*from emp;
create table c_empmgr as select*from emp where mgr = 7566;
select*from c_empmgr;

/* �������� �����ϱ� ���� ��
create table ���̺��
    as select �ʵ��...from ���̺�� where 1=0; 
*/

create table c_emp4
    as select*from emp where 1=0;

create table c_emp5
    as select empno, ename, job, sal from emp;

select*from c_emp5;

select*from c_empAll;   --��ü ����
select*from c_emp_20;    -- ���ǿ� �°� ����
select*from c_emp_30;    -- ��������, ��Ī
select*from c_emp4;     -- �������� ����, ���ڵ� ����
select*from c_emp5;     -- ���ϴ� �ʵ忡 �ش��ϴ� ���ڵ� ����, empno, ename, job, sal

--Union ----- pk/fk ���� �ƴ� ���� ���̺� ��ġ��
select*from emp
    union 
        select*from c_empAll;

--�ߺ����ڵ� ����
select*from emp
    union all
        select*from c_empAll;

insert into c_empAll values(7788, 'kingsmile','managaer',7566, '2022/01/17',5000,1000,30);

--select empno, ename, job, sal from emp --�ʵ� ������ ������ Ÿ���� ��ġ�ؾ���
select empno, ename, job, comm from emp --hireate
union
    select*from c_emp5;
    
desc emp;

--�˻� �������� ��ҹ��� ����X �� ���ڵ�� ��ҹ��� �����Ѵ�.
select*from c_empall;
select*from c_empall where job = 'manager';
select*from c_empall where job = 'MANAGER' or job='manager';
select*from c_empall where job in ('MANAGER','manager'); --or ������ in�� �ξ� ����

select empno �����ȣ,  ename  �̸�,  sal �޿�
    from emp
    where ename='FORD'
--     where �̸�='FORD';  -- ��Ī���� ���� X
    order by �޿� desc ;   -- ��Ī���� ���� O

--����2] �����ȣ, �̸�, �޿� �׸��� 15%�λ�� �޿��� ������ ǥ���ϵ�
-- �÷����� New Salary�� �����Ͽ� ����϶�
select empno, ename, sal, sal*1.15 as "New Salary" from emp;
select empno, ename, sal, round(sal*1.15,0) as "New Salary" from emp;
select empno, ename, sal, cast(sal*1.15 as int) as "New Salary" from emp;   --cast(�ʵ� as �ڷ���)

--����3] 2�� ������ ������ �����Ϳ��� �޿� �λ��(�� �޿����� ���� �޿��� �� ��)�� �߰��ؼ� ���
--�÷����� increase��
select empno, ename, sal,(sal*1.15)-sal as Increase from emp;

--����4] �� ����� �̸���  ǥ���ϰ� �ٹ� �� ���� ����Ͽ� �÷����� 
--Months_Works�� �����ϰ�, �ٹ� �޼��� �������� ������ ������� �����Ͽ� ����϶�

select ename, floor(months_between(sysdate,hiredate)) as "Months_Works" from emp
order by hiredate desc;

--����5] ����� �̸��� Ŀ�̼��� ����ϵ� Ŀ�̼��� å������ ���� ����� Ŀ�̼��� 'no commision'���� ���
select*from emp;
select ename, nvl(to_char(comm),'no commision') as comm from emp;