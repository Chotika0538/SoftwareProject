package StoreToHeaven;

import java.util.ArrayList;
import java.util.Arrays;

public class SandalWood extends Product{
private ArrayList<SandalWood> sdList;


    public SandalWood(String name, String pattern, String detail, String path, double price) {
        super(name,pattern,detail,path);
        setPrice(price);
    }
    
    
      /*get & set methods of private variables*/

    public ArrayList<SandalWood> getwList() {
        return sdList;
    }

    public void setwList(ArrayList<SandalWood> wList) {
        this.sdList = wList;
    }
}
