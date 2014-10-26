package fifth;

import java.awt.Dimension;

public class Monitor extends ITStuff {
    
    private int size;
    private Dimension resolution;

    public Monitor() {
    }

    public Monitor(int size, int x, int y, String serialnumber, String manufacturer, String model, double price) {
        super(serialnumber, manufacturer, model, price);
        this.size = size;
        this.resolution = new Dimension(x, y);
    }

    public int[ ] getResolution() {
        int[ ] a = new int[2];
        a[0] = resolution.width;
        a[1] = resolution.height;
        return a;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void report() {
        String message = "Just a monitor: " + manufacturer + ": " + model 
                                     + " with size of " + size + " inches.";
        System.out.println(message);
    }
    
    
    
}



