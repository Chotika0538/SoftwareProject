package StoreToHeaven;

import java.util.ArrayList;
import java.util.Arrays;

    public class Frame extends Product {
    private ArrayList<Frame> fList;
    private ArrayList<String> materialAll;
    private ArrayList<Double> priceAll;
    private String material;

    public Frame(String name,String pattern,String detail,String path,String[] material,Double[] price) {
        super(name,pattern,detail,path);
        materialAll = new ArrayList<>();
        priceAll = new ArrayList<>();
        materialAll.addAll(Arrays.asList(material));
        
        for (Double p : price) {
            if (p != null) {
                priceAll.add(p);
            }
        }
    }
    
    
      /*get & set methods of private variables*/

    public ArrayList<String> getMaterialAll() {
        return materialAll;
    }

    public void setMaterialAll(ArrayList<String> materialAll) {
        this.materialAll = materialAll;
    }

    public ArrayList<Double> getPriceAll() {
        return priceAll;
    }

    public void setPriceAll(ArrayList<Double> priceAll) {
        this.priceAll = priceAll;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArrayList<Frame> getwList() {
        return fList;
    }

    public void setfList(ArrayList<Frame> fList) {
        this.fList = fList;
    }
    
    public String toString(){
        return getName()+" : "+getPattern();
    }
}
