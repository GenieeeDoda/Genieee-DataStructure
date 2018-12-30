# Stack

 스택은 데이터를 일시적으로 저장하기 위한 자료구조로, **데이터를 쌓아놓은 더미** 라고 할 수 있다. 스택의 특징은 제일 먼저 입력된 데이터가 맨 아래에 쌓이고, 가장 최근에 입력된 데이터가 가장 위에 쌓이는 구조를 갖는 것이다. 즉, **LIFO** (Last-In, First-Out), 후입 선출의 데이터 입출력 순서를 따른다. 



## Stack의 연산

 스택의 연산은 다음과 같다.

- 삽입 (push)
- 삭제 (pop)
- 스택의 최상단에 있는 데이터가 무엇인지 확인 (top)
- 스택에 저장된 요소의 개수를 반환 (size)
- 스택이 공백 상태인지 검사 (isEmpty)



```java
public interface Stack<E> {
    int size();
    boolean isEmpty();
    E top();
    void push(E element);
    E pop();
} 
```

