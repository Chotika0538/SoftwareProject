/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StoreToHeaven;


public class Temple {
    private String name;
    private String adress;
    private String province;
    public Temple(String name, String adress, String province){
        this.name=name;
        this.adress=adress;
        this.province = province;
    }
    
    public String getTempleName(){
        return name; 
    }
    public String getTempleAddress(){
        return adress;
    }
    public String getTempleProvince(){
        return province;
    }
    
    
    public void setTempleName(String name){
        this.name = name;
    }
    public void setTempleAddress(String adress){
        this.adress = adress;
    }
    
    public void setTempleProvince(String prov){
        this.province = prov;
    }
    public String toString(){
       return getTempleName()+" ("+getTempleProvince()+")";
    }
}
