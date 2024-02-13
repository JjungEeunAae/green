-- ex1) �л����� ��� ������ ���϶�.
SELECT AVG(����) AS ��ս���
  FROM �л�;

-- ex2) �ҼӺ��� �л����� ��� ������ ���Ͻÿ�.
SELECT �Ҽ�
     , ROUND(AVG(����), 1) AS ��ս���
  FROM �л�
 GROUP BY �Ҽ�;

-- ex3) �������̺��� �л��� ��ռ����� ���� �� ��ռ����� ���� ������� �����Ͻÿ�.
SELECT �й�, ROUND(AVG(����),2) AS "�л��� ��ռ���"
  FROM ����
 GROUP BY �й�
 ORDER BY AVG(����) DESC;

-- ex4) ������ȣ 102�� ������ ������ ������ �����ϴ� �л��� ���� ����϶�
SELECT COUNT(DISTINCT �й�) AS "�л� ��"
  FROM ����
 WHERE ��ȣ = 102;

-- ex5) ������ �̻� �����ϴ� �л��� �й��� ���Ͻÿ�.
SELECT *
  FROM (
        SELECT �й�
             , COUNT(*) AS cnt
          FROM ����
         GROUP BY �й�
       ) AS a
 WHERE a.cnt >= 3;
 
 -- ex6) ���� ���� �޿��� ���� ���� �޿��� ���Ͻÿ�
 SELECT MIN(sal)
      , MAX(sal)
   FROM emp;
 
 -- ex7) Ŀ�̼��� �޴� ����� ���� ���Ͻÿ�. 
SELECT COUNT(*) AS "Ŀ�̼� �޴� ����� ��"
  FROM emp
 WHERE comm IS NOT NULL;

-- ex8) �μ���ȣ�� 10�� ����߿� Ŀ�̼��� �޴� ����� ���� ���Ͻÿ�.
SELECT COUNT(*)
  FROM emp
 WHERE deptno = 10
   AND comm IS NOT NULL;
   
-- ex9) ������̺��� job�� ������ �� ���ΰ�?
SELECT COUNT(*)
  FROM (
        SELECT job FROM emp GROUP BY job
        );

-- ex10) �μ����� �޿��� �ְ���� ���� �� �޿��� ���� ������� �����Ͻÿ�
SELECT deptno, MAX(sal) AS "�μ��� �ְ� �޿�"
  FROM emp
 GROUP BY deptno
 ORDER BY MAX(sal) DESC;
 
-- ex11) �μ��� ��� �޿��� 2000�̻��� �μ��鸸 �μ��� ����� ���Ͻÿ�.
SELECT deptno, ROUND(AVG(sal),1)
  FROM emp
 GROUP BY deptno
HAVING AVG(sal) >= 2000;

-- �޿��� 1000�̻��� ����鸸 �μ��� ��ձ޿��� ���� �� �μ��� ��� �޿��� 2000�̻���
-- �μ��� �μ���ȣ�� �μ��� ��ձ޿��� ���Ͻÿ�.
SELECT deptno, ROUND(AVG(sal),2)
FROM emp
WHERE sal >= 1000
GROUP BY deptno
HAVING AVG(sal) >= 2000;

-- JOIN-------------------------------------------------
-- SMITH �����ִ� �μ��̸��� ����Ͻÿ�.
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








