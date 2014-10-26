package sixth;

import java.io.*;
import javax.swing.*;

public class WritingTextFile {
    
    public static void main(String[ ] a) throws Exception {
        String filename, line;
        filename = JOptionPane.showInputDialog("Enter file name (with path):");
        File f = new File(filename);
        PrintWriter out = new PrintWriter(new FileOutputStream(f), true);
        while(true) {
            line = JOptionPane.showInputDialog("Enter a line of text:");
            if(line == null)
                break;
            out.println(line);
        }
        out.close();
        JOptionPane.showMessageDialog(null, "Writing to file completed...");
    }
    
}


