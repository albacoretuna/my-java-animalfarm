package sixth;

import java.io.*;
import javax.swing.*;

public class ObjectFromFile {

    public static void main(String[] args)
                      throws Exception {
        City c;
        String m;
        boolean end = false;
        String fn = JOptionPane.showInputDialog("Enter the file name");
        fn += ".ser";
        File f = new File(fn);
        ObjectInputStream in = new ObjectInputStream
                    (new FileInputStream(f));
        while (!end)  {
            try  {
                c = (City) in.readObject();
                m = "City info :\n" +
                         "* name - " + c.getName() + "\n" +
                        "* population about " + c.getPopulation();
                JOptionPane.showMessageDialog(null, m);
            }
            catch (EOFException e)  {
                JOptionPane.showMessageDialog(null, "That's all.");
                end = true;
            }
            catch (Exception e)  {
            }
        }
        in.close();
    }

}

