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

    public BinaryTree(Object key, BinaryTree left, BinaryTree right) {
        
        if (key != null) {
            if (left == null) {
                left = new BinaryTree();
            } else {
                this.left = left;
            }
            if (right == null) {
                right = new BinaryTree();
            } else {
                this.right = right;
            }
        } else{
            this.left = left;
            this.right = right;
        }
        this.key = key;
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

    @Override
    public Object getKey() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tree getSubtree(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void depthFirstTraversal(PrePostVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
