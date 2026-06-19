SELECT
    e.event_id,
    e.title
FROM Events e
LEFT JOIN Resources r
    ON e.event_id = r.event_id
WHERE r.resource_id IS NULL;

INSERT INTO Events
(title, description, city, start_date, end_date, status, organizer_id)
VALUES
(
'Cloud Computing Workshop',
'Workshop on Cloud Technologies',
'Chicago',
'2025-08-01 10:00:00',
'2025-08-01 16:00:00',
'upcoming',
3
);