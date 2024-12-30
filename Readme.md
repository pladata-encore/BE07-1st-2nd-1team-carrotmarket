# 🥕 당근마켓 클론 프로젝트

## 📌 프로젝트 소개
당근마켓 클론 프로젝트는 중고 거래 플랫폼 기능을 구현한 웹 애플리케이션입니다.  
사용자 간 **1:1 채팅**, **위치 기반 거래**, **상품 관리** 등 실상적인 기능을 제공합니다.

---

## 📅 개발 기간

- **2023년 11월 26일 ~ 2023년 12월 16일**

---

## 📊 프로젝트 참여자

| 이름  | 역할                              |
|-----|---------------------------------|
| 김수현 | 팀장 / 회원 및 로그인 기능, 위치정보 관련 기능 구현 |
| 이상엽 | 팀원 / 채팅 기능 구현                   |
| 남궁일 | 팀원 / 게시글 기능 구현                  |
| 이규상 | 팀원 / 관리자 기능 구현                  |


---

## 🛠️ 기술 스택

### **Back-End**
- **Spring Boot**: 서버 사이드 앱 구현
- **MyBatis**: 데이터 접근 및 코드 관리
- **Gradle**: 프로젝트 빌드 및 의존성 관리
- **MySQL**: 데이터베이스 관리
- **Firebase (NoSQL)**: 실시간 채팅 기능 구현

### **Front-End**
- **HTML5 / CSS3**: 화면 및 스타일 관리
- **JavaScript (ES6)**: 동적 페이지 기능 구현
- **Thymeleaf**: 서버 사이드 템플릿 엔진
- **Bootstrap**: 반응형 UI 구현

### **API**
- **Kakao Map리 및 시간 계산**: Kakao Map 및 Google API를 통해 사용자 간 거리 및 시간 계산

### 4. **관리자 기능**
- **신고 관리**: 부적절한 게시글 및 사용자를 신고하고 관리
- **사용자 계정 정지**: 관리자가 신고 내용을 검토 후 계정 상황 변경

---

## 💽 폴더 구조

```plaintext
src/
├── main/
│   ├── java/com/carrotmarket/
│   │   ├── config/         # 설정 관리 클래스
│   │   ├── controller/     # 컨트롤러 클래스
│   │   ├── entity/         # 데이터 엔티티 클래스
│   │   ├── dao/            # MyBatis 매퍼 인터페이스
│   │   ├── repository/     # 데이터 접근 레이어
│   │   └── service/        # 서비스 로직
│   ├── resources/
│   │   ├── mapper/         # 동적쿼리 활용 xml
│   │   ├── static/         # CSS, JS, 이미지 파일
│   │   ├── templates/      # Thymeleaf 템플릿
│   │   └── application.properties # 설정 파일
└── test/
    └── java/               # 테스트 코드
```

---
## 📊 프론트엔드 산출물
- [화면 및 기능 설계서](src/main/resources/docs/요구사항명세서.xlsx)
- [테스트 계획 및 결과 보고서](https://docs.google.com/spreadsheets/d/1VGuFFm2lPFxgiYA9UjRXS_mFDupgv6qXNfHxVf7uNtE/edit?usp=sharing)

## 📊 백엔드 산출물
- [프로그램 요구사항 명세서](src/main/resources/docs/요구사항명세서.xlsx)
- [기능 명세서](src/main/resources/docs/요구사항명세서.xlsx)
- [설계문서](src/main/resources/docs/요구사항명세서.xlsx)
- [테스트 및 결과 보고서](https://docs.google.com/spreadsheets/d/11PIGs6h_AOH7rg6_XovjgJ4qMtjx8t5dF20EG7xl1SI/edit?usp=sharing)

---

## 💡 향후 개선 사항
- 실시간 알림 기능 추가
- 결제 시스템 연동
- 리뷰 및 평점 시스템 구현 
