--salario máximo, mínimo, suma y media
select 
   max(salary) as "Máximo",
   min(salary) as "Mínimo",
   sum(salary) as "Suma",
   round(avg(salary),0) as "Media"
from employees;


--salario máximo, mínimo, suma y media
-- agrupado por id de trabajo
select job_id,
   max(salary) as "Máximo",
   min(salary) as "Mínimo",
   sum(salary) as "Suma",
   round(avg(salary),0) as "Media"
from employees
group by job_id
having max(salary)>9000
order by job_id;

-- empleados con el mismo empleo
select job_id, count(*) "num empleados"
from employees
group by job_id;


select count(distinct manager_id)
from employees;

select manager_id, min(salary), max(salary), count(*)
from employees
where manager_id is not null
group by manager_id
having min(salary)>=6000
order by min(salary) desc;

-- crea un informe de trabajadores por año contratado.
select count(*) total,
sum(decode(to_char(hire_date,'YYYY'),'2001',1,0)) "2001",
sum(decode(to_char(hire_date,'YYYY'),'2002',1,0)) "2002",
sum(decode(to_char(hire_date,'YYYY'),'2003',1,0)) "2003",
sum(decode(to_char(hire_date,'YYYY'),'2004',1,0)) "2004",
sum(decode(to_char(hire_date,'YYYY'),'2005',1,0)) "2005",
sum(decode(to_char(hire_date,'YYYY'),'2006',1,0)) "2006",
sum(decode(to_char(hire_date,'YYYY'),'2007',1,0)) "2007",
sum(decode(to_char(hire_date,'YYYY'),'2008',1,0)) "2008"

from employees;



select job_id "Trabajo",
       sum(decode(department_id, 90, salary)) "90" ,
       sum(decode(department_id, 80, salary)) "80" ,
       sum(decode(department_id, 70, salary)) "70" ,
       sum(decode(department_id, 60, salary)) "60" ,
       sum(decode(department_id, 50, salary)) "50" ,
       sum(decode(department_id, 40, salary)) "40" ,
       sum(decode(department_id, 30, salary)) "30" ,
       sum(decode(department_id, 20, salary)) "20" ,
       sum(decode(department_id, 10, salary)) "10" ,
        sum(salary) "salario total"
from employees
group by job_id
;


-- Generar informe de las direcciones y pais

select location_id, street_address, city, state_province,
country_id, country_name
from locations natural join countries;

select location_id, street_address, city, state_province,
country_id, country_name
from locations join countries
using(country_id);


select last_name, job_id, e.department_id,l.city
from employees e join departments d
on( e.department_id=d.department_id)
join locations l
using(location_id)
where lower(l.city)='seattle';

-- Cual es mi apellido y el de mi jefe?
select t.last_name, t.employee_id, 
       j.last_name, j.employee_id
from employees t inner join employees j
on(t.manager_id = j.employee_id )
order by t.employee_id asc ;

select t.last_name, t.employee_id, 
       j.last_name, j.employee_id
from employees t, employees j
where (t.manager_id =j.employee_id(+) )
order by t.employee_id asc;
