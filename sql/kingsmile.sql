--kingsmile
select * from tab;

create TABLE SampleTable(
    num NUMBER,
    name VARCHAR2(20),
    phone VARCHAR2(15),
    address VARCHAR2(50)
);

select * from sampletable; -- ��ü ����

desc sampletable;

--insert into
insert into sampletable values(10, 'doyeon', '010-9872-0202', '����');
insert into sampletable values(20, '������', '010-5555-3333', '�λ�');
insert into sampletable values(10, '�迬��', '010-7777-8888', '���ֵ�');

select*from SampleTable;

delete from sampletable; -- ���ڵ� ����
rollback;
select*from sampletable;
