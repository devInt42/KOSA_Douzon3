--4. ��¥�Լ�

--1. sysdate ���� ��¥�� �ð�
select sysdate from dual;

--2. month_between(��¥, ��¥) => �� ��¥ ������ �������� ����  
select months_between('22/08/01','21/09/01') from dual;

--3. add_months(��¥, ����) => ��¥���� ���ڸ�ŭ ���� ����
select add_months('22/08/29',4) from dual;

--4. next_day(��¥, ����) => ��¥���� ���� ����� ������ ��¥ ����
    --1 �Ͽ��� , 2 ������, 3 ȭ����
select next_day('22/08/29', 5) from dual;
select next_day('22/08/29', 'ȭ') from dual;

--5. last_day=> ��¥ ���� ������ ��¥�� ����
select last_day('22/02/12') from dual;
select last_day('22/03/12') from dual;
select last_day('22/04/12') from dual;

--6. to_char    
select to_char(sysdate, 'yyyy-mm--dd hh:mi:ss') from dual;
select to_char(sysdate, 'yy-mm-dd hh:mi') from dual;

--24�ð� ǥ��
select to_char(sysdate, 'yy/mm-dd hh24:mi') from dual;

--to_char(number, format����) => ���ڸ� ������������ ��ȯ
select to_char(2000, '999,999') from dual;
select to_char(213531122, '999,999,999') from dual;
select to_char(213532, '999,999') from dual;

-- ������ ���� ȭ�� ǥ��
select to_char(2000, 'L999,999') from dual;
select to_char(2000, '$999,999') from dual;

-- 13. �Լ�
select*from dept;


select deptno, DECODE(deptno, 10, 'ACCOUNTING',
20, 'RESEARCH', 
30,'SALES', 
'OPERATIONS')name
from dept;

select deptno, DECODE(deptno, 10, '�Ǳ���',
20, '������', 
30,'��ž��', 
'���ﺻ��')name
from dept;

--db�� �Է¹��� ������� ��µǱ� ������ 30 10 20
select deptno, DECODE(deptno, 
    10, sum(sal),
    20, max(sal), 
    30,min(sal))sal
from emp
group by deptno;

select deptno, DECODE(deptno, 
    10, sum(sal),
    20, max(sal), 
    30,min(sal))sal
from emp
group by deptno
order by deptno;

--
select*from professor;
select*from emp;

--select deptno,  NVL(sum(decode(deptno, 101, pay)),0)deptno101,
--                NVL(sum(decode(deptno, 102, pay)),0)deptno102,
--                NVL(sum(decode(deptno, 103, pay)),0)deptno103,
--                NVL(sum(decode(deptno, 201, pay)),0)deptno201,
--                NVL(sum(decode(deptno, 202, pay)),0)deptno202,
--                NVL(sum(decode(deptno, 203, pay)),0)deptno203,
--                NVL(sum(decode(deptno, 301, pay)),0)deptno301
--from professor
--group by deptno;

    SELECT deptno, NVL(SUM(DECODE(deptno, 101, pay)),0) deptno101, 
               NVL(SUM(DECODE(deptno, 102, pay)),0) deptno102,
               NVL(SUM(DECODE(deptno, 103, pay)),0) deptno103,
               NVL(SUM(DECODE(deptno, 201, pay)),0) deptno201,
               NVL(SUM(DECODE(deptno, 202, pay)),0) deptno202,
               NVL(SUM(DECODE(deptno, 203, pay)),0) deptno203,
               NVL(SUM(DECODE(deptno, 301, pay)),0) deptno301
  FROM professor
 GROUP BY deptno; 

select*from emp;

SELECT ename, sal,
    case
        when sal < 1000 then sal+(sal*0.8)
        when sal between 1000 and 2000 then sal+(sal*0.5)
        when sal between 2001 and 3000 then sal+(sal*0.3)
        else sal+(sal*0.1)
    end sal
from emp;

-- ����] pdept�� ���� ������� ����ϼ��� (dcode, case �̿�)
select*from dept2;
select dname, decode(pdept, 0001, area,
1000, area,
1003, area,
1005, area,
1006, area,
1007, area,
area
) 

from dept2;

