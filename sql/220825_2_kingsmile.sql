select * from emp2;
select name, empno, deptno from emp2;
select name,empno, deptno-- emp_type 
    from emp2
    where emp_type='������'
    order by name desc; -- asc :��������
select name,empno, deptno-- emp_type 
    from emp2
   -- where emp_type='������'
    order by name desc, deptno asc;
    
select DISTINCT deptno
    from emp2;

select name as "�� ��", empno �����ȣ, deptno "�� ��", emp_type as �ٹ�Ÿ��, position as "��    ��"-- as ��������
    from emp2
    where position = '����';
    
select name as "�� ��", empno �����ȣ, deptno "�� ��", emp_type as �ٹ�Ÿ��, position as "��    ��"-- as ��������
    from emp2
    where position = '����' or name = '������';
select name as "�� ��", empno �����ȣ, deptno "�� ��", emp_type as �ٹ�Ÿ��, position as "��    ��"-- as ��������
    from emp2
    where position = '����' and name = '������';
desc emp2;
select *
    from emp2
    where deptno = 1000;

select* from professor;
select *
    from professor
    --where position = '������' or position = '������';
    where position in('������', '������');
select *
    from student
    where grade in(3,2,1); --where grade = 3 or grade = 2 or grade = 1
select *
    from student
    where grade not in(3,2,1); --where grade = 3 or grade = 2 or grade = 1

select *
    from professor
    where deptno BETWEEN 103 and 201;
    --where deptno BETWEEN 201 and 103; --�տ� ���ڰ� �۾ƾ��Ѵ�

select *
    from emp2
    where name like '%��%';

select *
    from professor
    where name like'__';

select *
    from professor
    where name like '��_';
 --   where name like '_��';
 --   where name like '__';   
    
select *
    from professor
--    where name like '��_%; -- '��_';
    where name like '%��_';

--����---
select * from professor
--where pay > 500;
where pay <= 300;

    