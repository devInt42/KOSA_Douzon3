-- ppt2 p4
--INITCAP ù���ڸ� �빮�� ��� LOWER �ҹ��� UPPER �빮��
select Initcap('hello world'),Lower('hello world'),('hello world') from dual;

--LENGTH ���ڿ�����  LENGTHB ����Ʈ�� ����, Ư����ȣ1 �ѱ�3
select length('abcd'), lengthb('abcd'), length('�ѱ�'), lengthb('�ѱ�') from dual;

-- CONCAT ���ڿ� ��ġ�� ||�����ڿ� ����
select concat('�ȳ�','������') from dual;
select '�ȳ�'||'������' from dual;

-- SUBSTR ���ڿ����� Ư�� ������ ���ڸ� ������ �� ���
select substr('abcde', 2, 3) from dual; --2��°���� 3�����





-- ppt2 p74
--ROUND �ݿø�
select ROUND(12.345, 2) from dual;  --> 12.35

--TRUNC �־��� ���ڸ� ������ �� ���
select Trunc(12.345, 2) from dual;  --> 12.34

--MOD �־��� ���ڸ� ������ �� �� ������ �� ���
select Mod(12,10)from dual;  --> 2

--CEIL �־��� ���ڿ� ���� ������ ū ���� �����
select Ceil(12.345) from dual; --> 13

--FLOOR �־��� ���ڿ� ���� ������ ���� ���� ���
select Floor(12.345) from dual; --> 12

--POWER �־��� ����1�� ����2�� ���� ���
select Power(3,2) from dual; --> 9

--������ �Լ�

--SYSDATE �Լ� (���� ��¥/�ð� ���)
select sysdate from dual;   --��¥ ���
select months_between('22/03/01','22/02/01') from dual; --��¥ ���� ������ ��



