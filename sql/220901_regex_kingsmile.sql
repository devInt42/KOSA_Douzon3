-----------���Խ� ǥ��
----Ư���� ��Ģ�� ���� ���ڿ��� ������ ǥ���ϴ� �� ����ϴ� ��� ����
select * from reg_test;

select *
    from reg_test
    where REGEXP_LIKE(text, '([aeiou])\1','i');

select *
    from reg_test
    where REGEXP_LIKE(text, '([abc])\1'); --[�� ]���̿� �ִ� ���ڵ� �� �ϳ�
    
select *   
    from reg_test
    where REGEXP_LIKE(text, '[a-z] [0-9]'); -- �ҹ��� a-z ����, ����


select *   
    from reg_test
    where REGEXP_LIKE(text, '[a-z][0-9]'); -- ��������
insert into reg_test values('789ABC');
insert into reg_test values('789 ABC');
insert into reg_test values('123kbs');
insert into reg_test values('mbc567');
insert into reg_test values('sbs 567');

select * from reg_test where REGEXP_LIKE(text, '[a-z]?[0-9]'); --��ҹ��� ���о���
select * from reg_test where REGEXP_LIKE(text, '[0-9]?[a-z]');

select * from reg_test where REGEXP_LIKE(text, '[A-Z]*[0-9]');
select * from reg_test where REGEXP_LIKE(text, '[A-Z]?[0-9]');
select * from reg_test where REGEXP_LIKE(text, '[0-9]?[A-Z]');


