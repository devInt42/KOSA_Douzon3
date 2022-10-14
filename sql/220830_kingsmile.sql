--16. SubQuery
--�� ���� ���� �ȿ��� �� �ٸ� �������� �ִ� ��.
--�� �ݵ�� ���������� ��ȣ�� ���´�.
--�� �������� ���� ���������� ���� ����Ǿ� ����� ���� ������ �������� ���
--�� ���������� ����� �� �� �̻� ��ȯ�ɶ��� in , any, all �����ڸ� �����.
--�� ���������� ����� �� ���� ���� �񱳿����� �����.
--ex) select * from emp where ename = ( ������������ ) ; 
--��Į�� �������� vs �ζ��κ� vs ��������
select * from emp2;
select * from emp2 where name = '�����';
select pay from emp2 where name = '�����';

--���� ����
select*from emp2 where pay> (select pay from emp2 where name = '�����');

--����1] student ���̺�� department ���̺��� ����Ͽ� ������ �л��� ����(dept01)�� 
--������ �л����� �̸��� ���� �̸��� ���

select s.name as "�̸�", d.dname as "����" from student s, department d
 where d.deptno = (select deptno1 from student where name = '������');


--����2] �������̺��� �Ի��� �۵��� �������� ���߿� �Ի��� ����� �Ի���, �а����� ����ϼ���.

select p.hiredate as "�Ի���", d.dname as "�а���" 
 from professor p, department d
  where p.hiredate < (select hiredate from professor where name = '�۵���') and p.deptno = d.deptno;
 
--����3] �л����̺��� ����1�� 101�� �а��� ��� �����Ժ��� ���� ������ �л����� �̸��� �����Ը� ����ϼ���.

select name as "�̸�", weight as "������" 
 from student s
  where weight > (select avg(weight) from student where deptno1 = 101 group by deptno1) and deptno1 = 101;
 
--����4] emp2 ���̺��� ����Ͽ� ��ü ���� �� ���� ������ �ּ� �����ں��� ������ ���� ����� �̸��� ����, ������ ����ϼ���.
--  ��, ���� ��� ������ õ ���� ���б�ȣ(,)�� �� ǥ�ñ����ؼ� ����ϱ�
select*from emp2;
select name as "�̸�", position as "����", to_char(pay, 'L999,999,999')||'��' as "����"
 from emp2 
  where pay > (select min(pay) from emp2 where position = '����');

--����5]student ���̺��� ��ȸ�Ͽ� ��ü �л� �߿��� ü���� 4�г� �л����� ü�߿��� ���� ���� ������ 
-- �л����� ���� �л��� �̸��� �г�� �����Ը� ���.
select name as "�̸�", grade as "�г�", weight as "������" 
 from student 
 where weight < (select min(weight) from student where grade = 4 group by grade);

--����6]student ���̺��� ��ȸ�Ͽ� �� �г⺰�� �ִ� Ű�� ���� �л����� �г�� �̸��� Ű�� ���.
select grade as "�г�", name as "�̸�", height as "Ű"
 from student 
  where (grade, height) in (select grade, max(height)from student group by grade)
   order by grade;


--����7]professor ���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� ���� ������ ������ ������ȣ�� �̸�, �Ի���, �а����� ���. 
-- ��, �а�������� �������� ����.
select p.profno as "������ȣ", p.name as "�̸�", p.hiredate as "�Ի���", d.dname as "�а���" 
 from professor p, department d
  where d.deptno = p.deptno and 
    (p.deptno, p.hiredate) in (select deptno, min(hiredate) from professor group by deptno)
   order by d.dname;
 
--����8]Emp2 ���̺��� ��ȸ�Ͽ� ���޺��� �ش� ���޿��� �ִ� ������ �޴� ������ �̸��� ����, ������ ����ϼ���. 
--���������� �������� �����ϼ���.

select name as "�̸�", position as "����", pay as "����" 
 from emp2 
  where (position, pay) in (select position, max(pay) from emp2 group by position)
   order by pay;

--����9]emp2 ��� �޿����� ���� ��� ����ϼ���.
select * from emp2 where pay < (select avg(pay) from emp2);
    
