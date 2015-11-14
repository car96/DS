package unit5;

public class PostOrder extends AbstractPrePostVisitor{
	private Visitor visitor;

	public PostOrder(Visitor visitor){
		this.visitor = visitor;
	}

	public void postVisit(Object ob){
		visitor.visit(ob);
	}

	public boolean isDone(){
		return visitor.isDone();
	}
}
