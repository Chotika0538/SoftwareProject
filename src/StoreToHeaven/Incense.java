package StoreToHeaven;
//import StoreToHaven.Product;
import java.util.*;
public class Incense extends Product {
    private ArrayList<Incense> iList;
    
    
    public Incense(String name,String pattern,String detail,String path, double price){
        super(name,pattern,detail,path);
        setPrice(price);
    }


    public ArrayList<Incense> getiList() {
        return iList;
    }

    public void setiList(ArrayList<Incense> iList) {
        this.iList = iList;
    }
 
    
}
