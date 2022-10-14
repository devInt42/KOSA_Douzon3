-- PL/SQL (Procedural 절차)

Declare --선언(선택)
Begin
    DBMS_output.put_line('heejung'); --출력
End;        

DECLARE NAME VARCHAR2(20) :='김연아';
BEGIN
DBMS_OUTPUT.PUT_LINE('이름은 ' || name); --화면에 출력
END;

----------------------------

DECLARE e_name emp.ename%type;
        e_sal emp.sal%type;
begin
    select sal, ename into e_sal, e_name from emp where empno='7788';
    DBMS_OUTPUT.PUT_LINE('7788님의 이름은'||e_name||' 급여는 '||e_sal   );
end;

select*from emp;
---------------------------------
DECLARE
 num1 number :=&num1; --&변수명 = 입력값 받기
 num2 number :=5;
begin
    if num1 > num2 then
     DBMS_OUTPUT.PUT_LINE(num1||'이 큽니다.');
     else DBMS_OUTPUT.PUT_LINE(num2||'이 큽니다.');
    end if;
end;
-------------------------------------------------------
declare 
    num1 number;    num2 number;
BEGIN
    num1 := &num1;
    num2 := &num2;
    
   if num1 >= num2 then 
         DBMS_OUTPUT.PUT_LINE(num1 || '이 큽니다');
    else   DBMS_OUTPUT.PUT_LINE(num2 || '이 큽니다');
   end if;
end;
-----------------------------------------------------------------
DECLARE
  n_sales NUMBER := 300000;
  n_commission NUMBER( 10, 2 ) := 0;
BEGIN
  IF n_sales > 200000 THEN
    n_commission := n_sales * 0.1;
  ELSIF n_sales <= 200000 AND n_sales > 100000 THEN 
    n_commission := n_sales * 0.05;
  ELSIF n_sales <= 100000 AND n_sales > 50000 THEN 
    n_commission := n_sales * 0.03;
  ELSE
    n_commission := n_sales * 0.02;
  END IF;
  
   DBMS_OUTPUT.PUT_LINE(n_sales || ',  '|| n_commission );
END;
------------------------------------------------------
IF condition_1 THEN
    IF condition_2 THEN
        nested_if_statements;
    END IF;
ELSE
    else_statements;
END IF;


