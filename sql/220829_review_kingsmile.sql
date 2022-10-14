--count
/*
count(*) null값 포함 count(hpage) null값 제외
중복값 포함, count(distinct hpage) 중복제외
*/
select count(*), count(hpage)
 from professor;
 
 --sum count avg max min
 select count(bonus), sum(bonus), avg(bonus), max(bonus), min(bonus)
  from professor;
  
  --GROUP BY
  select deptno, Round(AVG(NVL(pay,0)),2) "평균급여"
   from professor
   GROUP BY deptno; --deptno별 avg출력
  
select deptno, AVG(NVL(pay,0)) "평균급여"
   from professor
   GROUP BY deptno
    Having avg(pay)>450; --deptno별 avg출력
--where 절을 통해 조건을 주면 오류  
  
--ppt38
select pay,bonus from professor;
select MAX(NVL(pay+bonus,0)) MAX ,MIN(NVL(pay+bonus,0)) MIN ,AVG(NVL(pay+bonus,0)) AVG
  from professor;
select*from student;

--문제3]
select count(birthday) 합계, 
count(decode(to_char(birthday,'MM'),01,0)) as "1월",
count(decode(to_char(birthday,'MM'),02,0)) as "2월",
count(decode(to_char(birthday,'MM'),03,0)) as "3월",
count(decode(to_char(birthday,'MM'),04,0)) as "4월",
count(decode(to_char(birthday,'MM'),05,0)) as "5월",
count(decode(to_char(birthday,'MM'),06,0)) as "6월",
count(decode(to_char(birthday,'MM'),07,0)) as "7월",
count(decode(to_char(birthday,'MM'),08,0)) as "8월",
count(decode(to_char(birthday,'MM'),09,0)) as "9월",
count(decode(to_char(birthday,'MM'),10,0)) as "10월",
count(decode(to_char(birthday,'MM'),11,0)) as "11월",
count(decode(to_char(birthday,'MM'),12,0)) as "12월"
from student;  

--4장 조인
--문제 1]
select *from professor;
select p.profno as "교수번호", p.name as "교수명", p.hiredate as "입사일", 
count(pr.hiredate)-1 "빠른사람"
from professor p, professor pr
where p.hiredate<pr.hiredate
group by p.hiredate, p.name, p.hiredate
order by hiredate;