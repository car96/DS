package unit2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class PostfixEvaluator {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		JOptionPane.showMessageDialog(null, "You're going to be prompted in a new window for the file containing the Postfix operation first"+
											"\nThen a new windows will appear asking you to create or select the file to be written.");
		
		//opening The File
		GFileChooser fileChosen = new GFileChooser();
		String pathToFile = fileChosen.askForFile();
		File file = new File(pathToFile);
		FileReader fR = new FileReader(file);
		BufferedReader bR = new BufferedReader(fR);
		
		//Saving a new File
		String fileToSave = fileChosen.saveToFile();
		File fileSave = new File(fileToSave);
		FileOutputStream fOS = new FileOutputStream(fileSave);
		PrintWriter pW = new PrintWriter(fOS);
		String operation = "";
		

		while(bR.ready()){
			operation = bR.readLine();
			StackOnArray stack = new StackOnArray(operation.length());
			String array[] = operation.split(",");
			for(int i=0; i<array.length; i++){
				if(!isOperator(array[i])){
					stack.push(array[i]);
				}
				else{
					double val2 = Double.parseDouble((String)stack.pop());
					double val1 = Double.parseDouble((String)stack.pop());
					double result = 0;
					String stringResult = "";
					switch(array[i]){
					case "+": result = val1+val2 ;
							  stringResult = Double.toString(result);
							  stack.push(stringResult);
							  break;
					case "-": result = val1-val2;
							  stringResult = Double.toString(result);
							  stack.push(stringResult);
							  break;
					case "*": result = val1*val2;
							  stringResult = Double.toString(result);
							  stack.push(stringResult);
							  break;
					case "/": result = val1/val2;
							  stringResult = Double.toString(result);
							  stack.push(stringResult);
							  break;
					case "%": result = val1%val2;
							  stringResult = Double.toString(result);
							  stack.push(stringResult);
							  break;
					}
				}
			}
			String toWrite = operation+" = "+(String)stack.pop();
			pW.println(toWrite);

		}
		bR.close();
		pW.close();
		JOptionPane.showMessageDialog(null, "Your file has been saved to: "+fileToSave);
	}

	public static boolean isOperator(String str){
		String operators[] = {"+", "-", "*", "/", "%"};
            for (String operator : operators) {
                if (str.equals(operator)) {
                    return true;
                }
            }
		return false;
	}

}
