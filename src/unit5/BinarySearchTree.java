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
public class BinarySearchTree extends BinaryTree implements SearchTree {

    public Object getKey() {
        return key;
    }

    public BinarySearchTree getLeftBST() {
        return (BinarySearchTree) left;
    }

    public BinarySearchTree getRightBST() {
        return (BinarySearchTree) right;
    }

    public Comparable find(Comparable object) {
        if (isEmpty()) {
            return null;

        }
        int diff = object.compareTo((Comparable) key);
        if (diff == 0) {
            return (Comparable) key;
        } else if (diff < 0) {
            return getLeftBST().find(object);
        } else {
            return getRightBST().find(object);
        }
    }

    @Override
    public Comparable findMin() {
        if (isEmpty()) {
            return null;
        } else if (getLeftBST().isEmpty()) {
            return (Comparable) key;
        } else {
            return getLeftBST().findMin();
        }
    }

    @Override
    public Comparable findMax() {
        if (isEmpty()) {
            return null;
        } else if (getRightBST().isEmpty()) {
            return (Comparable) key;
        } else {
            return getRightBST().findMax();
        }
    }

    @Override
    public Tree getSubtree(int i) {
        switch (i) {
            case 0:
                return (BinarySearchTree) getLeftBST();
            case 1:
                return (BinarySearchTree) getRightBST();
            default:
                throw new IllegalArgumentException();
        }
    }

    public void insert(Comparable object) {
        if (isEmpty()) {
            attachKey(object);
        } else {
            int diff = object.compareTo((Comparable) getKey());
            if (diff == 0) {
                throw new IllegalArgumentException("duplicate key");
            }
            if (diff < 0) {
                getLeftBST().insert(object);
            } else {
                getRightBST().insert(object);
            }
        }
    }

    public void attachKey(Object object) {
        try {
            if (!isEmpty()) {
                throw new InvalidOperationException();
            }
            key = object;
            left = new BinarySearchTree();
            right = new BinarySearchTree();
        } catch (InvalidOperationException e) {
            System.err.println("CAN'T HANG ON THE NODE");
        }
    }

    public int getDegree() {
        return 2;
    }

    public boolean isFull() {
        return false;
    }

    public void withdraw(Comparable object) {
        if (isEmpty()) {
            throw new IllegalArgumentException("object not found");
        }
        int diff = object.compareTo((Comparable) getKey());
        if (diff == 0) {
            if (!getLeftBST().isEmpty()) {
                Comparable max = getLeftBST().findMax();
                key = max;
                getLeftBST().withdraw(max);
            } else if (!getRightBST().isEmpty()) {
                Comparable min = getRightBST().findMin();
                key = min;
                getRightBST().withdraw(min);
            } else {
                detachKey();
            }
        }
        else if(diff<0){
            getLeftBST().withdraw(object);
        }
        else{
            getRightBST().withdraw(object);
        }

    }
    
    public void detachKey(){
        key = null;
    }
    
    

}
