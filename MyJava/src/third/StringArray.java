package third;

import javax.swing.*;
import java.util.*;

public class StringArray {
    
    public static void main(String[ ] args) {
        //  Trying array of strings
        int count;
        String[ ] names;     //  Array of strings
        count = Integer.parseInt
                      (JOptionPane.showInputDialog("How many strings you'll enter ?"));
        names = new String[count];
        for(int i = 0; i < count; i++)
            names[i] = JOptionPane.showInputDialog("Next name, please...");
        //  Now sorting into orderA..Z
        Arrays.sort(names);
        String message = "See sorted names:\n";
        for(int i = 0; i < count; i++)
            message += names[i] + "\n";
        JOptionPane.showMessageDialog(null, message);
    }
    
}





