package fourth;

public class ValueStock extends Stock {
    
    protected double itemprice;

    public ValueStock() {
    }

    public ValueStock(double itemprice, String product, int items) {
        super(product, items);
        this.itemprice = itemprice;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }
    
    public double getFullStockValue() {
        return itemprice * items;
    }

    @Override
    public String toString() {
        return super.toString() + "ValueStock: " + "itemprice=" + itemprice + '.';
    }
    
}


