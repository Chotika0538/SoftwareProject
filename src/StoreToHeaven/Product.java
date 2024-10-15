/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StoreToHeaven;

import java.util.ArrayList;


public class Product {
    private String name;
    private String pattern;
    private String detail;
    private double price;
    private String path;

    public Product(String name,String pattern,String detail,String path){
        this.name = name;
        this.pattern = pattern;
        this.detail = detail;
        this.path = path;
    }
    /*get & set methods of private variables*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public String toString(){
       return getName()+" : "+getPattern();
    }
}
