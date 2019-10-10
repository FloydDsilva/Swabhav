select * from emp order by sal;
select LOWER(ename) from emp;
select * from emp where deptno=10;
select * from emp where deptno=10 or deptno=20 ;
select * from emp where sal between 2000 and 5000;
select DISTINCT deptno from emp;
select * from emp where job='CLERK';
select * from emp where comm is null;
select eName,sal,(if(isnull(comm)=1,0,comm)+(sal*12)) as annual_SAL from emp;

select * from emp where sal=(Select sal from emp where ename='blake');
select * from emp where mgr=(Select empno from emp where ename='king');
select * from emp where job=(Select job from emp where ename='blake');
select * from emp order by sal DESC LIMIT 3;

select deptno, count(empno) from emp group by deptno;
select job, count(empno) from emp group by job;  
select deptno,job, count(empno) from emp group by deptno,job;  

select emp.ENAME,dept.DNAME from emp inner join dept using (deptno);
select a.ENAME,b.ENAME as Boss from emp as a inner join emp as b on a.MGR=b.EMPNO;
select dept.DNAME,emp.ENAME from dept left join emp on dept.DEPTNO=emp.deptno;
select dept.DNAME 
from dept left join emp 
on dept.DEPTNO=emp.deptno 
where emp.ename is null;
select a.ENAME,b.ENAME as Boss from emp as a left join emp as b on a.MGR=b.EMPNO;

select dept.DNAME,count(emp.EMPNO) 
from dept left join emp 
on dept.DEPTNO=emp.deptno 
group by dept.DNAME
having count(emp.EMPNO)>3;

select a.ENAME,dept.DNAME,b.ENAME as Boss from dept inner join 
(emp as a left join emp as b on a.MGR=b.EMPNO)
on dept.deptno=a.deptno;
