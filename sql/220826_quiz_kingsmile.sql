select * from emp2 order by name asc;

--정규직 이면서 '백원만' 찾기
select * from emp2 where emp_type = '정규직' and name = '백원만';
--정규직 이거나 '유도봉' 찾기
select * from emp2 where emp_type = '정규직' or name = '유도봉';

--수습직 이거나 김씨성을 가진 사람 찾기
select * from emp2 where emp_type = '수습직' or name like '김%';

--김씨가 아닌 수습직원 찾기
select * from emp2 where emp_type = '수습직' and name not like '김%';

--문제1] 이름에서 '김영조' 사람들을 보여주세요
select*from professor where name = '김영조';
--문제2] 이름에서 '김'씨 성을 가진 사람들을 보여주세요. -모든 : %, 한글자 :_
select * from professor where name like '김%';
--문제3] 이름이 두 글자인 사람 보여주세요
select * from professor where name like '__';
--문제4] id에 s or a 글자가 들어가는 사람 찾기 (professor table)
select * from professor where id like'%s%' or id like'%a%';
--문제5] 전임강사를 찾아주세요
select * from professor where position = '전임강사';

--문제6] 학년이 3학년이고 키가 165 이상인 학과코드가 101인 학생
select * from student;
select*from student
where grade=3 and height>=165 and deptno1 = 101;

--문제7] 생일이 77년 이전인 학생들 찾기
select * from student where birthday <= '77/01/01';
--문제8] 부전공(deptno2)을 가진 학생들만 찾기
select * from student where deptno2 is not null;
select deptno2, nvl(deptno2, '11'),  name 
--select deptno2, nvl(deptno2, 0),  name   -- nvl(값또는필드명, 대체값)
    from student;
    
--문제9] 담당교수가 1000~2001번 사이 학생들 찾기
select * from student where profno >=1000 and profno <=2001; 
select * from student where profno between 1000 and 2001; 

desc student;
select * from professor
order by 2 desc, position, email; --asc desc
--필드번호로도 정렬 가능

select * from professor
where pay >= any(300,400,700); 


select * from professor
where nvl(bonus,0) >= any(0,40,50); 

select * from professor
where pay <= all(300,400,500);
select * from professor
where pay >= all(300,400,500); 
/*
> ANY : 최소값 보다 크면
 필드명(pay) >= ANY : 최소값보다 크거나 같으면   any( 300, 550, 400 )
  < ANY : 최대값보다 작으면
  <= ANY : 최대값보다 작거나 같으면
   = ANY : IN과 같은 효과
  != ANY : NOT IN과 같은 효과
*/
select * from professor where pay >= any( 300, 550, 400 );
select * from student where weight > any( 70, 80 );  -- 
select * from student where weight < any( 60, 70 );

/*
ANY와는 반대되는 개념입니다.

  필드명(pay) > ALL : 최대값 보다 크면  all( 300, 550, 400 )
>= ALL : 최대값보다 크거나 같으면
< ALL : 최소값보다 작으면
<= ALL : 최소값보다 작거나 같으면
= ALL : SUBSELECT의 결과가 1건이면 상관없지만 여러 건이면 오류가 발생합니다.
!= ALL : 위와 마찬가지로 SUBSELECT의 결과가 여러 건이면 오류가 발생합니다
*/
select * from professor where pay >= all( 300, 550, 400 );
select * from student where weight > all( 70, 80 );  -- 
select * from student where weight < all( 60, 70 );
---------------함수
--1.집계(그룹)함수
--
select * from gift;
select sum(g_start) 최저가합계,sum(g_end) "최고가 합계" from gift;
select min(g_start) 최저가저가,max(g_end) "최고가 고가" from gift;
select avg(g_start) 최저가평균,avg(g_end) "최고가 편균" from gift;--널 제외

select * from professor;

select count(*) "보너스수" from professor;

SELECT RANK(30) within GROUP(ORDER BY bonus )
FROM professor
where pay is not null;
--oracle은 null 값이 우선순위 높음
--mysql은 null값이 우선순위 낮음

--문제 키가 168인 사람은 몇번째로 크냐
select rank(168) within group(order by height desc)
from student;
select * from student;

