package third;

import javax.swing.*;

public class StringChars {
    
    public static void main(String[ ] args) {
        //  Counting some chars in entered text
        int count;
        String s;
        while(true) {
            s = JOptionPane.showInputDialog("Enter some text:");
            if(s == null)   //  If user pressed Cancel button in dialog box
                break;
            count = 0;
            for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) == 'A' ||  s.charAt(i) == 'a')
                    count++;
            JOptionPane.showMessageDialog(null, "There were " + count + " A/a");
        }
    }
    
}


