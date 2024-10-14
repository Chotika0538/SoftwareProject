package StoreToHeaven;

import java.util.ArrayList;

public class Coffin extends Product {
    private ArrayList<Coffin> cList; // รายการโลงทั้งหมด
    private ArrayList<Double> priceAll; // เก็บราคาทั้งหมดแต่ละขนาด (20, 22, 24 นิ้ว)
    private double size20, size22, size24; // ขนาดโลง
    private double price; // ราคาโลง (สามารถใช้ถ้าอยากมีราคาเดียวสำหรับสินค้าทั้งหมด)
    
    // คอนสตรัคเตอร์ รับข้อมูลพื้นฐานสำหรับโลง
    public Coffin(String name, String pattern, String detail, double size20, double size22, double size24, String path) {
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

    //Getter สำหรับขนาดโลงแต่ละขนาด

    public double getSize20() {
        return size20;
    }

    public void setSize20(double size20) {
        this.size20 = size20;
    }

    public double getSize22() {
        return size22;
    }

    public void setSize22(double size22) {
        this.size22 = size22;
    }

    public double getSize24() {
        return size24;
    }

    public void setSize24(double size24) {
        this.size24 = size24;
    }

    public void setcList(ArrayList<Coffin> cList) {
        if (cList != null) // ตรวจค่า null สำหรับตรวจสอบการส่งพารามิเตอร์ 
            this.cList = cList;
    }

    public ArrayList<Coffin> getcList() {
        return cList;
    }

    public void setPriceAll(ArrayList<Double> priceAll) {
        this.priceAll = priceAll;
    }

    public ArrayList<Double> getPriceAll() {
        return priceAll;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
