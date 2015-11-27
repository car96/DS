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
public class SubjectsBSTApp {
    public static void main(String[] args){
        Subject array[] = new Subject[4];
        
        array[0] = new Subject("Math", 11);
        array[1] = new Subject("Physics", 12);
        array[2] = new Subject("OOP", 9);
        array[3] = new Subject("Statistic", 7);
        
        BinarySearchTree root = new BinarySearchTree();
        for(Subject element: array){
            root.insert((Comparable)element);
        }
        
        PrintingVisitor pV = new PrintingVisitor();
        InOrder inOrder = new InOrder(pV);
        root.depthFirstTraversal(inOrder);
    }
    
}
