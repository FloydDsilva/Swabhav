DELIMITER $$
        CREATE TRIGGER employeesalarytrigger 
        BEFORE INSERT 
        ON employee
        FOR EACH ROW
        BEGIN
          if (NEW.salary < 500) THEN 
             set NEW.salary = null;
         else
         	set NEW.salary = NEW.salary;
          END IF;
        END $$
  DELIMITER;