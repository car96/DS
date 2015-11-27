/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4;

/**
 *
 * @author carlos
 */
public class RecursiveTest {
    
    
    public String PrintArray(int array[], int i){
        if(i==0){
            return array[i]+"";
        }
        else{
            return PrintArray(array, i-1) + " " +array[i];
        }
    }
    
    public static void main(String[] args){
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        RecursiveTest rT = new RecursiveTest();
        System.out.println(rT.PrintArray(array, 9));
    }
}
