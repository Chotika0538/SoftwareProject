package StoreToHeaven;
import StoreToHeaven.Product;
import java.util.*;
public class Incense extends Product {
    private ArrayList<Incense> iList;
    private ArrayList<Double> priceAll;
    private int size;
    
    public Incense(String name,String pattern,int size,String detail,String path, String price){
        super(name,pattern,detail,path);
        priceAll.add(Double.parseDouble((Arrays.toString(price.split(",")))));
        this.size =size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
        public ArrayList<Incense> getwList() {
        return iList;
    }

    public void setwList(ArrayList<Incense> iList) {
        this.iList = iList;
    }

    
    
}
