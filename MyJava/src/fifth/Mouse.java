package fifth;

public class Mouse extends ITStuff {
    
    private int buttons;
    private boolean wireless;

    public Mouse() {
    }

    public Mouse(int buttons, boolean wireless, 
                           String serialnumber, String manufacturer, String model, double price) {
        super(serialnumber, manufacturer, model, price);
        this.buttons = buttons;
        this.wireless = wireless;
    }

    public int getButtons() {
        return buttons;
    }

    public boolean isWireless() {
        return wireless;
    }

    @Override
    public void report() {
        String message = "Just a mouse: " + manufacturer + ": " + model 
                                     + " with " + buttons + " buttons.";
        System.out.println(message);
    }
       
}


