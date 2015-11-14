package unit3;

public class QueueAsLinkedList {
	protected LinkedList list;

	public QueueAsLinkedList(){
		list = new LinkedList();
	}

	public void purge(){
		list.purge();
	}

	public Object getHead(){
		try{
			return list.getFirst();
		}catch(Exception e){
			return null;
		}

	}

	public void enqueue(Object object){
		list.append(object);

	}

	public Object dequeue(){
		try{
			Object result = list.getFirst();
			list.extract(result);
			return result;
		}catch(Exception e){
			return null;
		}
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	
	public boolean isFull() {
		return false;
	}
}
