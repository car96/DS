/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class AppCar {

    public static void main(String[] args) {
        Stack<Car> compactCars = new Stack<>();
        Stack<Car> semicompactCars = new Stack<>();
        Stack<Car> largeCars = new Stack<>();
        Stack<Car> tmpStack = new Stack<>();
        QueueAsLinkedList queue = new QueueAsLinkedList();
        Object options[] = {"Arrival of Car", "Parking a car", "Deliver a car", "Show parking status", "exit"};
        Object sizes[] = {"COMPACT", "SEMICOMPACT", "LARGE"};
        String selection, carS, brand, plate;
        Size size = null;
        int cCars = 9;
        int scCars = 6;
        int lCars = 4;
        boolean cont = true;

        do {
            selection = (String) JOptionPane.showInputDialog(null, "What do you want to do?: ", "Selection Menu", JOptionPane.PLAIN_MESSAGE, null, options, "Arrival of Car");

            try {
                switch (selection) {
                    case "Arrival of Car":
                        carS = (String) JOptionPane.showInputDialog(null, "Select the size of the car: ", "Selection Menu", JOptionPane.PLAIN_MESSAGE, null, sizes, "COMPACT");
                        switch (carS) {
                            case "COMPACT":
                                size = Size.COMPACT;
                                break;
                            case "SEMICOMPACT":
                                size = Size.SEMICOMPACT;
                                break;
                            case "LARGE":
                                size = Size.LARGE;
                                break;
                        }
                        brand = JOptionPane.showInputDialog("Brand of the car?");
                        plate = JOptionPane.showInputDialog("Type the plate of the car: ");
                        queue.enqueue(new Car(brand, plate, size));
                        break;
                    case "Parking a car":
                        if (!queue.isEmpty()) {
                            Car tmp = (Car) queue.dequeue();
                            if (null != tmp.getSize()) {
                                switch (tmp.getSize()) {
                                    case COMPACT:
                                        if (cCars > 0) {
                                            compactCars.push(tmp);
                                            cCars--;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "There's no room left for Compact cars, the car has left.");
                                        }
                                        break;
                                    case SEMICOMPACT:
                                        if (scCars > 0) {
                                            semicompactCars.push(tmp);
                                            scCars--;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "There's no room left for Semicompact cars, the car has left.");
                                        }
                                        break;
                                    default:
                                        if (lCars > 0) {
                                            largeCars.push(tmp);
                                            lCars--;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "There's no room left for Large cars, the car has left.");
                                        }
                                        break;
                                }
                                JOptionPane.showMessageDialog(null, "The following car has been parked in its corresponding section: \n"+tmp.toString());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "There are no cars in the arrival queue.");
                        }
                        break;

                    case "Deliver a car":
                        carS = (String) JOptionPane.showInputDialog(null, "Select the size of the car: ", "Selection Menu", JOptionPane.PLAIN_MESSAGE, null, sizes, "COMPACT");
                        plate = JOptionPane.showInputDialog("Type the plate of the car you want to search for: ");
                        boolean found = false;
                        if (carS.equals("COMPACT")) {
                            while (!compactCars.empty()) {
                                Car tmpCar = compactCars.pop();
                                if (tmpCar.getPlate().equals(plate)) {
                                    JOptionPane.showMessageDialog(null, "The car has been found and removed!");
                                    found = true;
                                    cCars++;
                                    break;
                                } else {
                                    tmpStack.push(tmpCar);
                                }
                                while (!tmpStack.empty()) {
                                    compactCars.push(tmpStack.pop());
                                }
                                break;
                            }
                        } else if (carS.equals("SEMICOMPACT")) {
                            while (!semicompactCars.empty()) {
                                Car tmpCar = semicompactCars.pop();
                                if (tmpCar.getPlate().equals(plate)) {
                                    JOptionPane.showMessageDialog(null, "The car has been found and removed!");
                                    found = true;
                                    scCars++;
                                    break;
                                } else {
                                    tmpStack.push(tmpCar);
                                }
                            }
                            while (!tmpStack.empty()) {
                                semicompactCars.push(tmpStack.pop());
                            }
                            break;
                        } else {
                            while (!largeCars.empty()) {
                                Car tmpCar = largeCars.pop();
                                if (tmpCar.getPlate().equals(plate)) {
                                    JOptionPane.showMessageDialog(null, "The car has been found and removed!");
                                    found = true;
                                    lCars++;
                                    break;
                                } else {
                                    tmpStack.push(tmpCar);
                                }
                            }
                            while (!tmpStack.empty()) {
                                largeCars.push(tmpStack.pop());
                            }
                            break;
                        }
                        if (!found) {
                            JOptionPane.showMessageDialog(null, "There's no car with these characteristics in the parking lot.");
                        }
                        break;

                    case "Show parking status":
                        QueueAsLinkedList tmpQueue = new QueueAsLinkedList();
                        String str = "";
                        if (!queue.isEmpty()) {
                            str = "===========Cars in the Queue===========\n";
                        }
                        while (!queue.isEmpty()) {
                            Car tmpCar = (Car) queue.dequeue();
                            str += tmpCar.toString() + "\n";
                            tmpQueue.enqueue(tmpCar);
                        }
                        while (!tmpQueue.isEmpty()) {
                            queue.enqueue(tmpQueue.dequeue());
                        }

                        if (!compactCars.empty()) {
                            str += "\n===========Cars in the Compact section===========\n";
                        }
                        while (!compactCars.empty()) {
                            tmpStack.push(compactCars.pop());
                        }
                        while (!tmpStack.empty()) {
                            Car tmpCar = tmpStack.pop();
                            str += tmpCar.toString() + "\n";
                            compactCars.push(tmpCar);
                        }

                        if (!semicompactCars.empty()) {
                            str += "\n===========Cars in the Semicompact section===========\n";
                        }
                        while (!semicompactCars.empty()) {
                            tmpStack.push(semicompactCars.pop());
                        }
                        while (!tmpStack.empty()) {
                            Car tmpCar = tmpStack.pop();
                            str += tmpCar.toString() + "\n";
                            semicompactCars.push(tmpCar);
                        }

                        if (!largeCars.empty()) {
                            str += "\n===========Cars in the Large section===========\n";
                        }
                        while (!largeCars.empty()) {
                            tmpStack.push(largeCars.pop());
                        }
                        while (!tmpStack.empty()) {
                            Car tmpCar = tmpStack.pop();
                            str += tmpCar.toString() + "\n";
                            largeCars.push(tmpCar);
                        }
                        JOptionPane.showMessageDialog(null, str);
                        break;

                    case "exit":
                        cont = false;
                        break;

                }
            }catch(NullPointerException nPE){
                JOptionPane.showMessageDialog(null, "If you want to exit select the 'exit' option.");
            }

        } while (cont);
    }

}
