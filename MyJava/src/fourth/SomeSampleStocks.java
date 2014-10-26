package fourth;

public class SomeSampleStocks {
    
    public static void main(String[ ] a) {
        Stock laptops, smartphones;
        ValueStock cars;
        laptops = new Stock("HP", 5);
        smartphones = new Stock("Samsung Galaxy", 25);
        cars = new ValueStock(40000, "Audi A5", 1);
        laptops.add(3);
        smartphones.take(15);
        cars.add(3);
        laptops.take(100);
        System.out.println(laptops);
        System.out.println(smartphones);
        System.out.println(cars);
    }
    
}


