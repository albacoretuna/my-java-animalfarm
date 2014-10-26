package second;

import javax.swing.*;

public class Randoms {
    
    public static void main(String[ ] args) {
        int n;   //   Count of random numbers
        long r;    //    Current random number
        String message = "See generated values:\n";
        n = Integer.parseInt(JOptionPane.showInputDialog("How many randoms:"));
        for(int i = 0; i < n; i++) {
            r = Math.round(Math.random() * 100);  //  Getting a value in range 0..100
            message += r + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
    
}



