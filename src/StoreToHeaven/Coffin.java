package StoreToHeaven;

//import StoreToHaven.Product;
import java.util.*;
public class Coffin extends Product {
    private ArrayList<Coffin> cList;
    private String size;
    private double price;
    
    public Coffin(String name,String pattern,String size,String detail,String path, double price){
       super(name,pattern,detail,path);
       this.size=size;
       this.price=price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public ArrayList<Coffin> getwList() {
        return cList;
    }

    public void setwList(ArrayList<Coffin> cList) {
        this.cList = cList;
    }

    
    
}
