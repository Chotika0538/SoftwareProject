package StoreToHeaven;
import java.util.*;

public class SnackBox extends Product {
    
    public SnackBox(String name, String pattern, String detail, String path, String price){
        super(name, pattern, detail, path);
        setPrice(Double.parseDouble(price));
    }
    
}
