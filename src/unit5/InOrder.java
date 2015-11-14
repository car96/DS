package unit5;

public class InOrder extends AbstractPrePostVisitor{
	
	private Visitor visitor;

	public InOrder(Visitor visitor){
		this.visitor = visitor;
	}

	public void InVisit(Object ob){
		visitor.visit(ob);
	}

        @Override
	public boolean isDone(){
		return visitor.isDone();
	}
}
