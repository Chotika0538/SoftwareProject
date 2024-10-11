/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StoreToHeaven;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class SandalWood extends Product{
    private ArrayList<SandalWood> sdList;
    private ArrayList<String> colorAll;
    private ArrayList<String> materialAll;
    private ArrayList<Double> priceAll;
    private String color;
    private String material;

    public SandalWood(String name,String pattern,String detail,String path,String material,String color,String price) {
        super(name,pattern,detail,path);
        //materialAll = new ArrayList<>();
        materialAll.add(Arrays.toString(material.split(",")));
        colorAll.add(Arrays.toString(color.split(",")));
        priceAll.add(Double.parseDouble((Arrays.toString(price.split(",")))));
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

    public ArrayList<SandalWood> getwList() {
        return sdList;
    }

    public void setwList(ArrayList<SandalWood> wList) {
        this.sdList = wList;
    }
}
