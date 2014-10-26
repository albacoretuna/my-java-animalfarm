package third;

import javax.swing.*;

public class StringSymm {
    
    public static void main(String[ ] args) {
        String s;
        int p;
        boolean symm;
        while (true)  {
            s = JOptionPane.showInputDialog("Give a text for analysing");
            if (s == null)
                break;
            p = s.length();
            symm = true;
            for (int i=0; i < (p/2) && symm ; i++)
                if (s.charAt(i) != s.charAt(p-i-1))
                    symm = false;
            if (symm)
                JOptionPane.showMessageDialog
                    (null, "This text was symmetric !");
            else
                JOptionPane.showMessageDialog
                    (null, "This text was not symmetric !");
        }
    }
    
}


