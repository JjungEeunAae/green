SELECT AVG(신장), 이름 AS a FROM 학생 GROUP BY 이름;

SELECT 소속, AVG(신장) FROM 학생 GROUP BY 소속;

SELECT 학번, AVG(성적)AS 성적 FROM 수강 GROUP BY 학번;