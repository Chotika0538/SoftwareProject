package StoreToHeaven;

public class Offering extends Product {
    public Offering(String name, String pattern, String detail, String path,double price){
        super(name, pattern, detail, path);
        setPrice(price);
    }
}
