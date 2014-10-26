package second;

import javax.swing.*;
import java.text.*;

public class CelFahr {
   
    public static void main(String[] args) {
        double min, max, cel, fahr;
        DecimalFormat f = new DecimalFormat("0.00");
        min = Double.parseDouble
                               (JOptionPane.showInputDialog("Enter min Celsius value"));
        max = Double.parseDouble
                               (JOptionPane.showInputDialog("Enter max Celsius value"));
        String message = "Celsius-Fahrenheit table:\n";
        cel = min;
        while(cel <= max) {
            fahr = 9.0 / 5 * cel + 32;
            message += "\n" + f.format(cel) + "     " + f.format(fahr);
            cel += 1;
         }
        JOptionPane.showMessageDialog(null, message);
    }
    
}

