# Java project 

### Guides URL
+ 자바 기본 : https://wikidocs.net/268
+ Git commit message guide : http://chris.beams.io/posts/git-commit/

### upstream merge

1. git remote add upstream https://github.com/napi/cnu_lecture
2. git fetch upstream
3. git checkout -b week1
4. git merge upstream/week1

- - -
### 05/09 Local PC 에서 프로젝트가 올라가지 않는 오류
- Jenkins 가 8080 Port를 선점
 - Jenkins와 함께 사용할 수 있도록 Java 프로젝트의 Port 를 8000으로 바꾸도록 하겠습니다.
- IntelliJ 에서 H2 Library 를 가져 오지 못하는 문제
 - 확인해보니 IntelliJ 에서 maven 의 scope 이 provided 로 지정되어 있을 경우, eclipse 와 다르게 동작한다고 하네요. IntelliJ 의 설정을 변경하거나, 프로젝트의 profile 등을 바꾸는 등의 방법이 있으나, 이번 프로젝트와는 연관이 없으므로 가장 간단하게 scope 를 compile 로 변경하도록 하겠습니다.
- Eclipse 에서 maven 빌드가 실패
 - 아직 정확한 원인을 파악하지 못했습니다. 네트워크 문제였거나, eclipse 의 버전/설정의 문제로 짐작됩니다. 각자 집에서 재시도 해봐주시고 만약 실패시 eclipse 를 STS 로 바꿔 설치해보는 것을 권장해 드립니다.

그 이외에 문제가 생기거나 해결이 안되시는게 있으시면 rokim@riotgames.com 으로 메일 주시기 바랍니다.


### 05/09 숙제
##### 선행작업
+ **숙제를 위해 소스코드를 수정했습니다. 위의 upstream merge 를 참고해서 아래 작업을 진행해주세요.**

1. git remote add upstream https://github.com/napi/cnu_lecture     (수업시간에 수행했다면 생략 가능)
2. git fetch upstream
3. git checkout -b week1  (수업시간에 수행했다면 git checkout week1 을 입력하거나, 생략 가능)
4. git merge upstream/week1
5. 자신의 PC에 있는 Player.java 파일이 "https://github.com/napi/cnu_lecture/blob/week1/src/main/java/com/study/week1/oop/pattern/strategy/Player.java" 와 동일한지 확인한다. 동일하지 않다면 이 후 숙제를 진행할 수 없습니다. 

##### 숙제 내용
> ##### AccessParentTest.java 파일의 테스트 코드를모두 Success가 되도록 수정합니다.
1. 코드상에 TODO 등으로 설명이 들어 있습니다. assertThat 안의 is(..)를 수정해서 test를 고칩니다.
2. 77번 라인의 fail("Expect exception"); 은 의도한 내용입니다. @Test 어노테이션의 expected 기능을 이용해서 test를 고칩니다.
3. AccessParentTest.java 이외의 파일은 고치지 않도록 합니다.

> ##### PlayerTest.java 파일의 테스트 코드를 모두 Success가 되도록 수정합니다.
1. 고쳐야 하는 파일은 PlayerTest.java, BowWeapon.java, AxeWeapon.java, Chair.java 4개 입니다.
2. PlayerTest.java 파일에서 고쳐야 하는 유일한 곳은 73번째 라인의 주석 입니다. 해당 주석을 풀었을때 테스트 코드가 정상적으로 작동해야 합니다.

##### 제출 방법
1. 각자 작업한 내용을 자신의 github 에 수정한 내용을 push 한다.
2. push 한 소스코드를 이곳("https://github.com/napi/cnu_lecture") 저장소의 week1 브랜치에 pull request를 날린다.

##### 평가


