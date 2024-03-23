유튜브 <나무소리>의 스프링 기초강의 프로젝트. 기본 구조는 다 제공해 주고, 필수 코드만 채워 넣음
공부한 내용

<SPRING>- 엔터프라이즈 개발을 위한 오픈소스 경량 어플리케이션
-spring framework :핵심기능
-spring MVC : 웹 환경
-sprint Boot
-sprint DataJPA

<현재 프로젝트: TRAVEL CLUB PROJECT> :여행클럽과 여행클럽 멤버관리
  <기본개념>
-pom.xml:Maven의 기본설정
-dependency: 사용하는 라이브러리
  -spring core
  -lombok: 생산성 위한 도구, 클래서 만들때 많이 나오는 코드들 annotation으로 나타냄


  <구조>
클래스: ENTITIES(가상)
  -Rest client(표현)
  -Service(사용자가 행동하면 처리)
  -Store(저장)

데이터(Entity)
  -travel club
    -name
    -intro
    -foundation time
  -membership
    -club-member 관계
    -role
    -clubid
    -memberid
    -join date
  -member
  -email
  -name
  -phone number
  -birthday
  -nickname
  -address->list로 저장


