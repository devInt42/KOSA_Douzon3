--kingsmile
select * from tab;

create TABLE SampleTable(
    num NUMBER,
    name VARCHAR2(20),
    phone VARCHAR2(15),
    address VARCHAR2(50)
);

select * from sampletable; -- 전체 보기

desc sampletable;

--insert into
insert into sampletable values(10, 'doyeon', '010-9872-0202', '서울');
insert into sampletable values(20, '강감찬', '010-5555-3333', '부산');
insert into sampletable values(10, '김연아', '010-7777-8888', '제주도');

select*from SampleTable;

delete from sampletable; -- 레코드 제거
rollback;
select*from sampletable;
