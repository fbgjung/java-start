# java-start
자바 초심찾기 프로젝트

## 1. Hello World
- - -
>__주의__
>
>자바 언어는 대소문자를 구분한다. 대소문자가 다르면 오류가 발생할 수 있다.
>



### 자바란?
자바는 표준 스펙과 구현으로 나눌 수 있다.


- 자바 표준 스펙
  
    - 자바는 이렇게 만들어야 한다는 설계도이며, 문서이다.
    - 이 표준 스펙을 기반으로 여러 회사에서 실제 작동하는 자바를 만든다.
    - 자바 표준 스펙은 자바 커뮤니티 프로세스(JCP)를 통해 관리된다.

- 다양한 자바 구현
  
  - 여러 회사에서 자바 표준 스펙에 맞추어 실제 작동하는 자바 프로그램을 개발한다.
  - 각각 장단점이 있다. 예를 들어 Amazon Corretto는 AWS에 최적화 되어 있다.
  - 각 회사들은 대부분 위도우, MAC, 리눅스 같이 다양한 OS에서 작동하는 버전의 자바도 함께 제공한다.

### 컴파일과 실행
자바 프로그램은 컴파일과 실행 단계를 거친다.

- Hello.java와 같은 자바 소스 코드를 개발자가 작성한다.
- 자바 컴파일러를 사용해서 소스 코드를 컴파일 한다.
  
  - 자바가 제공하는 javac라는 프로그램을 사용한다.
  - .java -> .class 파일이 생성된다.
  - 자바 소스 코드를 바이트코드로 변환하며 자바 가상 머신에서 더 빠르게 실행될 수 있게 최적화하고 문법 오류고 검출한다.

- 자바 프로그램을 실행한다.
  
  - 자바가 제공하는 java라는 프로그램을 사용한다.
  - 자바 가상 머신(JVM)이 실행되면서 프로그램이 작동한다.


## 2. 변수
- - -

### 변수 선언
변수를 선언하면 컴퓨터의 메모리 공간을 확보해서 그곳에 데이터를 저장할 수 있다. 
그리고 변수의 이름을 통해서 해당 메모리 공간에 접근할 수 있다.

### 변수는 초기화 해야한다.
java: variable a might not have been initialized
> Local Variable은 개발자가 직접 초기화를 해주어야 한다.
> 
> 클래스 변수와 인스턴스 변수는 자바가 자동으로 초기화를 진행해준다.

### 리터럴
- 코드에서 개발자가 직접 적은 100, 10.5, true, "Hello Java"와 같은고정된 값은 프로그래밍 용어로 리터럴이라 한다.
- 변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.

### 자주 사용하는 타입
> 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에 초점을 맞추는 것이 더 효과적이다.

- 정수 - int, long: 자바는 정수에 기본으로 int를 사용한다. 만약 20억이 넘을 것 같으면 long을 쓰면 된다.
  
  - 파일을 다룰 때는 byte를 사용한다.
- 실수 - double: 실수는 고민하지 말고 double을 쓰면 된다.
- 불린형 - boolean: true, false 참 거짓을 표현한다. 조건문에서 자주 사용된다.
- 문자열 - String: 문자를 다룰 때는 문자 하나든 문자열이든 모두 String을 사용하는 것이 편리하다.

### 변수 명명 규칙
- 변수 이름은 숫자로 시작할 수 없다.
- 이름에는 공백이 들어갈 수 없다.
- 자바의 예약어를 변수 이름으로 사용할 수 없다.
- 변수 이름에는 영문자, 숫자, 달러 기초 또는 밑줄만 사용할 수 있다.


- 소문자로 시작하는 낙타 표기법
- 클래스는 대문자로 시작, 나머지는 소문자로 시작
- 상수는 모두 대문자를 사용하고 언더바로 구분한다.
- 패키지는 모두 소문자를 사용한다.


- 변수 이름은 의미있고, 그 용도를 명확하게 설명해야 한다.