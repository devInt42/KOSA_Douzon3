--16. SubQuery
--① 메인 쿼리 안에서 또 다른 쿼리문이 있는 것.
--② 반드시 서브쿼리를 괄호로 묶는다.
--③ 메인쿼리 보다 서브쿼리가 먼저 실행되어 결과를 메인 쿼리의 조건으로 사용
--④ 서브쿼리의 결과가 한 개 이상 반환될때는 in , any, all 연산자를 사용함.
--⑤ 서브쿼리의 결과가 한 개일 때는 비교연산자 사용함.
--ex) select * from emp where ename = ( 서브쿼리문장 ) ; 
--스칼라 서브쿼리 vs 인라인뷰 vs 서브쿼리
select * from emp2;
select * from emp2 where name = '백원만';
select pay from emp2 where name = '백원만';

--서브 쿼리
select*from emp2 where pay> (select pay from emp2 where name = '백원만');

--문제1] student 테이블과 department 테이블을 사용하여 이윤나 학생과 전공(dept01)이 
--동일한 학생들의 이름과 전공 이름을 출력

select s.name as "이름", d.dname as "전공" from student s, department d
 where d.deptno = (select deptno1 from student where name = '이윤나');


--문제2] 교수테이블에서 입사일 송도권 교수보다 나중에 입사한 사람의 입사일, 학과명을 출력하세요.

select p.hiredate as "입사일", d.dname as "학과명" 
 from professor p, department d
  where p.hiredate < (select hiredate from professor where name = '송도권') and p.deptno = d.deptno;
 
--문제3] 학생테이블에서 전공1이 101인 학과의 평균 몸무게보다 많이 나가는 학생들의 이름과 몸무게를 출력하세요.

select name as "이름", weight as "몸무게" 
 from student s
  where weight > (select avg(weight) from student where deptno1 = 101 group by deptno1) and deptno1 = 101;
 
--문제4] emp2 테이블을 사용하여 전체 직원 중 과장 직급의 최소 연봉자보다 연봉이 높은 사람의 이름과 직급, 연봉을 출력하세요.
--  단, 연봉 출력 형식은 천 단위 구분기호(,)와 원 표시까지해서 출력하기
select*from emp2;
select name as "이름", position as "직급", to_char(pay, 'L999,999,999')||'원' as "연봉"
 from emp2 
  where pay > (select min(pay) from emp2 where position = '과장');

--문제5]student 테이블을 조회하여 전체 학생 중에서 체중이 4학년 학생들의 체중에서 가장 적게 나가는 
-- 학생보다 적은 학생의 이름과 학년과 몸무게를 출력.
select name as "이름", grade as "학년", weight as "몸무게" 
 from student 
 where weight < (select min(weight) from student where grade = 4 group by grade);

--문제6]student 테이블을 조회하여 각 학년별로 최대 키를 가진 학생들의 학년과 이름과 키를 출력.
select grade as "학년", name as "이름", height as "키"
 from student 
  where (grade, height) in (select grade, max(height)from student group by grade)
   order by grade;


--문제7]professor 테이블을 조회하여 각 학과별로 입사일이 가장 오래된 교수의 교수번호와 이름, 입사일, 학과명을 출력. 
-- 단, 학과명순으로 오름차순 정렬.
select p.profno as "교수번호", p.name as "이름", p.hiredate as "입사일", d.dname as "학과명" 
 from professor p, department d
  where d.deptno = p.deptno and 
    (p.deptno, p.hiredate) in (select deptno, min(hiredate) from professor group by deptno)
   order by d.dname;
 
--문제8]Emp2 테이블을 조회하여 직급별로 해당 직급에서 최대 연봉을 받는 직원의 이름과 직급, 연봉을 출력하세요. 
--연봉순으로 오름차순 정렬하세요.

select name as "이름", position as "직급", pay as "연봉" 
 from emp2 
  where (position, pay) in (select position, max(pay) from emp2 group by position)
   order by pay;

--문제9]emp2 평균 급여보다 작은 사람 출력하세요.
select * from emp2 where pay < (select avg(pay) from emp2);
    
