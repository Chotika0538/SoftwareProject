package StoreToHeaven;

import java.util.*;

public class Package extends Product { // เปลี่ยนชื่อคลาส
    private ArrayList<Package> pList;
    private ArrayList<Double> priceAll;
    private int size;

    public Package(String name, String pattern, String detail, String path, String price) {
        super(name, pattern, detail, path);
        priceAll = new ArrayList<>(); // เริ่มต้น ArrayList
        String[] priceStrings = price.split(","); // แยกสตริงที่ใช้เครื่องหมายจุลภาค
        for (String priceStr : priceStrings) {
            priceAll.add(Double.parseDouble(priceStr.trim())); // แปลงเป็น double และเพิ่มใน priceAll
        }
    }

    public Package(String name, String pattern, String detail, String path, double price) {
        super(name, pattern, detail, path);
        priceAll = new ArrayList<>(); // เริ่มต้น ArrayList
        priceAll.add(price); // เพิ่มราคาเดี่ยว
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Package> getpList() { // เปลี่ยนชื่อเป็น getpList
        return pList;
    }

    public void setpList(ArrayList<Package> pList) { // เปลี่ยนชื่อเป็น setpList
        this.pList = pList;
    }
}
