package StoreToHeaven;
//import StoreToHaven.*;
import java.util.*;

public class Candle extends Product{
    private ArrayList<Candle> cnList;
    
  
    public Candle(String name,String pattern,String detail,String path, double price){
       super(name,pattern,detail,path);
        setPrice(price);
    }

    public ArrayList<Candle> getwList() {
        return cnList;
    }

    public void setwList(ArrayList<Candle> cnList) {
        this.cnList = cnList;
    }

  
}
