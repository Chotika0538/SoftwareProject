package StoreToHeaven;

public class Souvenir extends Product {
    public Souvenir(String name, String pattern, String detail, String path, String price){
        super(name, pattern, detail, path);
        setPrice(Double.parseDouble(price));
    }
    
}
