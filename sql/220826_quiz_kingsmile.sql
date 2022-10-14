select * from emp2 order by name asc;

--������ �̸鼭 '�����' ã��
select * from emp2 where emp_type = '������' and name = '�����';
--������ �̰ų� '������' ã��
select * from emp2 where emp_type = '������' or name = '������';

--������ �̰ų� �达���� ���� ��� ã��
select * from emp2 where emp_type = '������' or name like '��%';

--�达�� �ƴ� �������� ã��
select * from emp2 where emp_type = '������' and name not like '��%';

--����1] �̸����� '�迵��' ������� �����ּ���
select*from professor where name = '�迵��';
--����2] �̸����� '��'�� ���� ���� ������� �����ּ���. -��� : %, �ѱ��� :_
select * from professor where name like '��%';
--����3] �̸��� �� ������ ��� �����ּ���
select * from professor where name like '__';
--����4] id�� s or a ���ڰ� ���� ��� ã�� (professor table)
select * from professor where id like'%s%' or id like'%a%';
--����5] ���Ӱ��縦 ã���ּ���
select * from professor where position = '���Ӱ���';

--����6] �г��� 3�г��̰� Ű�� 165 �̻��� �а��ڵ尡 101�� �л�
select * from student;
select*from student
where grade=3 and height>=165 and deptno1 = 101;

--����7] ������ 77�� ������ �л��� ã��
select * from student where birthday <= '77/01/01';
--����8] ������(deptno2)�� ���� �л��鸸 ã��
select * from student where deptno2 is not null;
select deptno2, nvl(deptno2, '11'),  name 
--select deptno2, nvl(deptno2, 0),  name   -- nvl(���Ǵ��ʵ��, ��ü��)
    from student;
    
--����9] ��米���� 1000~2001�� ���� �л��� ã��
select * from student where profno >=1000 and profno <=2001; 
select * from student where profno between 1000 and 2001; 

desc student;
select * from professor
order by 2 desc, position, email; --asc desc
--�ʵ��ȣ�ε� ���� ����

select * from professor
where pay >= any(300,400,700); 


select * from professor
where nvl(bonus,0) >= any(0,40,50); 

select * from professor
where pay <= all(300,400,500);
select * from professor
where pay >= all(300,400,500); 
/*
> ANY : �ּҰ� ���� ũ��
 �ʵ��(pay) >= ANY : �ּҰ����� ũ�ų� ������   any( 300, 550, 400 )
  < ANY : �ִ밪���� ������
  <= ANY : �ִ밪���� �۰ų� ������
   = ANY : IN�� ���� ȿ��
  != ANY : NOT IN�� ���� ȿ��
*/
select * from professor where pay >= any( 300, 550, 400 );
select * from student where weight > any( 70, 80 );  -- 
select * from student where weight < any( 60, 70 );

/*
ANY�ʹ� �ݴ�Ǵ� �����Դϴ�.

  �ʵ��(pay) > ALL : �ִ밪 ���� ũ��  all( 300, 550, 400 )
>= ALL : �ִ밪���� ũ�ų� ������
< ALL : �ּҰ����� ������
<= ALL : �ּҰ����� �۰ų� ������
= ALL : SUBSELECT�� ����� 1���̸� ��������� ���� ���̸� ������ �߻��մϴ�.
!= ALL : ���� ���������� SUBSELECT�� ����� ���� ���̸� ������ �߻��մϴ�
*/
select * from professor where pay >= all( 300, 550, 400 );
select * from student where weight > all( 70, 80 );  -- 
select * from student where weight < all( 60, 70 );
---------------�Լ�
--1.����(�׷�)�Լ�
--
select * from gift;
select sum(g_start) �������հ�,sum(g_end) "�ְ� �հ�" from gift;
select min(g_start) ����������,max(g_end) "�ְ� ��" from gift;
select avg(g_start) ���������,avg(g_end) "�ְ� ���" from gift;--�� ����

select * from professor;

select count(*) "���ʽ���" from professor;

SELECT RANK(30) within GROUP(ORDER BY bonus )
FROM professor
where pay is not null;
--oracle�� null ���� �켱���� ����
--mysql�� null���� �켱���� ����

--���� Ű�� 168�� ����� ���°�� ũ��
select rank(168) within group(order by height desc)
from student;
select * from student;

--2�����԰� 58�� ����� ���°�� ���̳�
select rank(58) within group(order by weight)
from student;
--3 g_end�� 200000, 600000���� ���� �� ���(any �̿�)

select *
from gift
where g_end <= any(200000,600000);

