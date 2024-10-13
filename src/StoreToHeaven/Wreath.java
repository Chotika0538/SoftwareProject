package StoreToHeaven;

import java.util.*;

public class Wreath extends Product {
    private ArrayList<Wreath> wList;
    private ArrayList<String> colorAll;
    private ArrayList<String> materialAll;
    private ArrayList<Double> priceAll;
    private String color;
    private String material;

    public Wreath(String name,String pattern,String detail,String path,String[] material,String[] color,Double[] price) {
        super(name,pattern,detail,path);
        materialAll = new ArrayList<>();
        colorAll = new ArrayList<>();
        priceAll = new ArrayList<>();
        //materialAll.add(Arrays.toString(material));
        //colorAll.add(Arrays.toString(color));
        //priceAll.add(Double.parseDouble((Arrays.toString(price))));
         // เพิ่มแต่ละค่าในอาร์เรย์ material ลงใน materialAll
        materialAll.addAll(Arrays.asList(material));

        // เพิ่มแต่ละค่าในอาร์เรย์ color ลงใน colorAll
        colorAll.addAll(Arrays.asList(color));

        // เพิ่มแต่ละค่าในอาร์เรย์ price ลงใน priceAll โดยตรวจสอบว่าค่านั้นไม่เป็น null
        for (Double p : price) {
            if (p != null) {
                priceAll.add(p);
            }
        }
    }
    
    
      /*get & set methods of private variables*/

    public ArrayList<String> getColorAll() {
        return colorAll;
    }

    public void setColorAll(ArrayList<String> colorAll) {
        this.colorAll = colorAll;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArrayList<Wreath> getwList() {
        return wList;
    }

    public void setwList(ArrayList<Wreath> wList) {
        this.wList = wList;
    }
    
//    public String toString(){
//        return getName()+" : "+getPattern();
//    }


}
