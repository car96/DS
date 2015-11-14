package unit5;

public class PrintingVisitor implements Visitor{

	private boolean done = false;

	public void visit(Object ob){
		System.out.print(ob + "\n");
		done = true;
	}

	public boolean isDone(){
		return done;
	}
}
