package fourth;

public class Stock {
    
    protected String product;   //  Product name
    protected int items;             //  Amount in stock

    public Stock() {
    }

    public Stock(String product, int items) {
        this.product = product;
        this.items = items;
    }

    public int getItems() {
        return items;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    
    //  Adding more items
    public void add(int items) {
        if(items > 0)
            this.items += items;
    }
    
    //  Taking items
    public int take(int items) {
        //  Return value shows how many items were taken off
        if(items <= 0)
            return 0;
        else
            if(items <= this.items) {
                this.items -= items;
                return items;
            } else {
                //  Asked more than in stock
                int temp = this.items;
                this.items = 0;
                return temp;
            }
    }

    @Override
    public String toString() {
        return "Stock: " + "product=" + product + ", items=" + items + '.';
    }
    
}



