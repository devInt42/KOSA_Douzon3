-- PL/SQL ( Procedural Language ) -----------------------------
/*
CREATE PROCEDURE ���ν����̸�
IS
    [
        �����̸� ������Ÿ��; --���ν��������� ����� ��������
        �����̸� ������Ÿ��;
        ....
    ]
BEGIN
    ��� ����;
END;
---------------------------------------------
���� ����>
execute ���ν�����;
exec ���ν�����(��, ��,...);
*/
----------------------------------------------
create or replace PROCEDURE  p_msg
is
BEGIN
    DBMS_OUTPUT.PUT_LINE('���� �� ����?');
end;

EXECUTE  p_msg;
-------------------------------------------
----------------------------------------------
create or replace PROCEDURE  p_msg ( name in varchar2 )
is
BEGIN
    DBMS_OUTPUT.PUT_LINE(name || '��(��) ���� �� ����?');
end;

EXECUTE  p_msg('����');
exec p_msg('�迬��');
exec p_msg('�̼���');
-------------------------------------------
create or replace PROCEDURE p_test    -- ���ν��� ���� 
(      
            name in VARCHAR2,
            su in number
) 
is
begin
    DBMS_OUTPUT.PUT_LINE(name || '�� ������ : ' || su );
end;

exec p_test('�迬��', 99);
exec p_test('park', 77);
-------------------------------------------------------
select * from userlist;
drop table userlist;
create table userlist (
    id varchar2(10),
    name varchar2(20),
    age number,
    addr varchar2(50)
);
desc userlist;
    
create or replace PROCEDURE p_userlist(      -- ���ν��� ���� 
    id in userlist.id%Type := 'kingsmile',
    name in userlist.name%TYPE default '������',
    age in userlist.age%type := 10,
    addr in userlist.addr%type := null
) 
is
begin
    insert into userlist values(id, name, age, addr);
    DBMS_OUTPUT.PUT_LINE('insert ������ : ' ||id||' ' ||name||' ' ||age||' '||addr );
end;
--------------------------------------------
exec p_userlist('yuna', '�迬��', 30, '����');
select * from userlist;
exec p_userlist;  -- default value input
exec p_userlist(id=>'�ں���', age=>33);  -- ���ϴ� �ʵ尪�� �߰� ����

--------------------------------------------------
SELECT * 
    FROM user_objects
    WHERE LOWER(object_type)='procedure';
-----------------------------------------------------
create or replace PROCEDURE  p_sal
is
    v_salary number := 0;    v_dept_id number := 0;
BEGIN
    v_dept_id := round(dbms_random.value(10, 40) , -1);
    
    DBMS_OUTPUT.PUT_LINE('v_dept_id = ' || v_dept_id );
    
    select sal into v_salary from emp where deptno = v_dept_id and rownum = 1;
     DBMS_OUTPUT.PUT_LINE( v_salary );
     
     if v_salary BETWEEN 1 and 3000 then
        DBMS_OUTPUT.PUT_LINE( '���� ����' );
     ELSIF v_salary BETWEEN 3001 and 6000 then
        DBMS_OUTPUT.PUT_LINE( '�ü��� ������' );
    ELSIF v_salary BETWEEN 6001 and 9000 then
        DBMS_OUTPUT.PUT_LINE( '���� ����' );
     else
        DBMS_OUTPUT.PUT_LINE( '���� ����' );
    end if;
end;
-----------------------------------------------
exec p_sal;

select * from emp;
-------------------------------------------------------------------
/*
ex) ����� �Է�(�ܼ�)�� �޾� ������ ���
[��Ʈ] DECLARE vdan NUMBER(1) :=&dan;
*/
declare
    dan number(1) := &inputDan;
begin
    for i in 1..9 loop
        DBMS_OUTPUT.PUT_LINE(dan ||'*'||i||'='|| i*dan);
    end loop;
end;
----------------------------------------------------
create or replace PROCEDURE  p_wantDan
is        
    dan number(1) := &inputDan;
begin
    for i in 1..9 loop
        DBMS_OUTPUT.PUT_LINE(dan ||'*'||i||'='|| i*dan);
    end loop;
end;
-------------------------------------------
exec p_wantDan;
--------------------------------------------
create or replace PROCEDURE  p_wantDan( v_dan in number  )    
is        
begin
    for i in 1..9 loop
        DBMS_OUTPUT.PUT_LINE(v_dan ||'*'||i||'='|| i* v_dan);
    end loop;
end;
-------------------------------------------
exec p_wantDan(&v_dan); -- ������� �Է� �����鼭~
--------------------------------------------
----------------------------------------------------------
create or replace procedure p_outTest (
    name out varchar2, age out varchar2
)
is
begin
    name := '�̳���3';
    age := 33;
    dbms_output.put_line('out�� �̿��� ���ν��� �Ϸ�');
end;
----------------------------------
variable v_name varchar2(20);
variable v_age varchar2(3);

exec p_outTest(:v_name, :v_age);
print v_name;
print v_age;

print (v_name, v_age);  -- ??
---------------------------------------------
create or replace procedure p_out( x in out number )
as
begin
    dbms_output.put_line( 'x = ' || x );
    x := &x;
