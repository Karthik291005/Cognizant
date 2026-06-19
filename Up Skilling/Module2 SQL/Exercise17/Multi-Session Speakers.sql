SELECT
    speaker_name,
    COUNT(session_id) AS total_sessions
FROM Sessions
GROUP BY speaker_name
HAVING COUNT(session_id) > 1;

INSERT INTO Sessions
(event_id, title, speaker_name, start_time, end_time)
VALUES
(
3,
'Advanced HTML5',
'Bob Smith',
'2025-07-02 02:00:00',
'2025-07-02 04:00:00'
);