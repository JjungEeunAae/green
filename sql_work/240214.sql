drop table ���;
drop table ����;
CREATE TABLE ��� (
    ��� varchar2(10),
    �̸� varchar2(10)
);

CREATE TABLE ���� (
    ��� varchar2(10),
    ���� varchar2(10)
);
INSERT INTO "HR"."���" ("���", "�̸�") VALUES ('A0001', 'ȫ�浿');
INSERT INTO "HR"."���" ("���", "�̸�") VALUES ('A0002', '��ġ��');
INSERT INTO "HR"."���" ("���", "�̸�") VALUES ('A0003', '�Ȱ���');
INSERT INTO "HR"."���" ("���", "�̸�") VALUES ('A0004', '��ȣ��');
INSERT INTO "HR"."���" ("���", "�̸�") VALUES ('A0005', '�ѱ���');
INSERT INTO "HR"."���" ("���", "�̸�") VALUES ('A0006', '��ȣ��');

INSERT INTO "HR"."����" ("���", "����") VALUES ('A0001', 'T0301');
INSERT INTO "HR"."����" ("���", "����") VALUES ('A0002', 'T0302');
INSERT INTO "HR"."����" ("���", "����") VALUES ('A0001', 'T0203');
INSERT INTO "HR"."����" ("���", "����") VALUES ('A0003', 'T0401');
INSERT INTO "HR"."����" ("���", "����") VALUES ('A0005', 'T0501');
INSERT INTO "HR"."����" ("���", "����") VALUES ('A0001', 'T0201');
INSERT INTO "HR"."����" ("���", "����") VALUES ('A0003', 'T0204');
INSERT INTO "HR"."����" ("���", "����") VALUES ('A0003', 'T0306');
INSERT INTO "HR"."����" ("���", "����") VALUES ('A0008', 'T0404');

COMMIT;

-- ---------------------------------------------------------------
-- Q1) �̱浿 �л��� ������ ������� ������ ���Ͻÿ�.
SELECT ������, ����
  FROM �л� a JOIN ���� b
    ON a.�й� = b.�й�
  JOIN ���� c
    ON b.��ȣ = c.��ȣ
 WHERE �̸� = '�̱浿';

SELECT ������, ����
  FROM �л� a, ���� b, ���� c
 WHERE a.�й� = b.�й�
   AND b.��ȣ = c.��ȣ
   AND �̸� = '�̱浿';

-- Q2) �־����� ���� �л��� ��������� ���϶�.
SELECT �л�.�й�
     , �̸�, �г�
     , ����, ����.��ȣ
     , ����, �����
     , ������, �л�.�Ҽ�
  FROM �л�, ����, ����
 WHERE �л�.�й� = ����.�й�
   AND ����.��ȣ = ����.��ȣ
   AND �̸� LIKE '��%';

-- Q3) �ֱ浿 �л��� �г�,�̸�,�����ȣ,������ ���Ͻÿ�.
SELECT �г�, �̸�, b.��ȣ, ����
  FROM �л� a JOIN ���� b
    ON a.�й� = b.�й�
  JOIN ���� c
    ON b.��ȣ = c.��ȣ
 WHERE �̸� = '�ֱ浿';

-- Q2) ������� job�� �μ����� ���Ͻÿ�. (�̸�,job, �μ�������� ���)
SELECT ename
     , job
     , department_name
  FROM emp e JOIN departments d
    ON e.deptno = d.department_id;


























