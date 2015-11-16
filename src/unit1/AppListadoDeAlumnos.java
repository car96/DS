package unit1;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class AppListadoDeAlumnos {

    private final Alumno array[];

    public AppListadoDeAlumnos(int n) {
        array = new Alumno[n];
    }

    public void crearAlumnos() {
        for (Alumno element : array) {
            int yN = JOptionPane.showConfirmDialog(null, "Do you want to add a new student?", "Add student", JOptionPane.YES_NO_OPTION);
            if (yN == 0) {
                String name = JOptionPane.showInputDialog("Name of the student: ");
                String surName = JOptionPane.showInputDialog("Sur Name: ");
                String maidenName = JOptionPane.showInputDialog("Maiden Name: ");
                do {
                    try {
                        int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
                        element = new Alumno(name, surName, maidenName, age);
                        break;
                    } catch (EdadException e) {
                        JOptionPane.showMessageDialog(null, "Type a valid age between 1 and 100 years: ");
                    }
                } while (true);
                
            } else {
                break;
            }
        }
    }
}
