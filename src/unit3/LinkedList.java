package unit3;

public class LinkedList {

	protected Node head;
	protected Node tail;

	public LinkedList(){
		head = null;
		tail = null;
	}

	public void purge(){
		head = null;
		tail = null;
	}

	public Node getHead(){
		return head;
	}

	public Node getTail(){
		return tail;
	}

	public boolean isEmpty(){
		return head == null;
	}

	public Object getFirst() throws Exception{
		if(isEmpty()){
			throw new Exception();
		}
		return head.info;
	}
	public Object getLast() throws Exception{
		if(tail == null){
			throw new Exception();
		}
		return tail.info;
	}

	public void prepend (Object item){
		Node tmp = new Node(item, head);
		if(head == null){
			tail = tmp;
		}
		head = tmp;
	}

	public void append(Object item){
		Node tmp = new Node(item, null);
		if(head == null){
			head = tmp;
		}
		else{
			tail.link = tmp;
		}
		tail = tmp;
	}

	public void assign(LinkedList list){
		if(list != this){
			purge();
			for(Node ptr = list.head; ptr != null; ptr = ptr.link){
				append(ptr.info);
			}
		}
	}

	public void extract(Object item){
		Node ptr = head;
		Node prevPtr = null;
		while(ptr != null && ptr.info != item){
			prevPtr = ptr;
			ptr = ptr.link;
		}
		if(ptr == null){
			throw new IllegalArgumentException("item not found");
		}
		if(ptr == head){
			head = ptr.link;
		}
		else{
			prevPtr.link = ptr.link;
		}
		if(ptr == tail){
			tail = prevPtr;
		}
	}

	public String toString(){
		if(!isEmpty()){
			String str = "";
			Node ptr = head;
			boolean cont = true;
			do{
				if(ptr != null){
					str += ptr.getInfo().toString() + "\n";
					ptr = ptr.link;
				}
				else{
					cont = false;
				}
			}while(cont);
			return str;
		}
		return null;
	}

	public final class Node{
		Object info;
		Node link;

		Node (Object datum, Node link){
			this.info = datum;
			this.link = link;
		}

		public Object getInfo (){
			return info;
		}
		public Node getNext(){
			return link;
		}

		public void insertAfter(Object item){
			link = new Node(item, link);
			if(tail == this){
				tail = link;
			}
		}
		public void insertBefore(Object item){
			Node tmp = new Node(item, this);
			if(this == head){
				head = tmp;
			}
			else{
				Node prevPtr = head;
				while(prevPtr != null && prevPtr.link != this){
					prevPtr = prevPtr.link;
				}
				prevPtr.link = tmp;
			}
		}
	}

}