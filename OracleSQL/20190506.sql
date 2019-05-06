DROP TABLE MIS_EMPLEADOS;

CREATE TABLE MIS_EMPLEADOS
   (EMPLOYEE_ID NUMBER(6) CONSTRAINT MIS_EMPLEADOS_ID_PK PRIMARY KEY,
   FIRST_NAME VARCHAR2(25),
   LAST_NAME VARCHAR2(25),
   SALARY NUMBER(9,2),
   USERID VARCHAR2(8)
   );
   
   DESCRIBE MIS_EMPLEADOS;
   
   INSERT INTO MIS_EMPLEADOS
   VALUES (1, 'Emilio','Perez',200,'emiliopm');
   
   
   INSERT INTO MIS_EMPLEADOS(
   employee_id, last_name, 
   first_name, userid, salary
   )
   VALUES (2, 'Sanchez','Jose','jsanchez', 300);
   
   select * from mis_empleados;
   
   
   INSERT INTO MIS_EMPLEADOS
   VALUES (&p_id, '&p_nombre','&p_apellidos',&p_salario,
   '&p_usuario');
   
   commit;
   
   update mis_empleados
   set salary=500
   where employee_id =3;
   
   update mis_empleados
   set salary =900
   where salary<=400;
   
   commit;
   
   INSERT INTO MIS_EMPLEADOS
   VALUES (&p_id, '&p_nombre','&p_apellidos',1000,
   '&p_usuario');
   
   savepoint miscambios;
   
   delete from mis_empleados;
   
   select * from mis_empleados;
   
   rollback to miscambios;
   
   select * from mis_empleados;
   
   delete from mis_empleados where employee_id=3;
   
   select * from mis_empleados;
   
   commit;
   
   insert into mis_empleados(
       employee_id, first_name, last_name, salary, userid
       )
   select 
     employee_id,
     first_name,
     last_name,
     salary,
     lower(substr(first_name, 1,1) ||
      substr(last_name,1,6)) userid
   from employees
   where salary<10000;
    
    rollback;
    
    truncate table mis_empleados;
    
    