package StoreToHeaven;

//import StoreToHaven.Product;
import java.util.*;
public class Coffin extends Product {
    private ArrayList<Coffin> cList;
    private ArrayList<Double> priceAll;
    private int size;
    
    public Coffin(String name,String pattern,int size,String detail,String path, String price){
        super(name,pattern,detail,path);
        setSize(size);
        priceAll.add(Double.parseDouble((Arrays.toString(price.split(",")))));
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public ArrayList<Coffin> getwList() {
        return cList;
    }

    public void setwList(ArrayList<Coffin> cList) {
        this.cList = cList;
    }

    
    
}