end;
------------------------------------------------
VARIABLE x VARCHAR2(25);
exec p_out(:&x);
print x;

exec p_out(:x);

VARIABLE y VARCHAR2(25);
exec p_out(:y);
print y;
------------------------------------------------
select * from emp;
-----------------------------------------------
------------------------------------------------
create or replace procedure p_emp_job( v_job in emp.job%type )
is
    name emp.ename%type;
    empno emp.empno%type;
    sal emp.sal%type;
--  cursor c_name is select empno, ename, sal from emp where job=upper(v_job) or job=lower(v_job);   -- 1.Ŀ������
    cursor c_name is select empno, ename, sal from emp where job in(upper(v_job), lower(v_job));   -- 1.Ŀ������
begin
    open c_name;   -- 2.Ŀ������
    dbms_output.put_line('------------------------------');
    loop
        fetch c_name into empno, name, sal;  -- 3.Ŀ���κ��� ������ �б�
        exit when c_name%NOTFOUND; -- ã�� �����Ͱ� ������ �ݺ��� Ż���Ѵ�.
        dbms_output.put_line(name ||' '||empno||' '||sal||' ' ||v_job);
    end loop;
    dbms_output.put_line('result recode count ==> ' || c_name%rowcount);
     
    close c_name;  -- 4.Ŀ���ݱ�
end;
--------------------------------------------------------------
exec p_emp_job('manager');  -- ���ڵ� ��ҹ��� ������
exec p_emp_job(upper('manager'));

select * from emp where job ='manager';

exec p_emp_job('SALESMAN');
---------------------------------------------------
DECLARE
    v_emprow  emp%rowtype;
begin
    for i in 1..5 loop
        select * into v_emprow
            from ( select *
                        from (select * from emp order by sal desc )
                        where rownum <= i ) 
            where rownum <=5;
          dbms_output.put_line(v_emprow.empno || '  ' || v_emprow.ename ||'  '|| v_emprow.sal );
    end loop;
end;
----------------------------------------------------
  select sal, rownum
            from ( select *
                        from (select * from emp order by sal desc )
                        where rownum <= 1 ) 
            where rownum <=5;
--------------------------------------------------------------------
DECLARE
    v_emprow  emp%rowtype;
begin
    for i in 1..5 loop
        select * into v_emprow
            from ( select * from (select * from emp order by sal desc )
                        where rownum <= i  order by sal, ename ) 
            where rownum =1 order by sal asc ;
          dbms_output.put_line(v_emprow.empno || '  ' || v_emprow.ename ||'  '|| v_emprow.sal );
    end loop;
end;
-----------------------------------------------------------------------
create or replace PROCEDURE p_empMaxSal
is
    v_emprow  emp%rowtype;
begin
    for i in 1..5 loop
        select * into v_emprow
            from ( select * from (select * from emp order by sal desc )
                        where rownum <= i  order by sal, ename ) 
            where rownum =1 order by sal asc ;
          dbms_output.put_line(v_emprow.empno || '  ' || v_emprow.ename ||'  '|| v_emprow.sal );
    end loop;
end;
--------------------------------------------------
exec p_empMaxSal;
------------------------------------------------
insert into emp(empno, ename, sal) values(3456, 'kingsmile', 8000);

-- �л� ���̺��� Ű�� ���� ū ������ 3�� ����ϴ� ���ν��� �����
select * from student;
create or replace procedure p_stdMaxHeight
is
    v_stdrow    student%rowtype;
    begin
        for i in 1..3 loop
            select * into v_stdrow 
            from ( select * 
                    from (select * from student order by height desc )
                     where rownum <= i  order by height, name ) where rownum = 1 order by height desc; 
             DBMS_OUTPUT.PUT_LINE(v_stdrow.studno||' '||v_stdrow.name||' '||v_stdrow.height);   
        end loop;
    end;
---------------------------------------------------------------   
exec p_stdMaxHeight;    
---------------------------------------------------------------   
select name, height from student order by height desc;
-----------------------------------------------------------------
����ȣ	184
�ڵ�ȣ	182
������	182
------------------------------------------------------------------
create or replace PROCEDURE p_stdMaxHeight
is
    v_stdrow  student%rowtype;
begin
    for i in 1..5 loop
        select * into  v_stdrow
            from ( select * from (select * from student order by height desc )
                        where rownum <= i  order by height, name desc) 
            where rownum =1 order by height desc ;
          dbms_output.put_line(v_stdrow.studno || '  ' || v_stdrow.name ||'  '|| v_stdrow.height );
    end loop;
end;
--------------------------------------------------
exec p_stdMaxHeight;
---------------------------------------------------------
create or replace procedure p_join
is
    v_join  student%rowtype;

begin
    select  p.PROFNO, p.name, p.position,
               s.studno, s.name, s.grade , d.dname  into v_join
            from professor p  join  student s  
            on p.PROFNO = s.PROFNO join DEPARTMENT d 
            on s.DEPTNO1= d.DEPTNO;
end;
-----------------------------------------------------------------
 select  p.PROFNO, p.name, p.position,
               s.studno, s.name, s.grade , d.dname
            from professor p  join  student s  
            on p.PROFNO = s.PROFNO join DEPARTMENT d 
            on s.DEPTNO1= d.DEPTNO;





