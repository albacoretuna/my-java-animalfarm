package second;

import javax.swing.*;

public class Comparing {
    
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt
              (JOptionPane.showInputDialog("Give the first number"));
        b = Integer.parseInt
              (JOptionPane.showInputDialog("Give the second number"));
        if (a > b)
            JOptionPane.showMessageDialog(null, "First was greater");
        else
            if (a < b)
                JOptionPane.showMessageDialog(null, "Second was greater");
            else
                JOptionPane.showMessageDialog(null, "Both are the same");
    }
    
}



