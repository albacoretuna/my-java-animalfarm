package sixth;

import java.io.*;
import javax.swing.*;

public class ReadingTextFile {
    
    public static void main(String[ ] a) throws Exception {
        String filename, line;
        filename = JOptionPane.showInputDialog("Enter file name (with path):");
        File f = new File(filename);
        BufferedReader in = new BufferedReader
                                         (new InputStreamReader(new FileInputStream(f)));
        String message = "See file content:\n";
        while(true) {
            line = in.readLine();
            if(line == null)
                break;
            message += line + "\n";
        }
        in.close();
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }
    
}


