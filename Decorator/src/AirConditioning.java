public class AirConditioning extends CarDecorator {

    public AirConditioning(Car car) {
        super(car);
        value = car.getValue() + 1000;
        discount = car.getDiscount() + 5;
    }

    @Override
    public String assemble() {
        return car.assemble() + " + Klimatyzacja";
    }


}
