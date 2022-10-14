-- 조인----------------
-- 두개 이상의 테이블을 하나의 테이블로 만들어 한번의 검색으로 여러 컬럼의 정보를 확인할 때 사용함
--inner Join
--Outer Join
--    left outer Join
--    right outer Join
--    full outer Join

select*from emp; -- 레코드 14개
select*from dept; -- 레코드 4개
select*from emp, dept;

select ename, job, sal, e.deptno, dname -- 테이블명.필드명
from emp e, dept d
where e.deptno = d.deptno; --inner join

select ename, job, sal, e.deptno, dname
 from emp e join dept d --inner join
 on e.deptno = d.deptno;


select ename, job, sal, e.deptno, dname
 from emp e left outer join dept d 
 -- left outer join : 왼쪽에 있는 데이터 모두, 오른쪽 일치하는 데이터만
 on e.deptno = d.deptno;

select ename, job, sal, e.deptno, dname
 from emp e right outer join dept d 
  -- right outer join : 오른쪽 있는 데이터 모두, 왼쪽 일치하는 데이터만
 on e.deptno = d.deptno;

desc dept;
insert into dept(deptno, loc) values(50,'SEOUL');
select * from dept;

select ename, job, sal, e.deptno, dname
 from dept d right outer join emp e
  -- right outer join : 오른쪽 있는 데이터 모두, 왼쪽 일치하는 데이터만
 on e.deptno = d.deptno;
 
-- 문제] professor / student table 이용
-- inner join
-- outer join - left/right
select*from professor;
select*from student;
--교수이름, 직위, 학과코드, 교수코드, 학생이름, 학번, 학년, 주전공학과

--이너조인
select p.name as "교수이름" , p.position as "직위", p.deptno "학과번호", s.profno as "교수코드", s.name "학생이름", s.studno as "학번", s.grade as "학년", s.deptno1 " 주전공학과"
    from professor p join student s
    on p.deptno = s.deptno1;

--left outer join
select p.name as "교수이름" , p.position as "직위", p.deptno "학과번호", s.profno as "교수코드", s.name "학생이름", s.studno as "학번", s.grade as "학년", s.deptno1 " 주전공학과"
    from professor p left outer join student s
    on p.profno = s.profno;    

--right outer join
select p.name as "교수이름" , p.position as "직위", p.deptno "학과번호", s.profno as "교수코드", s.name "학생이름", s.studno as "학번", s.grade as "학년", s.deptno1 " 주전공학과"
    from professor p right outer join student s
    on p.profno = s.profno;
    
    
--select 컬럼명, 
--from 테이블명 별칭 joint 테이블명 별칭
--on 별칭.컬럼명 = 별칭.컬럼명

select * from department;

select p.profno as "교수번호", p.name as "교수명", 
s.studno as "학번", s.name as "학생이름", d.dname as "과이름"
from professor p join student s
on p.profno = s.profno right outer join department d
on s.deptno1 = d.deptno;

--사원이름, 부서이름, 직책, 매니저번호 출력 emp/dept 테이블 이용
select*from emp e, dept d;
select*from emp;
select*from dept;
select e.ename as"사원이름", d.dname as "부서이름", 
e.job as "직책", e.mgr as "매니저 번호"
from emp e join dept d
on e.deptno = d.deptno;

--self join
select e.ename as"사원이름", e.job as "직책", 
e.mgr as "매니저 번호", em.ename as "매니저 이름"
from emp e join emp em
on e.mgr = em.empno;

--테이블 복사 / 레코드 복사 ---------------
/* 형식>
Creat table 테이블 이름
    as select 필드명, .... from 테이블명;
*/
select*from emp;
create table c_empAll
    as select * from emp;   --제약조건 복사 안됨

select * from c_empAll;
desc c_empAll;
desc emp;

create table c_emp_20
    as select*from emp where deptno=20;
    
select*from c_emp_20;

create table c_emp_30
    as select empno 사번, ename 사원명, job 직책, sal 급여 from emp where deptno=30;
    
select*from c_emp_30;

select*from c_empAll;  --조건에 맞게 복사
select * from c_emp_20; --조건에 맞게 복사
select * from c_emp_30; --조건에 맞게 복사

-- 제약조건 확인방법 1) 틀이용 2) 명령어
select * from all_constraints
    where Table_name = 'EMP'; --데이터 딕셔너리에는 대부분 대문자로 저장됨

--문제1] 교수 테이블에서 전임강사만 뽑아서 테이블 생성하기
select*from professor;
create table c_prof as select*from professor where position = '전임강사';
select * from c_prof;

--문제2] emp 테이블에서 mgr이 7566번인 사람만 추출해서 새로운 테이블 생성하기
select*from emp;
create table c_empmgr as select*from emp where mgr = 7566;
select*from c_empmgr;

/* 구조물만 복사하길 원할 때
create table 테이블명
    as select 필드명...from 테이블명 where 1=0; 
*/

create table c_emp4
    as select*from emp where 1=0;

create table c_emp5
    as select empno, ename, job, sal from emp;

select*from c_emp5;

select*from c_empAll;   --전체 복사
select*from c_emp_20;    -- 조건에 맞게 복사
select*from c_emp_30;    -- 조건적용, 별칭
select*from c_emp4;     -- 구조물만 복사, 레코드 없음
select*from c_emp5;     -- 원하는 필드에 해당하는 레코드 복사, empno, ename, job, sal

--Union ----- pk/fk 관계 아닌 상태 테이블 합치기
select*from emp
    union 
        select*from c_empAll;

--중복레코드 포함
select*from emp
    union all
        select*from c_empAll;

insert into c_empAll values(7788, 'kingsmile','managaer',7566, '2022/01/17',5000,1000,30);

--select empno, ename, job, sal from emp --필드 갯수와 데이터 타입이 일치해야함
select empno, ename, job, comm from emp --hireate
union
    select*from c_emp5;
    
desc emp;

--검색 쿼리문은 대소문자 구분X 단 레코드는 대소문자 구분한다.
select*from c_empall;
select*from c_empall where job = 'manager';
select*from c_empall where job = 'MANAGER' or job='manager';
select*from c_empall where job in ('MANAGER','manager'); --or 연산은 in이 훨씬 빠름

select empno 사원번호,  ename  이름,  sal 급여
    from emp
    where ename='FORD'
--     where 이름='FORD';  -- 별칭으로 조건 X
    order by 급여 desc ;   -- 별칭으로 정렬 O

--문제2] 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되
-- 컬럼명을 New Salary로 지정하여 출력하라
select empno, ename, sal, sal*1.15 as "New Salary" from emp;
select empno, ename, sal, round(sal*1.15,0) as "New Salary" from emp;
select empno, ename, sal, cast(sal*1.15 as int) as "New Salary" from emp;   --cast(필드 as 자료형)

--문제3] 2번 문제와 동일한 데이터에서 급여 인상분(새 급여에서 이전 급여를 뺀 값)을 추가해서 출력
--컬럼명은 increase로
select empno, ename, sal,(sal*1.15)-sal as Increase from emp;

--문제4] 각 사원의 이름을  표시하고 근무 달 수를 계산하여 컬럼명을 
--Months_Works로 지정하고, 근무 달수를 기준으로 오래된 사람부터 정렬하여 출력하라

select ename, floor(months_between(sysdate,hiredate)) as "Months_Works" from emp
order by hiredate desc;

--문제5] 사원의 이름과 커미션을 출력하되 커미션이 책정되지 않은 사원의 커미션은 'no commision'으로 출력
select*from emp;
select ename, nvl(to_char(comm),'no commision') as comm from emp;