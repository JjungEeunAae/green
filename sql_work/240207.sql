--4
select 이름, 신장, 소속 from 학생 where 신장 >= 170;
--5
select * from 수강 where 성적 BETWEEN 80 and 90;
--6
select * from 학생 where 소속 <> 'CD';
--7
SELECT 교수명, 과목명 FROM 설강 WHERE 교수명 LIKE '김%';
--8
SELECT 교수명, 과목명 FROM 설강 WHERE 교수명 LIKE '이_';
SELECT 교수명, 과목명 FROM 설강 WHERE TRIM(교수명) LIKE '이_';
--9
SELECT * FROM 설강 WHERE 교수명 NOT LIKE '김%';
--10
SELECT * FROM 학생 WHERE 소속 = 'CD' AND 신장 >= 170;
--11
SELECT * FROM 학생 ORDER BY 신장 DESC;
--12
SELECT * FROM 학생 WHERE 소속 = 'CD' ORDER BY 신장 DESC;
--13
SELECT * FROM 학생 WHERE 소속 <> 'ID' OR 소속 <> 'ED';
SELECT * FROM 학생 WHERE 소속 NOT IN('ID','ED');

--EMP 테이블 생성
CREATE TABLE EMP
  (EMPNO NUMBER(4) NOT NULL,
        ENAME VARCHAR2(10),
        JOB VARCHAR2(9),
        MGR NUMBER(4),
        HIREDATE DATE,
        SAL NUMBER(7, 2), 
        COMM NUMBER(7, 2),
        DEPTNO NUMBER(2)); 
INSERT INTO EMP VALUES
        (7369, 'SMITH',  'CLERK',     7902,
        TO_DATE('17-12-1980', 'DD-MM-YYYY'),  800, NULL, 20);
        
INSERT INTO EMP VALUES
        (7499, 'ALLEN',  'SALESMAN',  7698,
        TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600,  300, 30);

INSERT INTO EMP VALUES
        (7521, 'WARD',   'SALESMAN',  7698,
        TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250,  500, 30);

INSERT INTO EMP VALUES
        (7566, 'JONES',  'MANAGER',   7839,
        TO_DATE('02-04-1981', 'DD-MM-YYYY'),  2975, NULL, 20);

INSERT INTO EMP VALUES
        (7654, 'MARTIN', 'SALESMAN',  7698,
        TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);

INSERT INTO EMP VALUES
        (7698, 'BLAKE',  'MANAGER',   7839,
        TO_DATE('01-05-1981', 'DD-MM-YYYY'),  2850, NULL, 30);

INSERT INTO EMP VALUES
        (7782, 'CLARK',  'MANAGER',   7839,
        TO_DATE('09-06-1981', 'DD-MM-YYYY'),  2450, NULL, 10);

INSERT INTO EMP VALUES
        (7788, 'SCOTT',  'ANALYST',   7566,
        TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);

INSERT INTO EMP VALUES
        (7839, 'KING',   'PRESIDENT', NULL,
        TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);

INSERT INTO EMP VALUES
        (7844, 'TURNER', 'SALESMAN',  7698,
        TO_DATE('08-09-1981', 'DD-MM-YYYY'),  1500, NULL, 30);

INSERT INTO EMP VALUES
        (7876, 'ADAMS',  'CLERK',     7788,
        TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);

INSERT INTO EMP VALUES
        (7900, 'JAMES',  'CLERK',     7698,
        TO_DATE('03-12-1981', 'DD-MM-YYYY'),   950, NULL, 30);

INSERT INTO EMP VALUES
        (7902, 'FORD',   'ANALYST',   7566,
        TO_DATE('03-12-1981', 'DD-MM-YYYY'),  3000, NULL, 20);

INSERT INTO EMP VALUES
        (7934, 'MILLER', 'CLERK',     7782,
        TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);
        
COMMIT;

--14)사원테이블에서 연봉 2500이상인 직원의 사원번호,이름,연봉을 구하시오.
SELECT empno, ename, sal FROM emp WHERE sal >= 2500;
--15)성과급을 받지 않는 사원의 이름과 연봉을 구하시오.
SELECT ename, sal FROM emp WHERE comm IS NULL;
--16)입사일이 82년 이후인 사원의 모든정보를 구하시오.
SELECT * FROM emp WHERE TO_CHAR(hiredate, 'yy') > 82;
--17)연봉이 2000이상 또는 job이 salesman인 사원의 모든정보를 구하시오.
SELECT * FROM emp WHERE job = UPPER('salesman') AND sal >= 2000;
--18)사원의 이름중 A가 들어가있는 사원의 모든정보를 구하시오.
SELECT * FROM emp WHERE ename LIKE '%A%';
--19)연봉이 높은 순서대로 정렬하시오.
SELECT * FROM emp ORDER BY sal DESC;
--20) 부서번호가 10또는 20인 사원의 이름과 연봉을 구하시오
SELECT ename, sal FROM emp WHERE deptno IN (10,20);