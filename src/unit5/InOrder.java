package unit5;

public class InOrder extends AbstractPrePostVisitor{
	
	protected Visitor visitor;

	public InOrder(Visitor visitor){
		this.visitor = visitor;
	}
        
	public void inVisit(Object ob){
		visitor.visit(ob);
	}

        @Override
	public boolean isDone(){
		return visitor.isDone();
	}
}
