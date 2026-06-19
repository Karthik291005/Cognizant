SELECT
    registration_date,
    COUNT(*) AS total_users
FROM Users
WHERE registration_date >= CURDATE() - INTERVAL 7 DAY
GROUP BY registration_date
ORDER BY registration_date;

INSERT INTO Users
(full_name,email,city,registration_date)
VALUES
('John Doe','john@gmail.com','Chicago',CURDATE()),
('Sara Lee','sara@gmail.com','New York',CURDATE()-INTERVAL 1 DAY),
('David Kim','david@gmail.com','Chicago',CURDATE()-INTERVAL 2 DAY);