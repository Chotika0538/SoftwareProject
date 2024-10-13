package StoreToHeaven;
//import StoreToHaven.*;
import java.util.*;

public class Candle extends Product{
    private ArrayList<Candle> cnList;
    private double price;
  
    public Candle(String name,String pattern,String detail,String path, double price){
       super(name,pattern,detail,path);
       this.price=price;
    }

    public ArrayList<Candle> getwList() {
        return cnList;
    }

    public void setwList(ArrayList<Candle> cnList) {
        this.cnList = cnList;
    }

    public Object getPriceAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
