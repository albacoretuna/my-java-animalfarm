package sixth;

import java.io.*;
import javax.swing.*;

public class ObjectToFile {

    public static void main(String[] args)
                      throws Exception {
        City c;
        String cname;
        int cpopul;
        String fn = JOptionPane.showInputDialog("Enter the file name");
        fn += ".ser";
        File f = new File(fn);
        ObjectOutputStream out = new ObjectOutputStream
                    (new FileOutputStream(f));
        while (true) {
            cname = JOptionPane.showInputDialog("Enter the city name");
            if (cname == null)
                break;
            c = new City();
            c.setName(cname);
            cpopul = Integer.parseInt
                    (JOptionPane.showInputDialog("Enter the city population"));
            c.setPopulation(cpopul);
            out.writeObject(c);
            out.flush();
        }
        out.close();
        JOptionPane.showMessageDialog
                  (null, "Writing the objects to file completed !");
    }

}

