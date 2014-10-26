package sixth;

import java.util.*;

public class UsingReadData {
    
    public static void main(String[ ] a) {
        //  Using standard input and output only
        System.out.println("What's your name ?");
        String user = ReadData.aLine();
        System.out.println("What year were you born ?");
        int year = ReadData.anInt();     //   Possible exception(s)
        //  Trying class Calendar
        Calendar c = Calendar.getInstance();
        int now = c.get(Calendar.YEAR);
        System.out.println("You are probably " + (now - year) + " years old...");        
    }
    
}



