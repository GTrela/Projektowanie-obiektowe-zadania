public class PowerWindows extends CarDecorator {
    public PowerWindows(Car car) {
        super(car);
        value = car.getValue() + 700;
        discount = car.getDiscount() + 5;
    }

    @Override
    public String assemble() {
        return car.assemble() + " + Elektryczne szyby";
    }
}
