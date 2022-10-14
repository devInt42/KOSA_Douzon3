-- View ----------------------------------------
/*
create or replace view 뷰이름
    as    뷰의 내용;
    
drop view 뷰이름;
*/

select * from professor;
select * from emp;

create or replace view  v_emp
    as   select empno, ename, deptno from emp; -- where deptno=20;
    
select * from v_emp;
drop view v_emp;

--emp 테이블 제거하면  v_emp ?   제거 O
--v_emp 테이블 제거하면  emp ?   제거 X


drop view v_student_join;

create or replace view  v_student_join
as
    select p.profno, p.name as "교수이름", p.position,
             s.studno, s.name 학생성명, s.grade, d.dname , p.deptno 
        from professor p join student s
        on p.profno = s.profno  join  department d
        on s.deptno1 = d.deptno ;

select * from v_student_join;

--문제10] 30번 부서 사원들의 직위, 이름, 월급을 담은 view 테이블 만들기 (emp)
drop view v_emp_30;

create view v_emp_30
as 
    select job , ename , sal
        from emp
        where deptno= 30;

select * from v_emp_30;

--문제11] 30번 부서 사원들의 직위, 이름, 월급을 담은 view 테이블 만드는데,
--    컬럼명을 직위, 사원이름, 급여로 Alias를 주고 월급이 2000보다 많은 사원들만 추출한다
create view v_emp30
as select job 직위, ename "사원 이름", sal 월급, deptno
    from emp
    where sal > 2000 and deptno=30 ;

select * from v_emp30;

--문제12] 부서별 최대급여, 최소급여, 평균급여를 갖는 view 만드시오
select avg(sal) from emp;

create view v_emp_deptno
as
    select deptno "부서", max(sal) 최대급여, min(sal) 최소급여, round(avg(sal), 3) "평균급여"
--    select deptno "부서", max(sal) 최대급여, min(sal) 최소급여, avg(sal) "평균급여"
        from emp
        group by deptno
        order by deptno ; 
        
select * from v_emp_deptno;

--문제13] 부서별 평균급여를 갖는 view 만드는데, 평균급여가 2000이상인 부서만 출력하세요.
create view v_emp_2000
as select deptno, round(avg(sal), 2) "부서평균"
    from emp
    group by deptno
    having avg(sal) > 2000 ;   -- 조건

select * from v_emp_2000;

select * from emp;
desc emp;
insert into emp(empno, ename, job, sal, deptno) values(8000, 'doyeon', 'manager', 4500, 40);
update emp set deptno = 50 where empno = 8000;  -- error
select * from dept;

--문제14]직위별 총급여를 구하는 view 테이블 만드는데, 직위(job)가 manager인 사원들은 제외하고
--    총급여가 3000 이상인 직원들만 저장한 테이블 만들기
CREATE OR REPLACE VIEW v_emp_job AS 
    SELECT * FROM emp 
        WHERE job not in ('MANAGER', 'manager')  -- 
        AND sal >= 3000;
--------------------------------------------
CREATE OR REPLACE VIEW v_emp_job2 AS 
    SELECT job, sum(sal) "총급여"
        FROM emp 
        where job <> 'MANAGER' and job <> 'manager'   -- WHERE job != 'MANAGER' and job != 'manager' 
        group by job
        having sum(sal) > 3000;

select * from v_emp_job2;    
    
--문제15]학생 테이블에서 학년별 평균 키와 몸무게가 키는 165 이상이고,
--    몸무게는 60이상인 사람들만 출력하는 뷰 테이블 만들기
create view v_student_학년별평균키
as
    select name 이름, grade 학년, round(avg(height), 1) 평균키, round(avg(weight), 1) 평균몸무게
        from student
        GROUP by grade, name
        having avg(height) >= 165 and avg(weight) >= 60 ;
    
select * from v_student_학년별평균키;
drop view v_student_학년별평균키;
    
--문제16]교수테이블에서 전임강사 들만 있는 가상 테이블 만들기

-- 제약조건 확인(테이블 & 칼럼) 및 제약조건 제거
select *
    from all_constraints
    where TABLE_NAME = '테이블명' ;   -- 데이터 딕셔너리에는 대문자
    
select *
    from all_constraints
    where TABLE_NAME = 'DEPT' ; 
--    where TABLE_NAME = 'EMP' ; 
--    where TABLE_NAME = 'C_EMPALL' ;   -- 제약조건 복사되지 않는다.

-- 제약조건 제거
alter table 테이블명  drop CONSTRAINT 제약조건명 cascade ;
ex) alter table Board  drop CONSTRAINT board_no_pk cascade

alter table dept  drop CONSTRAINT pk_dept ;  -- ORA-02273: 고유/기본 키가 외부 키에 의해 참조되었습니다
alter table dept  drop CONSTRAINT pk_dept cascade; 

-- PK 생성
alter table 테이블명  add ( CONSTRAINT 제약조건명  primary key (컬럼명1, 컬럼명2,...) );
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
    
-- 레코드 복사 -------------------------
--형식>
insert into 테이블이름
    select 컬럼명, ... from 테이블이름 ;
    
select * from c_emp4;

create table c_emp6
    as   select ename, empno, hiredate from emp where 1=0;
select * from c_emp6;

insert into c_emp6
    select  EMP_TYPE , pay, BIRTHDAY from emp2 ;  -- 레코드 갯수, 데이터 타입, 데이터 크기 맞추면 됨.
    
alter table c_emp6 modify ename varchar(16);
alter table c_emp6 modify empno number;

desc c_emp6;
desc emp2;   -- EMP_TYPE , pay, BIRTHDAY
------------------------------------------------------------
실습 문서 Oracle SQL_PLSQL_PPT > ppt 4, 5, 10장 




