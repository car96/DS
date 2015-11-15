package unit2;
import javax.swing.*;

public class GuessingWords {
	public static void main(String[] args){

		
		String input = JOptionPane.showInputDialog("Type in the words: ");
		char array[] = {'a', 'e', 'i', 'o', 'u'};
		Queue queue = new Queue();	

		for(int i=0; i<input.length(); i++){
			boolean isVowel = false;
			for(int j=0; j<array.length; j++){
				if(array[j] == input.charAt(i)){
					isVowel = true;
					break;
				}
			}
			if(isVowel){
				queue.enqueue('_');
			}
			else{
				queue.enqueue(input.charAt(i));
			}
		}
		String output = "";

		for(int i=0; i<input.length(); i++){
			output += queue.dequeue();
		}
		JOptionPane.showMessageDialog(null,output);
	}
}
