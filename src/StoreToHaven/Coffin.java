package StoreToHeaven;
import java.util.*;
public class Coffin extends Product {
    private ArrayList<Coffin> cList;
    private ArrayList<Double> priceAll;
    private int size;
    
    public Coffin(String name,String pattern,String detail,String path, String price){
        super(name,pattern,detail,path);
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

    public void setwList(ArrayList<Coffin> wList) {
        this.cList = wList;
    }

    
    
}
