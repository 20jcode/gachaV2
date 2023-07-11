# 가챠계산기 디자인 패턴으로 리팩토링 하기

### 23년 7월 10일
헤드퍼스트 디자인 패턴을 완독하고 새롭게 리팩토링하고자 한다.

대략적인 클래스다이어그램을 그려봄.
gachaV2.0.png

전체적으로 뜯어 고치는게 리팩토링이라고 부르기는 조금 애매한데, 일단해보도록

---

예외에 대한 검사부분을 전부 붙여줘야할 것 같은 느낌이 든다.

해야할 것

1. Itemcomponent 부분 완성시키기
2. 책임에 대한? 
3. 싱글톤 매니저 만들기
4. 생성부분 관리하기


---

### 23년 7월 11일

우선적으로 입출력 양식을 좀 통일하고 싶은 생각이 든다.

배열을 반환하거나, 입력받는 형태가 좋은 형태일까?

직접적으로 입출력을 하는 방식이 옳은 방식일까? 아니면 객체를 주입받고 리턴하는 그런 형식으로?

---
싱글톤으로 모델매니저를 이용해서 모델의 생명을 관리해줄 필요가 있을까?

한번 만들어진 모델의 계산결과 등을 관리해줄 필요가 있을까?

더이상 참조되는 것이 없으면 해당 객체는 GC에 의해 회수되니까

근데 새로운 GachaModel을 만드는데 자원이 많이 소모되어진다.

DB를 사용한다면 이를 저장하고 불러오는 등의? -> 이것도 자원이 많이 소모된다.

그럼 싱글톤으로 이를 처리하면서? 프록시패턴으로 나중에 로딩 대체같은 느낌으로 하나 더?

---

컨트롤러에 의해서 모델의 생명이 관리되는게 마음에 안든다.

근데 모델에 대한 선별적인 접근은 컨트롤러가 해야하는 것 아닌가?

그렇게 해야지 서로 분리되어서 동작하지않는가?

---

변할 수 있는 것은 구현으로, 변하지 않는 것은 추상화하기.

한명의 클라이언트에 대해서 하나의 싱글톤 객체가 관리해야?

Model에서는 리턴할 것은 없음.

컨트롤러나 view가 알아서 알아야함.

---

모델이 입력받는 데이터는 어떻게 되어야하는가?

즉 json으로 받아서? 오는? 

---

ItemComponent 먼저 만들어보자

일단 구현하면서 차근차근 구상까지 수정해나가는 기준으로 가자.

---

깃 사용 미숙으로 데이터가 날라갓다.

리베이스 미스가 너무 뼈아프다.

리베이스 : 커밋들을 다른 브랜치에 덧붙이거나 브랜치 합치기

체크아웃 : 브랜치 전환, 커밋복원, 파일 복구 etc

---

지금 버전을 메인버전으로 해야겟다...

Gacha V2.0으로 복원완.

---

ItemComponentNodeImplTest 작성

---

7/11 가챠계산기 #2

단일 책임 / 단일 역할에 맞추어서 생각을 해보자...

ItemComponent - 컴포지트 패턴에서는 item의 id와 이름, 그리고 조합트리를 구성하는 것이 제일 중요하다고 생각된다.

---

GachaModel을 위해 필요한 것들을 생각해보자.

---

UseItem 생각중...

연결된 3가지의 정보를 어떤식으로...?

내부 클래스

내부클래스는 외부에서 사용안되면 static으로 선언 // 외부참조안되도록?

---

예외처리부분 해둬야함. 전부

