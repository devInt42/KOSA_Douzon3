-- loacl admin : system 
select * from tab;  -- �α����� ������ ���� �ִ� ���̺� ����Ʈ ����

-- 12c ~ 19c �������� ����ó�� �Ǿ� ���� �����ؾ��ϴ� ��Ȳ ����.  c##������
create user c##������ identified by ��й�ȣ;

create user ������ identified by ��й�ȣ;
alter user ������ account unlock;
-- ==>
create user ������ identified by ��й�ȣ  account unlock;

-- ���� �ο�
grant connect, resource to smile;

grant create session, create table, create view,
    create sequence, create procedure
    to smile;
    
-- ����� ���� ����
drop user smile;



