package unit5;

public interface Tree{
	Object getKey();
	Tree getSubtree(int i);
	boolean isEmpty();
	boolean isLeaf();
	int getHeight();
	void depthFirstTraversal(PrePostVisitor visitor);
}
