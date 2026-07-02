DECLARE
    v_age NUMBER;
BEGIN
    FOR rec IN (
        SELECT c.CustomerID,
               c.DOB,
               l.InterestRate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP

        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, rec.DOB)/12);

        IF v_age > 30 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;

        END IF;

    END LOOP;

END;
/