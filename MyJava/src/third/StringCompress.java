package third;

import javax.swing.*;

public class StringCompress {
    
    public static void main(String[] args) {
        StringBuffer b;
        String s;
        int j = 0;
        s = JOptionPane.showInputDialog("Give a free text");
        b = new StringBuffer(s);
        //  Removing repeating chars (e.g. xxx -> x)
        for (int i=1; i < b.length(); i++)
            if (b.charAt(i) != b.charAt(j))
                b.setCharAt(++j, b.charAt(i));
        b.setLength(++j);
        JOptionPane.showMessageDialog
                 (null, "Compressed text is following:\n" + b);
    }
    
}



