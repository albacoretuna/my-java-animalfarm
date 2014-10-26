package third;

import javax.swing.*;

public class ArrayMinMax {
    
    public static void main(String[ ] args) {
        int n;   //  Array size
        int sum = 0;    //  Sum of array values
        n = Integer.parseInt(JOptionPane.showInputDialog
                  ("Give the size of array"));
        int [ ] a = new int[n];    //  Creation of array for integers with size n
        for(int i=0; i < n; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog
                        ("Give the " + (i+1) + ".number"));
            sum += a[i];
        }
        JOptionPane.showMessageDialog(null, "Sum is " + sum);
        int min = a[0];
        int max = a[0];
        for(int i=1; i < n; i++) {
            if(a[i] < min)
                min = a[i];
            else
                if(a[i] > max)
                    max = a[i];
        }
        String message = "1. Max is " + max + "\n2. Min is " + min;
        JOptionPane.showMessageDialog(null, message);
    }
    
}


