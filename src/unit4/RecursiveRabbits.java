package unit4;

import javax.swing.*;

public class RecursiveRabbits {

    public int recursiveRabbits(int m, int r) {
        if (m == 1) {
            return r;
        } else {
            return recursiveRabbits(m - 1, r * 2);
        }
    }

    public static void main(String[] args) {
        RecursiveRabbits rR = new RecursiveRabbits();
        int r = Integer.parseInt(JOptionPane.showInputDialog("How many rabits do you have?"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("How many months do you want to calculate?"));

        JOptionPane.showMessageDialog(null, "The number of Rabbits available to sell at the end of the " + m + " months is: " +
                                            rR.recursiveRabbits(m, r));
    }

}
