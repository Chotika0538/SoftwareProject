package StoreToHeaven;

import java.util.*;
public class Candle extends Product{
    private ArrayList<Candle> cnList;
    private ArrayList<Integer> sizeAll;
    

    public Candle(String name,String pattern, String detail,String path, String price){
        super(name,pattern,detail,path);
        setPrice(Double.parseDouble(price));
    }
    
    public ArrayList<Candle> getcandleList() {
        return cnList;
    }

    public void setcandleListt(ArrayList<Candle> wList) {
        this.cnList = cnList;
    }
}
