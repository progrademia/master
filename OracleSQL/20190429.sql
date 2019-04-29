--salario máximo, mínimo, suma y media
select 
   max(salary) as "Máximo",
   min(salary) as "Mínimo",
   sum(salary) as "Suma",
   round(avg(salary),0) as "Media"
from employees