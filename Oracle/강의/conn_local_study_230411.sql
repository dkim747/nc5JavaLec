--1. 테이블 구조 확인 명령(DESC)
DESC STUDENT;

--2. 데이터를 조회하는 기본 Select 구문
SELECT SNO
     , SNAME
     FROM STUDENT;
     
-- *테이블의 모든 컬럼을 조회
SELECT *
    FROM STUDENT;
    
--3. 조회하는 컬럼과 테이블에 별칭 붙이기
--3-1. 컬럼에 별칭 붙이기(영어로 작성)
SELECT SNO AS 학생번호
     , SNAME AS 학생이름
    FROM STUDENT;

--3-2. 테이블에 병칠 붙이기
--테이블에 대한 별칭은 해당 쿼리(SQL) 안에서 별칭 사용하겠다라는 뜻.
--두 개 이상 테이블을 사용해서 조회할때 중복된 컬럼이 존재하면 어떤 테이블에서 컬럼을
--조회할 지 결정해야하는데 그럴 때 주로 테이블에 별칭을 붙여서 애매한 컬럼을 조회할
--테이블을 지정할 수 있다.
--별칭을 사용하지 않을 떄는 테이블명.컬럼으로 지정할 수도 있다.
SELECT ST.SNO
     , SNAME
     , SYEAR
    FROM STUDENT ST,
         SCORE SC
    WHERE ST.SNAME LIKE '%우%';

--4. NULL을 처리해주는 NVL
--4-1. NVL을 사용하지 않았을 경우
SELECT ENO
     , ENAME
     , SAL
     , COMM
    FROM EMP;

--4-2. NVL 사용
--자바와 연동했을 때 NULL값이 자바로 그대로 넘어가면 NULLPOINTEXCEPTION이 발생할 확률이
--높아지기 때문에 NULL값이 나올 확률이 있는 컬럼에는 항상 NVL처리를 해준다.
SELECT ENO
     , ENAME
     , SAL
     , NVL (COMM, 0) AS COMM --->별칭 생성!
    FROM EMP;
    
--5. 연결연산자(||)
--5-1. 사원이름 급여 연결해서 출력(EMP)
SELECT ENO 
     , ENAME || '-' || SAL
    FROM EMP;

--5-2. 학생번호 - 기말고사 성적(SCORE)
SELECT SC.SNO || ' - ' || SC.RESULT
    FROM SCORE SC;
         

--5-3. 학생번호 : 학생이름 (STUDENT)
SELECT SNO || ' : ' || SNAME
    FROM STUDENT;
    
--6. 중복제거자 DISTINCT
SELECT JOB
     , MGR
    FROM EMP;

--6-1. 컬럼 하나에 대한 중복 제거
SELECT DISTINCT JOB
    FROM EMP;

--6-2. 컬럼 두 개 이상에 대한 중복 제거
--각각 컬럼에 DISTICNT를 붙여주는게 아니고
--두 개의 컬럼이 한 쌍의 데이터 셋이 돼서
--두 개 컬럼의 데이터가 모두 중복되지 않으면
--중복으로 인식하지 않는다.
SELECT DISTINCT JOB
     , MGR
    FROM EMP;

--7. 데이터의 정렬해주는 ORDER BY

--7-1. 한개의 컬럼에 대한 정렬
--오름차순으로 정렬. ASC 생략가능
SELECT *
    FROM STUDENT
    ORDER BY SYEAR ASC;
--내림차순으로 정렬, DESC는 생략 불가능
SELECT *
    FROM STUDENT
    ORDER BY SYEAR DESC;
    
--7-2. 두 개의 컬럼을 기준으로 정렬
--오름차순으로 정렬
--컴마를 사용해서 다음 정렬될 대상 컬럼을 지정
--먼저 지정된 컬럼부터 정렬을 진핼하고
--다음 오는 컬럼에 대한 정렬을 진행한다.
SELECT *
    FROM STUDENT
    ORDER BY SYEAR, SNAME ASC;
    
--각 컬럼에 대한 정렬방식 지정 가능
SELECT *
    FROM STUDENT
    ORDER BY SYEAR DESC, MAJOR, AVR ASC;

--부서별(DNO)로 정렬하는데 급여(SAL)가 높은 사람 먼저 나오도록 (EMP)
--ENO, ENAME, DNO, SAL
SELECT ENO 
     , ENAME 
     , DNO 
     , SAL
    FROM EMP
    ORDER BY DNO, SAL DESC;
    
--별칭을 붙인 경우에는 별층으로 정렬도 가능
SELECT ENO 
     , ENAME 
     , DNO AS 부서번호
     , SAL AS 급여
    FROM EMP
    ORDER BY 부서번호, 급여 DESC;
    
--8. 조건을 걸어주는 WHERE
--8-1. 값의 크기 비교
--급여가 3000이상인 직원목록 조회
SELECT *
    FROM EMP
    WHERE SAL >= 3000;

--전공이 화학과인 학생들 목록
SELECT *
    FROM STUDENT
    WHERE MAJOR = '화학';

--조건절을 사용할 때는 컬럼의 타입으로 비교할 값을 지정한다.
--값을 컬럼의 타입과 다른 타입으로 잡을 경우 
--컬럼의 모든 데이터가 값의 타입으로 변경된 후 비교하게 된다.
--데이터가 많아질 경우 모든 데이터에서 형변환이 일어나기 때문에
--쿼리속도가 매우 저하된다.
SELECT *
    FROM EMP
    WHERE SAL >= '3000'; --->나쁜 예!

--조건절에서 비교할 떄 컬럼의 타입을 변환하는 일이 있어서는 안된다.
--비교할 값을 컬럼의 타입과 맞춰야한다.

--DNO이 NULL인 직원 목록 조회
SELECT *
    FROM EMP
    WHERE COMM IS NULL;
    
--9. 다중 조건 만들기 AND, OR
--9-1. 모든 조건을 충족하는 데이터를 조회
--1학년이면서 이름에 '우'로 끝나는 학생 목록 조회
SELECT *
    FROM STUDENT
    WHERE SYEAR = 1
      AND SNAME LIKE '%우';

--회계업무를 하면서 급여가 3000이상이고 이름이 세자인 직원 목록 조회
SELECT *
    FROM EMP
    WHERE JOB = '회계'
      AND SAL >= 3000
      AND ENAME LIKE '___';
      
--기말고사 성적이 75점 이상이거나 과목번호가 1211인 학생 목록 조회
SELECT *
    FROM SCORE
    WHERE RESULT >= 75
      OR CNO = '1211';
   
--AND, OR 혼용   
--DNO가 10이거나 급여가 1600이상인 직원중 보너스가 600이상인 직원 조회
--()를 이용해서 우선순위 정할수 있다.
SELECT *
    FROM EMP
    WHERE (DNO = '30'
       OR SAL >= 2000)
      AND COMM >= 600;

--평점이 2.0이상이거나 이름이 3자인 학생중 물리 전공인 학생 목록
SELECT *
    FROM STUDENT
    WHERE (AVR >= 2.0
       OR SNAME LIKE '___')
      AND MAJOR = '물리';
    
