select * from emp2;
select name, empno, deptno from emp2;
select name,empno, deptno-- emp_type 
    from emp2
    where emp_type='정규직'
    order by name desc; -- asc :생략가능
select name,empno, deptno-- emp_type 
    from emp2
   -- where emp_type='정규직'
    order by name desc, deptno asc;
    
select DISTINCT deptno
    from emp2;

select name as "성 명", empno 사원번호, deptno "부 서", emp_type as 근무타입, position as "직    급"-- as 생략가능
    from emp2
    where position = '부장';
    
select name as "성 명", empno 사원번호, deptno "부 서", emp_type as 근무타입, position as "직    급"-- as 생략가능
    from emp2
    where position = '과장' or name = '유관순';
select name as "성 명", empno 사원번호, deptno "부 서", emp_type as 근무타입, position as "직    급"-- as 생략가능
    from emp2
    where position = '과장' and name = '유관순';
desc emp2;
select *
    from emp2
    where deptno = 1000;

select* from professor;
select *
    from professor
    --where position = '정교수' or position = '조교수';
    where position in('정교수', '조교수');
select *
    from student
    where grade in(3,2,1); --where grade = 3 or grade = 2 or grade = 1
select *
    from student
    where grade not in(3,2,1); --where grade = 3 or grade = 2 or grade = 1

select *
    from professor
    where deptno BETWEEN 103 and 201;
    --where deptno BETWEEN 201 and 103; --앞에 숫자가 작아야한다

select *
    from emp2
    where name like '%윤%';

select *
    from professor
    where name like'__';

select *
    from professor
    where name like '허_';
 --   where name like '_은';
 --   where name like '__';   
    
select *
    from professor
--    where name like '나_%; -- '나_';
    where name like '%원_';

--숫자---
select * from professor
--where pay > 500;
where pay <= 300;

    