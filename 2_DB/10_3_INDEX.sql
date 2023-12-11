/*  INDEX(색인)
    
- SQL 명령문 중 SELECT의 처리 속도를 향상 시키기 위해 
  컬럼에 대해서 생성하는 객체

- 인덱스 내부 구조는 B* 트리 형식으로 되어있음.


* 인덱스 장점
 - 이진 트리 형식으로 구성되어 있어 자동 정렬 및 검색 속도가 빠름.
 - 조회 시 전체 테이블 내용을 조회하는 것이 아닌
   인덱스가 지정된 컬럼만을 이용해서 조회하기 때문에
   시스템 부하가 낮아져 전체적인 성능이 향상된다.

* 인덱스 단점
 - 데이터 변경(INSERT, UPDATE, DELETE) 작업 빈번한 경우 오히려 성능이 저하되는 문제가 발생.
 - 인덱스도 하나의 객체이다보니 이를 저장하기 위한 별도 공간.
 - 인덱스 생성 시간이 필요 



  --인덱스 생성 방법--

    [작성법]
    CREATE [UNIQUE] INDEX 인덱스명
    ON 테이블명 (컬럼명, 컬럼명, ... | 함수명, 함수계산식);

    
    -- 인덱스가 자동으로 생성되는 경우
    --> PK 또는 UNIQUE 제약조건이 설정되는 경우
*/








