package unit1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

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
        for (int i=0; i<array.length; i++) {
            int yN = JOptionPane.showConfirmDialog(null, "Do you want to add a new student?", "Add student", JOptionPane.YES_NO_OPTION);
            if (yN == 0) {
                String name = JOptionPane.showInputDialog("Name of the student: ");
                String surName = JOptionPane.showInputDialog("Sur Name: ");
                String maidenName = JOptionPane.showInputDialog("Maiden Name: ");
                do {
                    try {
                        int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
                        array[i] = new Alumno(name, surName, maidenName, age);
                        break;
                    } catch (EdadException e) {
                        JOptionPane.showMessageDialog(null, "Type a valid age between 1 and 100 years: ");
                    }
                } while (true);

                for (int j=0; j<array[i].array.length; j++) {
                    int yNS = JOptionPane.showConfirmDialog(null, "Do you want to add a new student?", "Add student", JOptionPane.YES_NO_OPTION);
                    if (yNS == 0) {
                        String nameS = JOptionPane.showInputDialog("What's the name of the subject?");
                        do {
                            try{
                            int note = Integer.parseInt(JOptionPane.showInputDialog("Note? "));
                            array[i].agregarAsignatura(new Asignatura(nameS, note));
                            break;
                            }catch(NumberFormatException nFE){
                                JOptionPane.showMessageDialog(null,"Type a valid integer number between 0 and 100");
                            }
                        } while (true);
                    } else {
                        break;
                    }
                }

            } else {
                break;
            }
        }
    }
    
    @Override
    public String toString(){
        String strAlumnos = "";
        for (Alumno array1 : array) {
            strAlumnos += array1.toString();
        }
        return strAlumnos;
    }
    
    public static void main(String[] args){
        int students = Integer.parseInt(JOptionPane.showInputDialog("How many students do you have?"));
        AppListadoDeAlumnos aLDA = new AppListadoDeAlumnos(students);
        aLDA.crearAlumnos();
        
        JTextArea textArea = new JTextArea(aLDA.toString(), 20, 20);
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JOptionPane.showMessageDialog(null, scrollPane, "Students List", JOptionPane.PLAIN_MESSAGE);
    }
}