--4���� �л����� Ű�� �հ� ��� ���� Ű�� ū ģ�� , ���� ģ�� ����ϼ���.
--�����Լ� ���� group by :�Ұ�(�κ���) 
select * from student;
select sum(height) , avg(height), max(height), min(weight)
from student;
--���� ���� ������ �ʵ���� �׷� �ʵ��� ��. �Ϲ� �ʵ�ʹ� �Բ� ���Ұ�
select * from student;
select sum(height) , avg(height), max(height), min(weight)
from student 
group by grade; --�̷��� ���� �г⺰ sum avg max min ����.�Ϲ� �ʵ带 �׷�ȭ�Ѱ��� 

--emp_type ���� pay ��, ���, �ְ�޿�, ���ϱ޿� ���ϱ�.
select emp_type, sum(pay), avg(pay), max(pay), min(pay) 
from emp2
group by emp_type; --�����ϸ� emp type �� ��µ�

--����:where, having �� �̿��Ѵ�. having �� group by ������ �̿�
select grade, sum(height) , avg(height), max(height), min(weight)
from student 
group by grade
having avg(height)>172;

select emp_type, sum(pay), avg(pay), max(pay), min(pay) 
from emp2
group by emp_type
having avg(pay) >=30000000;

------------�����Լ�
select round(12.3456789,0),round(12.3456789,2),round(12.5456789,0) from dual; --�ݿø�
select ceil(12.34), ceil(-12.34) from dual; --�ø��� �� ����
select floor(12.34), floor(-12.34) from dual; --����

select *from dept2;
select *from dept2, emp2;
select ceil(12.34), ceil(-12.34), floor(12.34), floor(-12.34) from dual;

select trunc(12.3456789,2),trunc(12.3456789,2),trunc(12.5456789,0) from dual; 
--����

--�������̺��� ���� 2% �λ��� ��� ���

select bonus, round(bonus*1.02,1) from professor;
update professor set bonus =bonus + 1000;
select * from professor;


    select * from p_01;
        select * from p_02;
    rollback;
    
   INSERT ALL
       INTO p_01 VALUES (profno,name)
       INTO p_02 VALUES (profno,name)
   SELECT profno,name
    FROM professor
   WHERE profno BETWEEN 3000 AND 3999 ;
   
   INSERT ALL
    INTO p_01 
     VALUES (profno,name)
    INTO p_02 (no , name)
      VALUES(2,'BBB')
    SELECT  *  FROM  professor ;
    --insert all �� ���� �޾ƿ� select �� �ʿ���
    
  INSERT ALL
       INTO p_01 VALUES (profno,name)
        INTO p_02 VALUES (profno,name)
    SELECT *
   FROM professor
    WHERE profno BETWEEN 3000 AND 3999 ;
    
    --���� ���̺��� ��� �����鿡�� ���ʽ��� 100���� �߰� �����ϱ� (��ó�� �Ұ�)
    select bonus, nvl(bonus,0) + 1000 from professor;
    update professor set bonus = nvl(bonus,0)+1000;
-----------���ڿ� �Լ�----------------------------------

select id, upper(id) from professor;
select id, initcap(id) from professor;
select id, length(id), length('abcde') from professor;
select dname, length(dname), lengthb(dname) from dept2; --lengthb() ����Ʈ����
select length('�����') from dual; --dual ������ ���̺� || �ѱ۵� �ѱ��ڴ� 1����Ʈ
select lengthb('�����') from dual; --9����Ʈ( ����Ŭ���� �ѱ��� ���ڴ� 3����Ʈ)

select*from gogak;
select substr(jumin, 7, 1) from gogak;
select instr('abcd','b') from dual; -- index number : start 1~
select id, instr(id,'b')from professor;
select instr ('abcdefjiwerwesfbssfsjfbn', 'b', -1) from dual;
select instr ('abcdefjiwerwesfbssfsjfbn', 'b', -3) from dual;

select lpad('abcd',20,'#')from dual; --20�ڸ��� ���� �����ڸ��� #���� ��ü
select rpad('abcd',20,'@')from dual; --20�ڸ��� ������ �����ڸ��� @�� ��ü

select dname, length(dname), lengthb(dname) from dept2;
select dname, substr(dname, 3) from dept2;
select dname, substr(dname, 2, 3) from dept2;

select rpad(dname, 10, substr('1234567890', length(dname)+1))"RPAD����" from dept2;

select concat(name, position) || '��'
 from professor
  where deptno =101;
  
select name||position|| '��'
 from professor
  where deptno =101;

--order by
select*from emp2
 order by name, deptno desc, pay desc;
 
select*from emp2
  order by 2,4 desc, 8 desc;
  
-- ppt2�� �ǽ�







