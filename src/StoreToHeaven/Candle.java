package StoreToHeaven;
//import StoreToHaven.*;
import java.util.*;

public class Candle extends Product{
    private ArrayList<Candle> cnList;
    private ArrayList<Double> priceAll;
    private int size;

    public Candle(String name,String pattern,int size, String detail,String path, String price){
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
        public ArrayList<Candle> getwList() {
        return cnList;
    }

    public void setwList(ArrayList<Candle> wList) {
        this.cnList = cnList;
    }
}
