# SpringBoot 웹개발
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
<br>

### 11/7
#### 1. 작성자와 로그인한 사람이 동일할때만 게시글 수정 가능하게
#### 2. 회원가입 아이디 중복검사(on keyup paste)
#### 3. 게시글 조회수 증가
<br>

### 11/8
#### 1. 마이페이지 생성
#### 2. header에서 mypage탭 클릭 -> 모달 -> 맞은 비밀번호 입력하면 마이페이지로 이동
#### 3. 로그인 정보 mypage에 집어 넣어버렸다
<br>

### 11/9
#### 회식으로 쉬는날
<br>

### 11/10
#### 이틀 연속 회식.. ㄷㄷ
<br>

### 11/11
#### 1. 마이페이지에서 정보 수정 기능 (처음 들어왔을 때 전부 disabled true, 변경하고 싶은 부분 클릭하면 disabled false, 변경 버튼 누르면 disabled false인 부분만 업데이트)
#### 2. 게시글 없을 때 게시글이 없습니다 표시
<br>

### 11/12
#### 1. 회원가입, 로그인, 게시글 작성 유효성검사 추가
<br>

### 11/13
#### 1. 회원탈퇴 완료
<br>

### 11/14
#### 휴식
<br>

### 11/15 (코로나 확진으로..)
<br>

### 11/16
#### 1. 메인페이지 스타일 변경
#### header
![화면 캡처 2021-11-16 223332](https://user-images.githubusercontent.com/78129823/141995192-5578c91c-b2fe-4282-886c-6a1ce5150f22.png)

#### body
![화면 캡처 2021-11-16 223352](https://user-images.githubusercontent.com/78129823/141995255-f9a227cc-fd8a-4d22-8c5d-886a3ab65ada.png)
<br>

### 11/17
#### 1. 회원가입, 마이페이지에서 추가로 유효성검사 필요한 부분 생겨서 추가
#### 2. 쇼핑몰 DB설계 tbl_product(pno, pName, pTitle, pContent, pReadCount, pBuyCount, pPrice) tbl_product_img(pno, fileName, path, uid), tbl_product_review(pno, prTitle, prContent, prScore) .. 계속 추가예정
<br>

### 11/18
#### 1. 회원 권한 테이블, DTO생성
#### 2. 상품 테이블, DTO, Service, Repository 생성
<br>

### 11/19 ~ 11/21
#### 아파서 휴식
<br>

### 11/22
#### 1. 이미지 업로드 하면 미리보기
#### TODO
#### 1. 파일 업로드 하면 onchage function, AJAX로 Controller에서 오늘 날짜 폴더 생성
#### 2. 생성된 폴더에 사진 저장(일단 1개만 추후에 여러개 등록으로 수정)
#### 3. 저장된 사진 파일 경로를 return
#### 4. return된 파일 경로를 통해 이미지 미리보기
<br>

### 11/23
#### 1. 오늘 날짜로 폴더 생성 => 완료
#### 2. 이미지 업로드 -> AJAX로 생성된 폴더에 저장 => 미완
<br>

### 11/24
#### 휴식
<br>

### 11/25
#### 1. 이미지 업로드 -> AJAX로 생성된 폴더에 저장 => 완료
#### TODO => 생성된 경로를 return해서 미리보기 하려고 하면 Not allowed to load local resource Error -> 해결 x

# 프로젝트 종료
# 너무 수업시간에 했던거 복습하는거 같아서 새로운 모델, 언어로 재개발
