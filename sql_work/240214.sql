drop table 사원;
drop table 대출;
CREATE TABLE 사원 (
    사번 varchar2(10),
    이름 varchar2(10)
);

CREATE TABLE 대출 (
    사번 varchar2(10),
    도서 varchar2(10)
);
INSERT INTO "HR"."사원" ("사번", "이름") VALUES ('A0001', '홍길동');
INSERT INTO "HR"."사원" ("사번", "이름") VALUES ('A0002', '김치국');
INSERT INTO "HR"."사원" ("사번", "이름") VALUES ('A0003', '안경태');
INSERT INTO "HR"."사원" ("사번", "이름") VALUES ('A0004', '박호순');
INSERT INTO "HR"."사원" ("사번", "이름") VALUES ('A0005', '한국인');
INSERT INTO "HR"."사원" ("사번", "이름") VALUES ('A0006', '이호빵');

INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0001', 'T0301');
INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0002', 'T0302');
INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0001', 'T0203');
INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0003', 'T0401');
INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0005', 'T0501');
INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0001', 'T0201');
INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0003', 'T0204');
INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0003', 'T0306');
INSERT INTO "HR"."대출" ("사번", "도서") VALUES ('A0008', 'T0404');

COMMIT;

-- ---------------------------------------------------------------
-- Q1) 이길동 학생이 수강한 교수명과 성적을 구하시오.
SELECT 교수명, 성적
  FROM 학생 a JOIN 수강 b
    ON a.학번 = b.학번
  JOIN 설강 c
    ON b.번호 = c.번호
 WHERE 이름 = '이길동';

SELECT 교수명, 성적
  FROM 학생 a, 수강 b, 설강 c
 WHERE a.학번 = b.학번
   AND b.번호 = c.번호
   AND 이름 = '이길동';

-- Q2) 최씨성을 갖는 학생의 모든정보를 구하라.
SELECT 학생.학번
     , 이름, 학년
     , 신장, 수강.번호
     , 성적, 과목명
     , 교수명, 학생.소속
  FROM 학생, 수강, 설강
 WHERE 학생.학번 = 수강.학번
   AND 수강.번호 = 설강.번호
   AND 이름 LIKE '최%';

-- Q3) 최길동 학생의 학년,이름,과목번호,성적을 구하시오.
SELECT 학년, 이름, b.번호, 성적
  FROM 학생 a JOIN 수강 b
    ON a.학번 = b.학번
  JOIN 설강 c
    ON b.번호 = c.번호
 WHERE 이름 = '최길동';

-- Q2) 사원들의 job과 부서명을 구하시오. (이름,job, 부서명순으로 출력)
SELECT ename
     , job
     , department_name
  FROM emp e JOIN departments d
    ON e.deptno = d.department_id;


























