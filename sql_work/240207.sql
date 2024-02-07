--4
select �̸�, ����, �Ҽ� from �л� where ���� >= 170;
--5
select * from ���� where ���� BETWEEN 80 and 90;
--6
select * from �л� where �Ҽ� <> 'CD';
--7
SELECT ������, ����� FROM ���� WHERE ������ LIKE '��%';
--8
SELECT ������, ����� FROM ���� WHERE ������ LIKE '��_';
SELECT ������, ����� FROM ���� WHERE TRIM(������) LIKE '��_';
--9
SELECT * FROM ���� WHERE ������ NOT LIKE '��%';
--10
SELECT * FROM �л� WHERE �Ҽ� = 'CD' AND ���� >= 170;
--11
SELECT * FROM �л� ORDER BY ���� DESC;
--12
SELECT * FROM �л� WHERE �Ҽ� = 'CD' ORDER BY ���� DESC;
--13
SELECT * FROM �л� WHERE �Ҽ� <> 'ID' OR �Ҽ� <> 'ED';
SELECT * FROM �л� WHERE �Ҽ� NOT IN('ID','ED');

--EMP ���̺� ����
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

--14)������̺��� ���� 2500�̻��� ������ �����ȣ,�̸�,������ ���Ͻÿ�.
SELECT empno, ename, sal FROM emp WHERE sal >= 2500;
--15)�������� ���� �ʴ� ����� �̸��� ������ ���Ͻÿ�.
SELECT ename, sal FROM emp WHERE comm IS NULL;
--16)�Ի����� 82�� ������ ����� ��������� ���Ͻÿ�.
SELECT * FROM emp WHERE TO_CHAR(hiredate, 'yy') > 82;
--17)������ 2000�̻� �Ǵ� job�� salesman�� ����� ��������� ���Ͻÿ�.
SELECT * FROM emp WHERE job = UPPER('salesman') AND sal >= 2000;
--18)����� �̸��� A�� ���ִ� ����� ��������� ���Ͻÿ�.
SELECT * FROM emp WHERE ename LIKE '%A%';
--19)������ ���� ������� �����Ͻÿ�.
SELECT * FROM emp ORDER BY sal DESC;
--20) �μ���ȣ�� 10�Ǵ� 20�� ����� �̸��� ������ ���Ͻÿ�
SELECT ename, sal FROM emp WHERE deptno IN (10,20);