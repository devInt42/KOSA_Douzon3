--count
/*
count(*) null�� ���� count(hpage) null�� ����
�ߺ��� ����, count(distinct hpage) �ߺ�����
*/
select count(*), count(hpage)
 from professor;
 
 --sum count avg max min
 select count(bonus), sum(bonus), avg(bonus), max(bonus), min(bonus)
  from professor;
  
  --GROUP BY
  select deptno, Round(AVG(NVL(pay,0)),2) "��ձ޿�"
   from professor
   GROUP BY deptno; --deptno�� avg���
  
select deptno, AVG(NVL(pay,0)) "��ձ޿�"
   from professor
   GROUP BY deptno
    Having avg(pay)>450; --deptno�� avg���
--where ���� ���� ������ �ָ� ����  
  
--ppt38
select pay,bonus from professor;
select MAX(NVL(pay+bonus,0)) MAX ,MIN(NVL(pay+bonus,0)) MIN ,AVG(NVL(pay+bonus,0)) AVG
  from professor;
select*from student;

--����3]
select count(birthday) �հ�, 
count(decode(to_char(birthday,'MM'),01,0)) as "1��",
count(decode(to_char(birthday,'MM'),02,0)) as "2��",
count(decode(to_char(birthday,'MM'),03,0)) as "3��",
count(decode(to_char(birthday,'MM'),04,0)) as "4��",
count(decode(to_char(birthday,'MM'),05,0)) as "5��",
count(decode(to_char(birthday,'MM'),06,0)) as "6��",
count(decode(to_char(birthday,'MM'),07,0)) as "7��",
count(decode(to_char(birthday,'MM'),08,0)) as "8��",
count(decode(to_char(birthday,'MM'),09,0)) as "9��",
count(decode(to_char(birthday,'MM'),10,0)) as "10��",
count(decode(to_char(birthday,'MM'),11,0)) as "11��",
count(decode(to_char(birthday,'MM'),12,0)) as "12��"
from student;  

--4�� ����
--���� 1]
select *from professor;
select p.profno as "������ȣ", p.name as "������", p.hiredate as "�Ի���", 
count(pr.hiredate)-1 "�������"
from professor p, professor pr
where p.hiredate<pr.hiredate
group by p.hiredate, p.name, p.hiredate
order by hiredate;