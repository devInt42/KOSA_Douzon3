/*
ANY : �ּҰ� ���� ũ��
�ʵ��(pay) >= any : �ּҰ����� ũ�ų� ������ any(300,550,400)
< any : �ִ밪���� ������
<= any : �ִ밪���� �۰ų� ������
= any : IN�� ���� ȿ��
!= any : NOT IN �� ���� ȿ��
*/
select * from professor where pay >= any(300,550,400);
select * from student where weight > any(70,80);
select * from student where weight < any (60,70);

/*
ALL : �ִ밪 ���� ũ�� 
�ʵ��(pay) >= all : �ִ밪���� ũ�ų� ������ all(300,550,400)
> all : �ִ밪���� ũ��
>= all : �ִ밪���� ũ�ų� ������
= all : 
!= all : 
*/

