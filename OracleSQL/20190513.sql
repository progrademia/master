set serveroutput on;
DECLARE
saludo VARCHAR2(10) NOT NULL := 'Hola Mundo';
entero INT(2) NOT NULL := 23;
begin
    dbms_output.put_line(entero);

end;
