# Array

  ```배열```은 같은 자료형의 변수로 이루어진 구성요소 (element)가 모인 것으로, 자료구조에서 매우 중요한 부분을 차지하고 있다.



  배열을 공부하면서 알아야 할 것들

1. ```Array``` 와 ```Dynamic Array``` 간의 차이를 이해하기
2. Array와 Dynamic Array의 ```basic operations``` 이해하기
3. 다차원 배열, 특히 2차원 배열의 사용



## Array

  **Array** 는 요소를 순차적으로 저장하는 기본 자료구조이다. 배열 안의 모든 구성 요소의 형은 같고 직선 모양으로 줄지어 있다. 배열의 요소는 `index` 로 식별할 수 있기때문에 배열의 요소에 무작위로 접근할 수 있다. 



### 배열 선언

```java
int [] a;
int a[];
```



- 구성 요소의 자료형이 float형이고, 구성 요소의 개수가 10개인 배열 myList

  ```java
  myList = new float[5];
  ```

  - int형 배열 본체를 생성하고, 그것을 변수 a가 **참조** 한다

  ![java array reference](./image/java_array.jpg)

  - new 연산자가 생성하는 것은 배열 본체에 대한 참조

​	

  배열은 일차원배열 뿐만 아니라 다차원배열도 있다. 먼저 linear array라고도 불리는 일차원배열은 다음과 같다.

![linear array](./image/image-20190117201617644.png)



​    위 그림에서, 6개의 요소를 가진 배열 A를 볼 수 있다. 그 말인 즉슨, 배열 A의 길이는 6이라는 것이다. A[0] 을 이용하여 배열의 첫번째 요소인 6에 접근할 수 있다. 배열의 첫 번째 요소의 인덱스는 0이기 때문이다. 마찬가지로, A[1] = 3, A[2] = 8 임을 알 수 있다.

- 배열 element에 접근

  > 배열 변수 이름 [인덱스]

- 배열 length (배열의 요소 개수)

  > 배열 변수 이름.length



- 자료형이 int이고, element 개수가 5인 배열 a

  ```java
  int[] a; // 배열의 선언
  a = new int[5]; // 배열 생성
  ```

  - 배열의 element는 자동으로 0으로 초기화 됨



### 배열의 초기화

- 배열의 생성과 동시에 각 요소 초기화 하기

  ```java
  int[] a = {1,2,3,4,5}; 
  ```



### 배열 복제 (clone)

- clone 메서드를 통해 배열을 복제할 수 있음, 배열을 복제하고 복제한 배열에 대한 참조를 생성

```java
int[] a = new int[] {1,2,3,4,5};
int[] b = a.clone(); // b는 a의 복제를 참조
```



## Dynamic Array

  기존의 Array는 한정된 용량을 가진다. 즉, 배열의 크기를 정해서 한 번 생성하면, 그 용량을 늘리거나 줄이지 못한다는 특징이 있다. 어떤 경우에는 이러한 특징이 단점이 될 때도 있을 것이다.



  그러므로, 대부분의 언어에는 built-in `dynamic array` 를 가지고 있다. **Dynamic Array** 는 기존의 array와 동일하게 요소에 접근이 가능하면서, 배열의 크기가 가변적이다는 특징을 추가로 가진다. (**variable size**) 



- C++의 **Vector**

  ```c++
  #include <iostream>
  
  int main() {
      // vector의 초기화
      vector<int> v0;
      vector<int> v1(5,0);
      
      // vector의 복사
      vector<int> v2(v1.begin(), v1.end());
      vector<int> v3(v2);
      
      // array를 vector로 변환
      int a[5] = {0,1,2,3,4};
      vector<int> v4(a, *(&a+1));
      
      // length
      cout << "The size of v4 is : "<<v4.size()<<endl;
      
      // element에 접근
      cout << "The first element in v4 is : " <<v4[0] <<endl;
      
      // vector 요소 순회
      cout << "[Version 1] The contents of v4 are:";
      for (int i=0;i<v4.size();i++) {
          cout<<" "<<v4[i];
      }
      cout<<endl;
      
      cout << "[Version 2] The contents of v4 are:";
      for (int& item : v4) {
          cout << " " <<item;
      }
      cout<<endl;
      
      cout << "[Version 3] The contents of v4 are:";
      for (auto item = v4.begin(); item != v4.end(); ++item) {
          cout<<" "<<item;
      }
      cout<<endl;
      
      // element 값 바꾸기
      v4[3] = 5;
      
      // 정렬
      sort(v4.begin(), v4.end());
     
      // vector의 끝에 새로운 요소 추가
      v4.push_back(-1);
      
      // vector 마지막 요소 삭제
  	v4.pop_back();
  }
  ```

  

- Java의 **ArrayList**

```java
public class Main {
    public static void main(String[] args) {
        // ArrayList 초기화
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;
        
        // array를 ArrayList로
        Integer[] a = {0,1,2,3,4};
        v1 = new ArrayList<>(Arrays.asList(a));
        
        // copy
        List<Integer> v2 = v1; // v1에 대한 참조를 만든 것
        List<Integer> v3 = new ArrayList<>(v1); // v1을 실제로 copy하여 새로 만든 것
        
        // length
        v3.size();
        
        // get element
        v3.get(1);
        
        // vector 요소 가져오기
        System.out.print("[Version 1] The contents of v3 are:");
        for(int i=0;i<v3.size(); i++) {
            System.out.println(" "+v4.get(i));
        }
        System.out.println();
        
        // vector 요소 가져오기
        System.out.print("[Version 2] The contents of v3 are:");
        for(int item : v3) {
            System.out.println(" "+item);
        }
        System.out.println();
        
        // vector element 값 바꾸기
        v2.set(0,5); // v2를 바꾸면 v1을 바꾸는 것과 같음
        System.out.println("The first element in v1 is: "+v1.get(0));
        
        v3.set(0,-1); // v1과 v3는 아예 다른 배열
        System.out.println("The first element in v1 is: "+v1.get(0));
        
        // sort
       	Collections.sort(v1);
        
        // vector에 새로운 요소 추가
        v1.add(6);
        v1.add(2,7);
        
        // vector에서 마지막 요소 삭제
        v1.remove(v1.size()-1);
    }
}
```

