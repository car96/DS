
package unit2;

import unit3.IContainer;

public interface IQueue extends IContainer{
    Object getFront();
    Object getRear();
    void enqueue(Object ob);
    Object dequeue();
    
}
