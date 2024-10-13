package StoreToHeaven;

import java.util.ArrayList;
import java.util.Arrays;

    public class Frame extends Product {
    private ArrayList<Frame> fList;
   // private ArrayList<Double> priceAll;
    
    public Frame(String name,String pattern,String detail,String path, double  price) {
        super(name,pattern,detail,path);
        setPrice(price);
  //      priceAll = new ArrayList<>();
        
//        for (Double p : price) {
//            if (p != null) {
//                priceAll.add(p);
//            }
//        }
    }
    
      /*get & set methods of private variables*/

//    public ArrayList<Double> getPriceAll() {
//        return priceAll;
//    }
//
//    public void setPriceAll(ArrayList<Double> priceAll) {
//        this.priceAll = priceAll;
//    }

    public ArrayList<Frame> getwList() {
        return fList;
    }

    public void setfList(ArrayList<Frame> fList) {
        this.fList = fList;
    }
    

}
