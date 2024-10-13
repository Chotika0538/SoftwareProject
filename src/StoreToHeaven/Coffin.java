package StoreToHeaven;

import java.util.ArrayList;

public class Coffin extends Product {
    private ArrayList<Coffin> cList; // รายการโลงทั้งหมด
    private ArrayList<Double> priceAll; // เก็บราคาทั้งหมดแต่ละขนาด (20, 22, 24 นิ้ว)
    private int size20, size22, size24; // ขนาดโลง
    private double price; // ราคาโลง (สามารถใช้ถ้าอยากมีราคาเดียวสำหรับสินค้าทั้งหมด)
    
    // คอนสตรัคเตอร์ รับข้อมูลพื้นฐานสำหรับโลง
    public Coffin(String name, String pattern, String detail, int size20, int size22, int size24, String path) {
        super(name, pattern, detail, path); // เรียกใช้คอนสตรัคเตอร์จากคลาสแม่ (Product)
        
        // กำหนดขนาดโลงแต่ละขนาด
        this.size20 = size20;
        this.size22 = size22;
        this.size24 = size24;
        
        // สร้างลิสต์ราคาทั้งหมดสำหรับแต่ละขนาด (ใช้ในภายหลัง)
        priceAll = new ArrayList<>();
        priceAll.add((double) size20);
        priceAll.add((double) size22);
        priceAll.add((double) size24);
    }

    // Getter สำหรับขนาดโลงแต่ละขนาด
    public int getSize20price() {
        return size20;
    }

    public int getSize22price() {
        return size22;
    }

    public int getSize24price() {
        return size24;
    }

    // Setter สำหรับรายการโลงทั้งหมด
    public void setwList(ArrayList<Coffin> cList) {
        this.cList = cList;
    }

    // Getter สำหรับรายการโลงทั้งหมด
    public ArrayList<Coffin> getcList() {
        return cList;
    }

    // Setter สำหรับราคาทั้งหมด
    public void setPriceAll(ArrayList<Double> priceAll) {
        this.priceAll = priceAll;
    }

    // Getter สำหรับราคาทั้งหมด
    public ArrayList<Double> getPriceAll() {
        return priceAll;
    }

    // Setter สำหรับราคา (กรณีต้องการกำหนดราคาที่ต่างจากขนาดโลง)
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter สำหรับราคา
    public double getPrice() {
        return price;
    }
}
