package fifth;

public class LaserPrinter extends Printer {
    
    private int quality;    //  Dots per inch

    public LaserPrinter() {
    }

    public LaserPrinter(int quality, int speed, 
               String serialnumber, String manufacturer, String model, double price) {
        super(speed, serialnumber, manufacturer, model, price);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void report() {
        String message = "Just a laser printer: " + manufacturer + ": " + model 
                                     + " with speed " + speed + " p/min. and quality " + quality + " dpi.";
        System.out.println(message);
    }
    
}


