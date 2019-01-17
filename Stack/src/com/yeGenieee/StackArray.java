package com.yeGenieee;

/**
 * 배열을 이용하여 구현한 스택
 */
public class StackArray {
    private int max; // 스택의 용량 (스택에 쌓을 수 있는 최대 데이터 수)
    private int ptr; // 스택 포인터 (스택에 쌓여있는 데이터 수)
    private int[] stk; // 스택 본체 (푸시된 데이터를 저장하는 스택 본체 배열)

    /**
     * 생성자 : 스택 본체용 배열을 생성
     * */
    public StackArray(int capacity) {
        ptr = 0; // 스택은 비어있으므로 ptr은 0
        max = capacity; // 스택 용량으로 전달받은 인자 capacity를 max에 복사
        try {
            stk = new int[max]; // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 메모리 부족으로 스택을 생성할 수 없는 경우
            max = 0;
        }
    }

    /**
     * Push : 스택에 데이터 x를 푸시 , 스택이 가득 차 있으면 예외 처리
     * */
    public int push(int x) throws OverflowStackArrayException {
        if ( ptr >= max ) { // 스택이 이미 가득 차있는 경우
            throw new OverflowStackArrayException();
        }

        return stk[ptr++] = x;
    }


    /**
     * Pop : 스택의 꼭대기에서 데이터를 제거하고, 그 값을 반환, 스택이 비어있어 팝을 할 수 없으면 예외 처리
     * */
    public int pop() throws EmptyStackArrayException {
        if ( ptr <= 0 ) { // 스택이 비어있는 경우
            throw new EmptyStackArrayException();
        }

        return stk[--ptr];
    }


    /**
     * Peek : 스택의 꼭대기에 있는 데이터를 봄, 스택이 비어있는 경우 예외 처리
     * */
    public int peek() throws EmptyStackArrayException {
        if ( ptr <= 0 ) { // 스택이 비어있는 경우
            throw new EmptyStackArrayException();
        }

        return stk[ptr - 1];
    }

    /**
     * indexOf : 스택에 x와 같은 값의 데이터가 포함 되어 있는지 검사, 있으면 해당 데이터의 인덱스 값, 없으면 -1
     * */
    public int indexOf(int x) {
        for (int i=ptr-1; i >= 0; i--) {
            if (stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * clear : 스택에 쌓여 있는 모든 데이터를 삭제
     * */
    public void clear() {
        ptr = 0;
    }

    /**
     * capacity : 스택의 용량을 확인
     * */
    public int capacity() {
        return max;
    }

    /**
     * size : 현재 스택에 쌓여있는 데이터의 수
     * */
    public int size() {
        return ptr;
    }

    /**
     * IsEmpty : 스택이 비어있는지 검사
     * */
    public boolean isEmpty() {
        if (ptr <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * IsFull : 스택이 가득 찼는지 검사
     * */
    public boolean isFull() {
        return (ptr >= max) ? true : false;
    }

    /**
     * dump : 스택 안에 있는 모든 데이터를 표시
     * */
    public void dump() {
        if(isEmpty()) {
            System.out.println("스택이 비어있음");
        }
        else {
            for(int i=0; i < ptr; i++) {
                System.out.print(stk[i]+ " ");
            }
            System.out.println();
        }
    }

    /**
     * Runtime Exception : 스택이 비어있음
     * */
    public class EmptyStackArrayException extends RuntimeException {
        public EmptyStackArrayException() { }
    }

    /**
     * Runtime Exception : 스택이 가득 차있음
     * */
    public class OverflowStackArrayException extends RuntimeException {
        public OverflowStackArrayException() { }
    }

    public static void main(String args[]) {

    }
}
