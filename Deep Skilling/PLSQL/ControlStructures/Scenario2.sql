DECLARE
    v_isVIP BOOLEAN;
BEGIN
    FOR rec IN (SELECT CustomerID, Balance
                FROM Customers)
    LOOP

        IF rec.Balance > 10000 THEN

            UPDATE Customers
            SET VIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;

        ELSE

            UPDATE Customers
            SET VIP = 'FALSE'
            WHERE CustomerID = rec.CustomerID;

        END IF;

    END LOOP;
END;
/