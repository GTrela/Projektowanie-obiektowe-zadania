import java.util.List;

public abstract class Car {
    protected double value = 2500;
    protected int discount = 0;

    public int getDiscount() {
        return discount;
    }

    public double getValue() {
        return value;
    }

    public String assemble() {
        return "Podstawowe auto";
    }
}
