
package unit2;



public class CircularQueue implements IQueue{
    Object array[];
    int head;
    int tail;
    
    public CircularQueue(){
        array = new Object[10];
        head = -1;
        tail = -1;
    }
    
    public CircularQueue(int n){
        array = new Object[n];
        head = -1;
        tail = -1;
    }

    @Override
    public Object getFront() {
        if(!isEmpty()){
            return array[head];
        }
        return null;
    }

    @Override
    public Object getRear() {
        if(!isEmpty()){
            return array[tail];
        }
        return null;
    }

    @Override
    public void enqueue(Object ob) {
        if(!isFull()){
            array[tail] = ob;
            tail++;
        }
    }

    @Override
    public Object dequeue() {
        if(!isEmpty()){
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
        return tail == (head-1);
    }
    
}
