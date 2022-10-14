/*
ANY : 최소값 보다 크면
필드명(pay) >= any : 최소값보다 크거나 같으면 any(300,550,400)
< any : 최대값보다 작으면
<= any : 최대값보다 작거나 같으면
= any : IN과 같은 효과
!= any : NOT IN 과 같은 효과
*/
select * from professor where pay >= any(300,550,400);
select * from student where weight > any(70,80);
select * from student where weight < any (60,70);

/*
ALL : 최대값 보다 크면 
필드명(pay) >= all : 최대값보다 크거나 같으면 all(300,550,400)
> all : 최대값보다 크면
>= all : 최대값보다 크거나 같으면
= all : 
!= all : 
*/

