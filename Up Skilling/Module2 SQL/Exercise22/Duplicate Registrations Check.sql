SELECT
    user_id,
    event_id,
    COUNT(*) AS registration_count
FROM Registrations
GROUP BY user_id, event_id
HAVING COUNT(*) > 1;

INSERT INTO Registrations
(user_id, event_id, registration_date)
VALUES
(1, 1, '2025-05-05');