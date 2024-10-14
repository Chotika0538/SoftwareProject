package StoreToHeaven;
//import StoreToHaven.Product;
import java.util.*;
public class Incense extends Product {
    private ArrayList<Incense> iList;
    private double price;
    //private int size;
    
    public Incense(String name,String pattern,String detail,String path, double price){
        super(name,pattern,detail,path);
        this.price=price;
    }


    public ArrayList<Incense> getiList() {
        return iList;
    }

    public void setiList(ArrayList<Incense> iList) {
        this.iList = iList;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incense incense = (Incense) o;
        return Double.compare(incense.getPrice(), price) == 0 &&
               getPattern().equals(incense.getPattern()) &&
               getDetail().equals(incense.getDetail()) &&
               getPath().equals(incense.getPath());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPattern(), getDetail(), getPath(), price);
    }
    
    
}
