package fifth;

public class MyStuff {
    
    public static void main(String[ ] a) {
        //  Using an array of objects
        ITStuff [ ] my = new ITStuff[10];
        my[0] = new Mouse(2, false, "1000", "HP", "Basic Mouse", 9.95);
        my[1] = new Monitor(17, 1200, 800, "2000", "HP", "Compaq", 75);
        my[2] = new Monitor(21, 1200, 800, "3000", "Dell", "ExtraFine", 170);
        my[3] = new LaserPrinter(25, 1500, "4000", "HP", "LaserJet", 144);
        my[4] = new Mouse(1, true, "5000", "Nokia", "Hiiri", 14.90);
        //  Reporting
        for(int i = 0; i < 5; i++)
            my[i].report();   //   That's dynaminc binding of overridden methods
    }
    
}


