package StoreToHeaven;

import java.util.Objects;

public class Offering extends Product {

    private double price;

    public Offering(String name, String pattern, String detail, String path, double price) {
        super(name, pattern, detail, path);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
