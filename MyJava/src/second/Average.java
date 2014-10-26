package second;

import javax.swing.*;

public class Average {
    
    public static void main(String[] args) {
        int count = 0;
        double a, aver, sum = 0;
        String s;
        while (true) {
            s = JOptionPane.showInputDialog("Give a real number");
            if(s == null)
                break;
            a = Double.parseDouble(s);
            sum += a;
            count++;
        }
        if (count != 0)  {
            aver = sum / count;
            JOptionPane.showMessageDialog
                    (null, "Average value of " + count + " numbers is " + aver);
        }
    }
    
}


