--문제1] 급여가 500이상이고, 보너스가 60이상 받는 교수는? (professor table)
select * from professor
where pay >= 500 or bonus >= 60;

--문제2] 이름이 '나한라'를 '너한라'으로 변경(emp2)
update emp2 set name = '너한라' where name ='나한라';
select *from emp2 where name = '너한라';

--문제3] 취미가 등산인 사람들만 찾아서 '수영'으로 변경
select * from emp2 where hobby ='등산';
update emp2 set hobby = '수영' where hobby = '등산';
select * from emp2 where hobby ='수영';

--문제4] 계약직 직원 찾아서 삭제하기
select * from emp2 where emp_type = '계약직';
delete from emp2 where emp_type = '계약직';

--문제5] pay(or bonus)가 50이상인 사람만 출력 (professor)
select * from professor where pay>=50 or bonus >= 50;

--문제6] ~세트가 아닌 상품들만 출력 (gift table)
select*from gift;
select*from gift where GNAME not like '%세트';

--문제7] gno가 10인 상품의 이름을 널처리(null) 하세요
update gift set gno = null where gno=10;
--문제8] gname 이름이 없고, g_start가 999인 값을 갖는 데이터 입력하세요
insert into gift(gno, g_start) values ('',999);
--문제9] gname이 null이거나 ''인 데이터를 제외하고 출력하시오
select * from gift where gname is not null or gname <> '';
