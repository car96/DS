package unit3;

import javax.swing.JOptionPane;

public class PalindromeNumber {
    public static void main(String[] args){
        String number = JOptionPane.showInputDialog("Type your Palindrome number");
        QueueAsLinkedList queue = new QueueAsLinkedList();
        StackOnLL stack = new StackOnLL();
        
        for(int i=0; i<number.length(); i++){
            queue.enqueue(number.charAt(i));
            stack.push(number.charAt(i));
            
        }
        boolean palindrome = true;
        for(int i=0; i<number.length(); i++){
            if(queue.dequeue() != stack.pop()){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            JOptionPane.showMessageDialog(null, "Your number IS a palindrome");
        }
        else{
            JOptionPane.showMessageDialog(null, "Your number IS NOT a palindrome");
        }
    }
  
}
