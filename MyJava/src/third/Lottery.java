package third;

import javax.swing.*;
import java.util.*;

public class Lottery {

    public static void main(String[ ] args) {
        int t[ ] = new int[7];
        int no;
        int i, j;
        i = 0;
        while(i < 7) {
            no = (int) (Math.random() * 38) + 1;
            for(j = 0; j < i; j++)
                if(no == t[j])
                    break;
                if (j >= i)
                    t[i++] = no;
        }
        Arrays.sort(t);
        String message = "Lottery numbers are :\n";
        for(int k = 0; k < 7; k++)
            message += t[k] + "   ";
        JOptionPane.showMessageDialog(null, message);
    }
    
}





