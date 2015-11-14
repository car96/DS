package unit5;

public interface PrePostVisitor{
	void preVisit(Object ob);
	void inVisit(Object ob);
	void postVisit(Object ob);
	boolean isDone();
}
