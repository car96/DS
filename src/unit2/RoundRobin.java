package unit2;

import javax.swing.JOptionPane;
import unit3.QueueAsLinkedList;

/**
 *
 * @author carlos
 */
public class RoundRobin {

    public static void main(String[] args) {
        int nProcesses = Integer.parseInt(JOptionPane.showInputDialog("How many process do you have?"));
        Process array[] = new Process[nProcesses];
        int quantum = Integer.parseInt(JOptionPane.showInputDialog("Quantum: "));
        QueueAsLinkedList circularQueue = new QueueAsLinkedList();

        for (int i = 0; i <= nProcesses; i++) {
            int yN;
            if (i == 0) {
                yN = JOptionPane.showConfirmDialog(null, "Want to insert a process?", "New Process", JOptionPane.YES_NO_OPTION);
            } else {
                yN = JOptionPane.showConfirmDialog(null, "Want to add another process?", "New Process", JOptionPane.YES_NO_OPTION);
            }
            if (yN == 0) {
                String name = JOptionPane.showInputDialog("Name of the process: ");
                int duration = Integer.parseInt(JOptionPane.showInputDialog("How long does it take to fully execute?"));
                int sTime = Integer.parseInt(JOptionPane.showInputDialog("Starting time of the process: "));
                array[i] = new Process(duration, sTime, name);
            } else {
                break;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i - 1].getsTime() > array[i].getsTime()) {
                    Process tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            } else {
                break;
            }

        }

        for (Process array1 : array) {
            if (array1 != null) {
                circularQueue.enqueue(array1);
            } else {
                break;
            }
        }
        
        int aTime = 0;
        int i=0;
        do{
            if(!circularQueue.isEmpty()){
                
                Process tmp = (Process)circularQueue.dequeue();
                tmp.setrTime(tmp.getrTime()-quantum);
                
                
                if(tmp.getrTime()>0){
                    circularQueue.enqueue(tmp);
                    aTime += quantum;
                } else{
                    aTime += (quantum+tmp.getrTime());
                    tmp.setfTime(aTime);
                    array[i] = tmp;
                    
                }
                
            } else{
                break;
            }
        }while(true);
        String str = "";
        for(Process array2 : array){
            str += array2.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, str);
    }

}
