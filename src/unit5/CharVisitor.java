/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

/**
 *
 * @author carlos
 */
public class CharVisitor implements Visitor{
    
    private boolean done = false;
    private int nC = 0;
    private String fStr = "";

    @Override
    public void visit(Object ob) {
        
        String str = (String)ob;
        if(str.charAt(0) == 'M'){
            nC++;
        }
        System.out.println(str);
        fStr += str+"\n";
        done = true;
    }

    @Override
    public boolean isDone() {
        return done;
    }
    
    public int getNC(){
        return nC;
    }
    
    public String getStr(){
        return fStr;
    }
    
}
