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
public class AppBSTTest1 {
    public static void main(String[] args){
        BinarySearchTree bST = new BinarySearchTree();
        
        bST.insert(10);
        bST.insert(15);
        bST.insert(4);
        bST.insert(12);
        bST.insert(11);
        bST.insert(6);
        bST.insert(9);
        bST.insert(7);
        
        PrintingVisitor visitor = new PrintingVisitor();
        InOrder inOrder = new InOrder(visitor);
        bST.depthFirstTraversal(inOrder);
        System.out.println("================");
        bST.withdraw(10);
        bST.depthFirstTraversal(inOrder);
    }
    
}
