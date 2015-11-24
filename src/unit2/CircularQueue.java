package unit2;

public class CircularQueue implements IQueue {

    Object array[];
    int head;
    int tail;

    public CircularQueue() {
        array = new Object[10];
        head = -1;
        tail = -1;
    }

    public CircularQueue(int n) {
        array = new Object[n];
        head = -1;
        tail = -1;
    }

    @Override
    public Object getFront() {
        if (!isEmpty()) {
            return array[head];
        }
        return null;
    }

    @Override
    public Object getRear() {
        if (!isEmpty()) {
            return array[tail];
        }
        return null;
    }

    @Override
    public void enqueue(Object ob) {
        if (!isFull()) {
            if (tail == array.length - 1 && head > 0) {
                tail = 0;
            } else if (tail == 0 && head == -1) {
                tail++;
                array[tail] = ob;
                head = 0;
            }
        }
    }

    @Override
    public Object dequeue() {
        if (!isEmpty()) {
            Object tmp = array[head];
            head--;
            return tmp;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return head == -1 && tail == -1;
    }

    @Override
    public boolean isFull() {
        if((head == 0 && tail == array.length-1) || (head == tail+1) ){
            return true;
        }
        return false;
    }

}
