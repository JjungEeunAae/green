-- ex1) 학생들의 평균 신장을 구하라.
SELECT AVG(신장) AS 평균신장
  FROM 학생;

-- ex2) 소속별로 학생들의 평균 신장을 구하시오.
SELECT 소속
     , ROUND(AVG(신장), 1) AS 평균신장
  FROM 학생
 GROUP BY 소속;

-- ex3) 수강테이블에서 학생별 평균성적을 구한 후 평균성적이 높은 순서대로 정렬하시오.
SELECT 학번, ROUND(AVG(성적),2) AS "학생별 평균성적"
  FROM 수강
 GROUP BY 학번
 ORDER BY AVG(성적) DESC;

-- ex4) 교수번호 102인 교수가 설강한 과목을 수강하는 학생의 수를 계산하라
SELECT COUNT(DISTINCT 학번) AS "학생 수"
  FROM 수강
 WHERE 번호 = 102;

-- ex5) 세과목 이상 수강하는 학생의 학번을 구하시오.
SELECT *
  FROM (
        SELECT 학번
             , COUNT(*) AS cnt
          FROM 수강
         GROUP BY 학번
       ) AS a
 WHERE a.cnt >= 3;
 
 -- ex6) 가장 높은 급여와 가장 낮은 급여를 구하시오
 SELECT MIN(sal)
      , MAX(sal)
   FROM emp;
 
 -- ex7) 커미션을 받는 사원의 수를 구하시오. 
SELECT COUNT(*) AS "커미션 받는 사원의 수"
  FROM emp
 WHERE comm IS NOT NULL;

-- ex8) 부서번호가 10인 사원중에 커미션을 받는 사원의 수를 구하시오.
SELECT COUNT(*)
  FROM emp
 WHERE deptno = 10
   AND comm IS NOT NULL;
   
-- ex9) 사원테이블에서 job의 종류는 몇 개인가?
SELECT COUNT(*)
  FROM (
        SELECT job FROM emp GROUP BY job
        );

-- ex10) 부서별로 급여의 최고액을 구한 후 급여가 많은 순서대로 정렬하시오
SELECT deptno, MAX(sal) AS "부서별 최고 급여"
  FROM emp
 GROUP BY deptno
 ORDER BY MAX(sal) DESC;
 
-- ex11) 부서별 평균 급여가 2000이상인 부서들만 부서별 평균을 구하시오.
SELECT deptno, ROUND(AVG(sal),1)
  FROM emp
 GROUP BY deptno
HAVING AVG(sal) >= 2000;

-- 급여가 1000이상인 사원들만 부서별 평균급여를 구한 후 부서별 평균 급여가 2000이상인
-- 부서만 부서번호와 부서별 평균급여를 구하시오.
SELECT deptno, ROUND(AVG(sal),2)
FROM emp
WHERE sal >= 1000
GROUP BY deptno
HAVING AVG(sal) >= 2000;

-- JOIN-------------------------------------------------
-- SMITH 속해있는 부서이름을 출력하시오.
SELECT deptno
  FROM emp
 WHERE ename = 'SMITH';

SELECT department_name
  FROM departments
 WHERE department_id = 20;

SELECT department_name
  FROM emp e
 INNER JOIN departments d
    ON e.deptno = d.department_id
 WHERE ename = 'SMITH';

SELECT *
  FROM emp e
 RIGHT OUTER JOIN departments d
    ON e.deptno = d.department_id;

SELECT *
  FROM departments d
  LEFT OUTER JOIN emp e
    ON d.department_id = e.deptno;








