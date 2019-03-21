package ch04;

public class IntQueue {
    private int max; // 큐의 용량 (큐에 저장할 수 있는 최대 요소의 개수)
    private int front; // 첫 번째 요소를 가리키는 인덱스 값
    private int rear; // 마지막 요소를 가리키는 인덱스 값
    private int num; // 현재 큐에 있는 데이터 수 (front와 rear 값이 같은 경우, 큐가 비어있는지, 가득 찼는지 구별할 수 없는 상황을 피하기 위해 둔 변수 - 큐가 비었을 때, num=0, 가득차면, num = max)
    private int[] queue; // 큐 본체 (큐로 사용할 배열)


    // 예외 처리 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {

        }
    }

    // 예외 처리 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {

        }
    }

    // 생성자
    public IntQueue(int capacity) {
        num = front = rear = 0; // 처음 생성 시 큐가 비어있기 때문에 num, front, rear 값이 모두 0
        max = capacity;

        try {
            queue = new int[max]; // 큐 본체 배열을 생성
        }catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enqueue(int x) throws OverflowIntQueueException {
        if (num >= max) {
            throw new OverflowIntQueueException(); // 큐가 가득 찬 경우
        }
        queue[rear++] = x;
        num++;

        if (rear == max) {
            rear = 0;
        }

        return x;
    }

    public int dequeue() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException(); // 큐가 비어 있는 경우
        }
        int x = queue[front++];
        num--;

        if (front == max) {
            front = 0;
        }

        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if (num <=0) {
            throw new EmptyIntQueueException();
        }

        return queue[front];
    }

    public int indexOf(int x) {
        for (int i=0;i<queue.length;i++) {
            int idx = (i+front) % max;

            if (queue[idx] == x) {
                return idx;
            }
        }

        return -1;
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() throws EmptyIntQueueException{
        if (num <= 0) {
            System.out.println("큐가 비어있습니다.");
        } else {
            for (int i=0;i<num;i++) {
                System.out.print(queue[(i+front)%max]+ " ");
            }
            System.out.println();
        }
    }

}

