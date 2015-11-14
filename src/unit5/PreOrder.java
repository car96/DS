package unit5;

public class PreOrder extends AbstractPrePostVisitor{

	protected Visitor visitor;

	public PreOrder(Visitor visitor){
		this.visitor = visitor;
	}

	@Override
	public void preVisit(Object ob){
		visitor.visit(ob);
	}

	@Override
	public boolean isDone(){
		return visitor.isDone();
	}
}
