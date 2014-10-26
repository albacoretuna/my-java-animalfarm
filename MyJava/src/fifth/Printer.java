package fifth;

public abstract class Printer extends ITStuff {
    
    protected int speed;   //   Pages per minute

    public Printer() {
    }

    public Printer(int speed, String serialnumber, 
                           String manufacturer, String model, double price) {
        super(serialnumber, manufacturer, model, price);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    
}