--2몸무게가 58인 사람은 몇번째로 무겁냐
select rank(58) within group(order by weight)
from student;
--3 g_end가 200000, 600000보다 작은 값 출력(any 이용)

select *
from gift
where g_end <= any(200000,600000);

--4문제 학생들의 키의 합과 평균 가장 키가 큰 친구 , 작은 친구 출력하세요.
--집계함수 사용시 group by :소계(부분합) 
select * from student;
select sum(height) , avg(height), max(height), min(weight)
from student;
--위와 같이 생성된 필드들을 그룹 필드라고 함. 일반 필드와는 함께 사용불가
select * from student;
select sum(height) , avg(height), max(height), min(weight)
from student 
group by grade; --이렇게 쓰면 학년별 sum avg max min 나옴.일반 필드를 그룹화한거임 

--emp_type 별로 pay 합, 평균, 최고급여, 최하급여 구하기.
select emp_type, sum(pay), avg(pay), max(pay), min(pay) 
from emp2
group by emp_type; --일케하면 emp type 도 출력됨

--조건:where, having 절 이용한다. having 은 group by 절에서 이용
select grade, sum(height) , avg(height), max(height), min(weight)
from student 
group by grade
having avg(height)>172;

select emp_type, sum(pay), avg(pay), max(pay), min(pay) 
from emp2
group by emp_type
having avg(pay) >=30000000;

------------숫자함수
select round(12.3456789,0),round(12.3456789,2),round(12.5456789,0) from dual; --반올림
select ceil(12.34), ceil(-12.34) from dual; --올림한 후 정수
select floor(12.34), floor(-12.34) from dual; --내림

select *from dept2;
select *from dept2, emp2;
select ceil(12.34), ceil(-12.34), floor(12.34), floor(-12.34) from dual;

select trunc(12.3456789,2),trunc(12.3456789,2),trunc(12.5456789,0) from dual; 
--버림

--교수테이블에서 월금 2% 인상한 결과 출력

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
    --insert all 은 값을 받아올 select 기 필요함
    
  INSERT ALL
       INTO p_01 VALUES (profno,name)
        INTO p_02 VALUES (profno,name)
    SELECT *
   FROM professor
    WHERE profno BETWEEN 3000 AND 3999 ;
    
    --교수 테이블에서 모든 교수들에게 보너스를 100원씩 추가 지급하기 (널처리 할것)
    select bonus, nvl(bonus,0) + 1000 from professor;
    update professor set bonus = nvl(bonus,0)+1000;
-----------문자열 함수----------------------------------

select id, upper(id) from professor;
select id, initcap(id) from professor;
select id, length(id), length('abcde') from professor;
select dname, length(dname), lengthb(dname) from dept2; --lengthb() 바이트단위
select length('사장실') from dual; --dual 가상의 테이블 || 한글도 한글자당 1바이트
select lengthb('사장실') from dual; --9바이트( 오라클에서 한글은 글자당 3바이트)

select*from gogak;
select substr(jumin, 7, 1) from gogak;
select instr('abcd','b') from dual; -- index number : start 1~
select id, instr(id,'b')from professor;
select instr ('abcdefjiwerwesfbssfsjfbn', 'b', -1) from dual;
select instr ('abcdefjiwerwesfbssfsjfbn', 'b', -3) from dual;

select lpad('abcd',20,'#')from dual; --20자리중 왼쪽 공백자리는 #으로 대체
select rpad('abcd',20,'@')from dual; --20자리중 오른쪽 공백자리는 @로 대체

select dname, length(dname), lengthb(dname) from dept2;
select dname, substr(dname, 3) from dept2;
select dname, substr(dname, 2, 3) from dept2;

select rpad(dname, 10, substr('1234567890', length(dname)+1))"RPAD연습" from dept2;

select concat(name, position) || '님'
 from professor
  where deptno =101;
  
select name||position|| '님'
 from professor
  where deptno =101;

--order by
select*from emp2
 order by name, deptno desc, pay desc;
 
select*from emp2
  order by 2,4 desc, 8 desc;
  
-- ppt2장 실습







