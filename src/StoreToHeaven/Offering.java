package StoreToHeaven;

import java.awt.image.BufferedImage;
import java.util.Objects;

public class Offering extends Product {
//    public Offering(String name, String pattern, String detail, String path,double price){
//        super(name, pattern, detail, path);
//        setPrice(price);
//    }
//       @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Offering offering = (Offering) o;
//        return Double.compare(offering.getPrice(), price) == 0 &&
//               pattern.equals(offering.pattern) &&
//               detail.equals(offering.detail) &&
//               path.equals(offering.path);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(pattern, detail, path, price);
//    }
    private double price;
    private BufferedImage im = null;
    public Offering(String name, String pattern, String detail, String path, double price, BufferedImage tmp) {
        super(name, pattern, detail, path);
        this.price = price;
        im = tmp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BufferedImage getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offering offering = (Offering) o;
        return Double.compare(offering.getPrice(), price) == 0 &&
               getPattern().equals(offering.getPattern()) &&
               getDetail().equals(offering.getDetail()) &&
               getPath().equals(offering.getPath());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPattern(), getDetail(), getPath(), price);
    }
}
