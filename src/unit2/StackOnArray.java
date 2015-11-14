package unit2;


public class StackOnArray implements StackInterface {
	protected Object stack[];
	protected int top;

	public StackOnArray(int size){
		stack = new Object[size];
		top = -1;
	}

	public StackOnArray(){
		stack = new Object[10];
		top = -1;
	}

	@Override
	public boolean isEmpty() {
		if(top == -1){
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == stack.length-1){
			return true;
		}
		return false;
	}

	@Override
	public Object getTop() {
		if(!isEmpty()){
			return stack[top];
		}
		return null;
	}

	@Override
	public void push(Object obj) {
		if(obj != null){
			if(!isFull()){
				top++;
				stack[top] = obj;
			}
		}

	}

	@Override
	public Object pop() {
		if(!isEmpty()){
			Object obj = stack[top];
			stack[top] = null;
			top--;
			return obj;
		}
		return null;
	}

	public int size(){
		return stack.length;
	}

	public String toString(){
		String out = "";
		StackOnArray tempStack = new StackOnArray(this.size());

		while(!this.isEmpty()){
			Object ob = pop();
			out = out + "\n" + ob.toString();
			tempStack.push(ob);
		}

		while(!tempStack.isEmpty()){
			this.push(tempStack.pop());
		}
		return out;
	}

}
