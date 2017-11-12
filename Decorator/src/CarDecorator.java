public class CarDecorator extends Car {
    protected Car car;
    protected double value;

    @Override
    public int getDiscount() {
        return super.getDiscount();
    }

    @Override
    public double getValue() {
        return value;
    }


    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String assemble() {
        return super.assemble();
    }
}
