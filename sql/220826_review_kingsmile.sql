-- ppt2 p4
--INITCAP 첫글자만 대문자 출력 LOWER 소문자 UPPER 대문자
select Initcap('hello world'),Lower('hello world'),('hello world') from dual;

--LENGTH 문자열길이  LENGTHB 바이트수 영어, 특수기호1 한글3
select length('abcd'), lengthb('abcd'), length('한글'), lengthb('한글') from dual;

-- CONCAT 문자열 합치기 ||연산자와 동일
select concat('안녕','류정수') from dual;
select '안녕'||'류정수' from dual;

-- SUBSTR 문자열에서 특정 길이의 문자를 추출할 때 사용
select substr('abcde', 2, 3) from dual; --2번째부터 3개출력





-- ppt2 p74
--ROUND 반올림
select ROUND(12.345, 2) from dual;  --> 12.35

--TRUNC 주어진 숫자를 버림한 후 출력
select Trunc(12.345, 2) from dual;  --> 12.34

--MOD 주어진 숫자를 나누기 한 후 나머지 값 출력
select Mod(12,10)from dual;  --> 2

--CEIL 주어진 숫자와 가장 근접한 큰 정수 출력함
select Ceil(12.345) from dual; --> 13

--FLOOR 주어진 숫자와 가장 근접한 작은 정수 출력
select Floor(12.345) from dual; --> 12

--POWER 주어진 숫자1의 숫자2의 승을 출력
select Power(3,2) from dual; --> 9

--단일행 함수

--SYSDATE 함수 (현재 날짜/시간 출력)
select sysdate from dual;   --날짜 출력
select months_between('22/03/01','22/02/01') from dual; --날짜 사이 개월수 비교



