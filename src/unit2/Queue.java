/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;

/**
 *
 * @author carlos
 */
public class Queue implements IQueue{
    Object array[];
    int head;
    int tail;
    
    public Queue(){
        array = new Object[10];
        head = -1;
        tail = -1;
    }
    
    public Queue(int n){
        array = new Object[n];
        head = -1;
        tail = -1;
    }
    
    @Override
    public boolean isEmpty(){
        return head == -1 && tail == -1 ;
    }
    
    @Override
    public boolean isFull(){
        return tail == (array.length-1);
    }
    
    @Override
    public Object getFront(){
        if(!isEmpty()){
            return array[head];
        }
        return null;
    }
    
    @Override
    public Object getRear(){
        if(!isEmpty()){
            return array[tail];
        }
        return null;
    }
    
    @Override
    public void enqueue(Object ob){
        if(!isFull()){
            if(isEmpty()){
                head++;
                tail++;
                array[tail] = ob;
            }
            else{
                tail++;
                array[tail] = ob;
            }
        }
    }
    
    @Override
    public Object dequeue(){
        if(!isEmpty()){
            Object tmp = array[head];
            head++;
            return tmp;
        }
        return null;
    }
}
