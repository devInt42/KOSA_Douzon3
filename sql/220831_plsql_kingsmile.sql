-- PL/SQL (Procedural ����)

Declare --����(����)
Begin
    DBMS_output.put_line('heejung'); --���
End;        

DECLARE NAME VARCHAR2(20) :='�迬��';
BEGIN
DBMS_OUTPUT.PUT_LINE('�̸��� ' || name); --ȭ�鿡 ���
END;

----------------------------

DECLARE e_name emp.ename%type;
        e_sal emp.sal%type;
begin
    select sal, ename into e_sal, e_name from emp where empno='7788';
    DBMS_OUTPUT.PUT_LINE('7788���� �̸���'||e_name||' �޿��� '||e_sal   );
end;

select*from emp;
---------------------------------
DECLARE
 num1 number :=&num1; --&������ = �Է°� �ޱ�
 num2 number :=5;
begin
    if num1 > num2 then
     DBMS_OUTPUT.PUT_LINE(num1||'�� Ů�ϴ�.');
     else DBMS_OUTPUT.PUT_LINE(num2||'�� Ů�ϴ�.');
    end if;
end;
-------------------------------------------------------
declare 
    num1 number;    num2 number;
BEGIN
    num1 := &num1;
    num2 := &num2;
    
   if num1 >= num2 then 
         DBMS_OUTPUT.PUT_LINE(num1 || '�� Ů�ϴ�');
    else   DBMS_OUTPUT.PUT_LINE(num2 || '�� Ů�ϴ�');
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


