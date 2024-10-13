package StoreToHeaven;

//import StoreToHaven.Product;
import java.util.*;
public class Coffin extends Product {
    private ArrayList<Coffin> cList;
    private ArrayList<Double> priceAll;
    private int size20, size22, size24;
    private double price;
    
    public Coffin(String name,String pattern,String detail,int size20,int size22,int size24,String path){
       super(name,pattern,detail,path);
    }
    public ArrayList<Coffin> getcList() {
        return cList;
    }
    public int getSize20price() {
        return size20;
    }

    public int getSize22price() {
        return size22;
    }

    public int getSize24price() {
        return size24;
    }

    public void setwList(ArrayList<Coffin> cList) {
        this.cList = cList;
    }
}
