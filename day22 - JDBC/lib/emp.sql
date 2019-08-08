-- INSERT PreparedStatement
INSERT INTO EMP e(e.empno, e.ename) VALUES (?, ?);
rollback;


-- UPDATE PreparedStatement
UPDATE EMP e
   SET e.job = ?
     , e.hiredate = sysdate
     , e.sal = ?
     , e.deptno = ?
     
-- DELETE PreparedStatement
DELETE EMP e
   SET e.job = ?
     , e.hiredate = sysdate
     , e.sal = ?
     , e.deptno = ?