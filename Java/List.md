# List

  List는 데이터를 순서대로 나열한 (줄지어 늘어놓은) 자료구조이다.  List의 가장 두드러지는 특징은 객체의 **순서**가 정해져 있다는 것이다. 즉, List는 객체 마다 인덱스를 가지고 있어서, 사용자가 index를 통해서 요소 (element)에 접근할 수도 있고, 삽입 연산시 index로 요소가 들어갈 위치를 지정할 수도 있다. 또한, List는 set과 다르게, **중복된 요소를 허용**한다는 특징도 가지고 있다. 더 자세하게 말하자면, ```e1```과 ```e2```라는 요소가 있다고하자. 두 요소 e1 e2에 대해  ```e1.equals(e2)``` 이더라도 (e1과 e2 객체 값이 같더라도) 하나의 List에 들어갈 수 있다는 것이다. List에서는 일반적으로 null 요소를 허용하는 경우, 여러개의 null 요소를 가질 수 있다.



  List interface는 list 요소에 대한 접근으로 4개의 메소드를 제공하고있다. 



- 리스트의 데이터
  - 노드 (node)
  - 요소 (element)
- 처음에 있는 노드 : head node
- 끝에 있는 노드 : tail node
- 하나의 노드에 대해
  - 해당 노드 바로 앞에 있는 노드 : 앞쪽 노드 (predecessor node)
  - 해당 노드 바로 뒤에 있는 노드 : 뒤쪽 노드 (successor node)

![image-20190109195655978](/Users/yegenieee/Library/Application Support/typora-user-images/image-20190109195655978.png =500x200)

- 사용자가 요소가 들어갈 위치를 지정할 수도 있고, index로 element에 접근할 수도 있음



## 선형 리스트 (연결 리스트)

