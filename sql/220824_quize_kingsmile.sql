--����1] �޿��� 500�̻��̰�, ���ʽ��� 60�̻� �޴� ������? (professor table)
select * from professor
where pay >= 500 or bonus >= 60;

--����2] �̸��� '���Ѷ�'�� '���Ѷ�'���� ����(emp2)
update emp2 set name = '���Ѷ�' where name ='���Ѷ�';
select *from emp2 where name = '���Ѷ�';

--����3] ��̰� ����� ����鸸 ã�Ƽ� '����'���� ����
select * from emp2 where hobby ='���';
update emp2 set hobby = '����' where hobby = '���';
select * from emp2 where hobby ='����';

--����4] ����� ���� ã�Ƽ� �����ϱ�
select * from emp2 where emp_type = '�����';
delete from emp2 where emp_type = '�����';

--����5] pay(or bonus)�� 50�̻��� ����� ��� (professor)
select * from professor where pay>=50 or bonus >= 50;

--����6] ~��Ʈ�� �ƴ� ��ǰ�鸸 ��� (gift table)
select*from gift;
select*from gift where GNAME not like '%��Ʈ';

--����7] gno�� 10�� ��ǰ�� �̸��� ��ó��(null) �ϼ���
update gift set gno = null where gno=10;
--����8] gname �̸��� ����, g_start�� 999�� ���� ���� ������ �Է��ϼ���
insert into gift(gno, g_start) values ('',999);
--����9] gname�� null�̰ų� ''�� �����͸� �����ϰ� ����Ͻÿ�
select * from gift where gname is not null or gname <> '';
