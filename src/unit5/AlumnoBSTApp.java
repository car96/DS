/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class AlumnoBSTApp {

    public static void main(String[] args) {
        Alumno lista[] = new Alumno[5];

        lista[0] = new Alumno("Peter Pan", 2, 80.1);
        lista[1] = new Alumno("Campanita", 4, 92.7);
        lista[2] = new Alumno("Wendy", 3, 78.3);
        lista[3] = new Alumno("Garfio", 12, 85.4);

        JOptionPane.showMessageDialog(null, "Hay: " + Alumno.cantAlumnos + " alumnos");

        BinarySearchTree root = new BinarySearchTree();

        for (Alumno element : lista) {
            if (element != null) {
                try {
                    root.insert(element);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, "Elemento ya existente");
                }
            }
        }

        PrintingVisitor pV = new PrintingVisitor();
        InOrder inOrder = new InOrder(pV);
        root.depthFirstTraversal(inOrder);

    }
}
