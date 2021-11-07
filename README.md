# SpringBoot 웹개발(영화 예고편 제공 사이트)
## Sprint1 ==> 10월 동안 기본적인 페이지 기능 완성 (로그인(완료), 회원가입(완료), ID/PW찾기(완료), 게시판(55% 완료))
## Sprint2 ==> 11월 동안 10월에 못했던거랑 전체적으로 리팩토링 람다도 써보고 화살표 함수도 써보고 Promise도 써보고 REST API로 바꾸고 할 예정
## Sprint3 ==> Sprint2가 어느정도 완성되면 1. 페이지 디자인 꾸미고 2. AWS 연동해서 페이지 공개 후 프로젝트 마무리
## 목표 : JPA, REST API, Spring Boot, Gradle 맛보기
<br>

### 10/11 프로젝트 최초 생성
#### 1. mustache파일을 통한 웹 페이지 생성
<br>

### 10/12 부트스트랩을 통한 레이아웃 설정
#### 1. header생성
#### 2. login 페이지 생성
<br>

### 10/13 header, footer 생성해서 localize
#### 1. 제곧내
<br>

### 10/14 join, submit으로 controller에 데이터 넘기기
#### 1. join.mustache파일 생성
#### 2. JoinController에 데이터 넘기기
#### 3. jquery 쓰고 싶은데 왜 검색해도 안나오는 것인지 => 해결
### 바꿀것들
#### 1. 학원에서 배운것처럼 넘기고 있는데 REST API로 데이터를 넘기는걸로 전환
#### 2. submit을 비동기로 전환이라고 썼는데 1이랑 똑같은 내용이네
<br>

### 10/15 오늘은 쉬는날...
<br>

### 10/16
#### 1. JS에서 데이터 넘기는 방식 submit에서 ajax로 전환
#### 2. 게시판 만들 페이지 생성
<br>

### 10/17
#### 1. MySql연동 / tomcat 설치 => 는 됐는데 아직 웹이랑 컨트롤러는 연결 안됨
<br>

### 10/18
#### 1. ID / PWD 찾기 페이지 생성
#### 2. radio 선택할때마다 보이는 input 다르게
#### 3. 버튼 눌렀을 때 해당 기능(정보 찾기 데이터들 Controller로 전송)
<br>

### 10/19 회식으로 인한 휴식...
<br>

### 10/20
#### 1. JPA로 DB연동하기 위한 Class, Interface 등 생성 했지만 실패
<br>

### 10/21
#### 1. 휴식...
<br>

### 10/22, 10/23
#### 1. 술이 가져간 내 기억
<br>

### 10/24
#### 1. DB연동해서 데이터가 콘솔에 찍히는건 확인 했지만 ConversionException 발생
#### 2. 해결만 하면 이제 쭈욱 나갈텐데...
<br>

### 10/25
#### 1. 게시글 읽기, 수정, 삭제 페이지 구성
#### 2. BoardController생성
<br>

### 10/26
#### 1. 자유게시판 Controller, mustache 파일 생성
#### 2. 게시글 작성 코드 작성
#### DB연동은 주말에 
<br>

### 10/27
#### 1. 게시글 수정 데이터 전송 코드 작성
#### 2. 아 거 JPA 드럽게 어렵네
<br>

### 10/28
#### 1. 휴식
<br>

### 10/29
#### 1. DB연동 성공 다 뒤졋다 이제
#### 2. 일단 로그인 데이터 DB조회 성
<br>

### 10/30
#### 1. 쉬는날
<br>

### 10/31
#### 1. 로그인, 회원가입, 아이디찾기, 비밀번호찾기 DB에서 넣고 빼고 조회하고 완료
#### 2. JPA느낀점 : ㄹㅇ 개편하다 간단한건 쿼리문을 쓸 필요가 없다
<br>

### 11/1
#### 1. 자유게시판 DB Table 생성
#### 2. 테스트로 등록한 게시글 목록 가져와서 table에 출력 완료
#### 3. 게시글 등록 데이터 전송했는데 JPA에서 FK등록에러 -> 수정 필요
<br>

### 11/2
#### 1. 게시글 읽기 완료
<br>

### 11/3
#### 1. 게시글 삭제 완료
#### 2. 로그인 후 header 부분 변화 
#### ==> {{^loginUser}}...{{/loginUser}} -> session에 loginUser 데이터 없을 때
#### ==> {{#loginUser}}...{{/loginUser}} -> session에 loginUser 데이터 있을 때
#### 3. 로그아웃 완료
<br>

### 11/4
#### 휴식
<br>

### 11/5
#### 1. 자유게시판 게시글 수정 완료
<br>

### 11/6
#### 1. 게시글 작성 완료
#### 2. 로그인한 사람만 작성 가능하게 변경
