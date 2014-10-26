package fifth;

public abstract class ITStuff implements Reportable {
    
    protected String serialnumber;
    protected String manufacturer;
    protected String model;
    protected double price;

    protected ITStuff() {
    }

    protected ITStuff(String serialnumber, String manufacturer, String model, double price) {
        this.serialnumber = serialnumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getSerialnumber() {
        return serialnumber;
    }
    
}


