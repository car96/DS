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
public class AppTrees {
    public static void main(String[] args){
        //Creating the tree
        BinaryTree tC = new BinaryTree("C");
        BinaryTree tB = new BinaryTree("B", new BinaryTree(), tC);
        BinaryTree tA = new BinaryTree("A", tB, new BinaryTree());
        
        PrintingVisitor visitor = new PrintingVisitor();
        InOrder inOrder = new InOrder(visitor);
        
        tA.depthFirstTraversal(inOrder);
        
    }
    
}
