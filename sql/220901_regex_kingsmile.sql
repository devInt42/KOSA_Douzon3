-----------정규식 표현
----특정한 규칙을 가진 문자열의 집합을 표현하는 데 사용하는 언어 형식
select * from reg_test;

select *
    from reg_test
    where REGEXP_LIKE(text, '([aeiou])\1','i');

select *
    from reg_test
    where REGEXP_LIKE(text, '([abc])\1'); --[와 ]사이에 있는 문자들 중 하나
    
select *   
    from reg_test
    where REGEXP_LIKE(text, '[a-z] [0-9]'); -- 소문자 a-z 숫자, 공백


select *   
    from reg_test
    where REGEXP_LIKE(text, '[a-z][0-9]'); -- 공백제거
insert into reg_test values('789ABC');
insert into reg_test values('789 ABC');
insert into reg_test values('123kbs');
insert into reg_test values('mbc567');
insert into reg_test values('sbs 567');

select * from reg_test where REGEXP_LIKE(text, '[a-z]?[0-9]'); --대소문자 구분없음
select * from reg_test where REGEXP_LIKE(text, '[0-9]?[a-z]');

select * from reg_test where REGEXP_LIKE(text, '[A-Z]*[0-9]');
select * from reg_test where REGEXP_LIKE(text, '[A-Z]?[0-9]');
select * from reg_test where REGEXP_LIKE(text, '[0-9]?[A-Z]');


