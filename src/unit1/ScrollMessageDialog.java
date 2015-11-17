package unit1;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 * Write a description of class ScrollMessageDialog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScrollMessageDialog {

    public static void displayAll(String theStringToShow) {
        JTextArea txtArea = new JTextArea(
                theStringToShow,
                20,
                20);
        JScrollPane scrPane = new JScrollPane(
                txtArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JOptionPane.showMessageDialog(null,
                scrPane,
                "MUCHA INFORMACION",
                JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        final int NUM_LINEAS = 90;
        String str = "";
        for (int ind = 0; ind < NUM_LINEAS; ind++) {
            str += "una linea ...una linea ... una linea ...una linea ...una linea ...una linea ...una linea ...\n";
        }
        displayAll(str);
    }

}
