/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

import java.io.*;

/**
 *
 * @author carlos
 */
public class AppBST {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        GFileChooser gFC = new GFileChooser();
        String fileN = gFC.askForFile();
        File file = new File(fileN);
        FileReader fR = new FileReader(file);
        BufferedReader bR = new BufferedReader(fR);

        BinarySearchTree bST = new BinarySearchTree();

        while (bR.ready()) {
            bST.insert(bR.readLine());
        }
        bR.close();

        CharVisitor visitor = new CharVisitor();
        InOrder inOrder = new InOrder(visitor);

        bST.depthFirstTraversal(inOrder);

        System.out.println(visitor.getNC());

        String fTS = gFC.saveToFile();
        File fileTS = new File(fTS);
        FileOutputStream fOS = new FileOutputStream(fileTS);
        PrintWriter pW = new PrintWriter(fOS);
        
        pW.println(visitor.getStr());
        pW.println(visitor.getNC());
        pW.close();
    }

}
