public class Color extends CarDecorator {

    public Color(Car car) {
        super(car);
        value = car.getValue() + 500;
        discount = car.getDiscount() + 5;
    }

    @Override
    public String assemble() {
        return car.assemble() + " + Czerwony lakier";
    }
}
