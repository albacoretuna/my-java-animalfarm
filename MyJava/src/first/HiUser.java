package first;

import javax.swing.*;

public class HiUser {
    
    public static void main(String[ ] a) {
        String user = JOptionPane.showInputDialog("Give me your name:");
        JOptionPane.showMessageDialog(null, user);
    }
    
}

