-- Variables de enlace
-- Declaración-->  VARIABLE
-- Visualización de valores --> PRINT

VARIABLE var_enlace NUMBER

BEGIN
    SELECT salary INTO :var_enlace
    FROM employees WHERE employee_id = 150;
END;
/
PRINT var_enlace
SELECT first_name, last_name FROM employees
WHERE salary=:var_enlace;






