package second;

import javax.swing.*;

public class JustAsking {
    
    public static void main(String[ ] args) {
        //  Using ConfirmationDialog (yes/no/cancel)
        int answer;
        String message;
        do {
            answer = JOptionPane.showConfirmDialog(null, "Do you like Java ?");
            switch(answer) {
                case 0: message = "That's great!"; break;
                case 1: message = "So sad..."; break;
                default: message = "Sorry, can't understand.";    
            }
            JOptionPane.showMessageDialog(null, message);            
        } while(answer != 0);        
    }
    
}

