# 코틀린 강의 정리용
## token : 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
## 1. Junit5에서 사용되는 5가지 어노테이션
```
1. @Test : 테스트 메소드를 지정합니다.
    - 테스트 메소드를 실행하는 과정에서 오류가 없으면 성공
2. @BeforeEach : 각 테스트 메소드가 수행되기 전에 실행되는 메소드 지정
3. @AfterEach : 각 테스트가 수행된 후에 실행되는 메소드 지정
4. @BeforeAll : 모든 테스트를 수행하기 전에 최초 1회 수행되는 메소드 지정
    - companion object 내부에 @JvmStatic을 선언해야 합니다.
5. @AfterAll : 모든 테스트를 수행된 후에 실행되는 메소드 지정
    - companion object 내부에 @JvmStatic을 선언해야 합니다.
```