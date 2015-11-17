/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

/**
 *
 * @author carlos
 */
public class BinaryTree implements Tree {

    protected Object key;
    protected BinaryTree left;
    protected BinaryTree right;
    protected int height = 0;

    public BinaryTree(Object key, BinaryTree left, BinaryTree right) {
        this.key = key;
        this.left = left;
        this.right = right;
        
        if (key != null) {
            if (left == null) {
                left = new BinaryTree();
            } 
            if (right == null) {
                right = new BinaryTree();
            } 
        } 
    }

    /**
     * This constructor is calling the constructor with parameters to build an
     * empty tree
     */
    public BinaryTree() {
        this(null, null, null);
    }

    /**
     * This constructor is building a binary tree with root and empty subtrees.
     * Useful to create leaves.
     *
     * @param key the Object for the root.
     */
    public BinaryTree(Object key) {
        this(key, new BinaryTree(), new BinaryTree());
    }
    
    /**
     * Method to drop all elements in the three, and let it empty.
     */
    public void purge(){
        key = null;
        left=null;
        right=null;
    }

    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public Tree getSubtree(int i) {
        switch (i) {
            case 0:
                return left;
            case 1:
                return right;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean isEmpty() {
        return key == null && left == null && right == null;
    }

    @Override
    public boolean isLeaf() {
        return key != null && left.isEmpty() && right.isEmpty();
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void depthFirstTraversal(PrePostVisitor visitor) {
        if(!isEmpty()){
            visitor.preVisit(key);
            left.depthFirstTraversal(visitor);
            visitor.inVisit(key);
            right.depthFirstTraversal(visitor);
            visitor.postVisit(key);
        }
    }

}
