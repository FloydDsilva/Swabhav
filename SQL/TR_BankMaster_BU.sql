DELIMITER $$
        CREATE TRIGGER TR_BankMaster_BU 
        BEFORE UPDATE 
        ON BankMaster
        FOR EACH ROW
        BEGIN
          if (NEW.balance < 500) THEN 
             SIGNAL SQLSTATE '45000'
					SET MESSAGE_TEXT = 'ERROR: 
         Balance MUST BE ATLEAST 500!';
          END IF;
        END $$
  DELIMITER;