package sixth;

import java.io.*;

public class ReadData {

    private static BufferedReader stdin = new BufferedReader
                    (new InputStreamReader(System.in));

    /*  ReadData.aLine() - a method for reading a text line from keyboard  */
    public static String aLine() {
        String v = null;
        boolean ok;
        do {
            try  {
                v = stdin.readLine();
                ok = true;
            } catch (Exception e) {
                System.out.println("Error in reading line !");
                ok = false;
            }
        } while (!ok);
        return v;
    }

    /*  ReadData.anInt() - a method for reading an integer from keyboard  */
    public static int anInt() {
        int v = -1;
        boolean ok;
        do {
            try  {
                v = Integer.parseInt(stdin.readLine());
                ok = true;
            } catch (Exception e) {
                System.out.println("Not a correct integer !");
                ok = false;
            }
        } while (!ok);
        return v;
    }

    /*  ReadData.aReal() - a method for reading a real value from keyboard  */
    public static double aReal() {
        double v = -1;
        boolean ok;
        do {
            try  {
                v = Double.parseDouble(stdin.readLine());
                ok = true;
            } catch (Exception e) {
                System.out.println("Not a correct real number !");
                ok = false;
            }
        } while (!ok);
        return v;
    }
    
}


