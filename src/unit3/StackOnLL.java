package unit3;

public class StackOnLL implements unit2.StackInterface{
	LinkedList list = new LinkedList();

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public Object getTop() {
		try{
			return list.getFirst();
		}catch(Exception e){
			return null;
		}
	}

	@Override
	public void push(Object obj) {
		list.prepend(obj);

	}

	@Override
	public Object pop() {
		try{
			Object ob = list.getFirst();
			list.extract(ob);
			return ob;
		}catch(Exception e){
			return null;
		}
	}

}
