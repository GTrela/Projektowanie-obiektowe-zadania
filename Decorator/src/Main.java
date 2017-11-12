public class Main {
    public static void main(String[] args) {

        Car redCar = new Color(new BasicCar());
        Car airCar = new AirConditioning(new BasicCar());
        Car redAirCar = new AirConditioning(new Color(new BasicCar()));
        Car redAirPowerCar = new PowerWindows(new AirConditioning(new Color(new BasicCar())));

        System.out.println(redCar.assemble() +". Cena: " + redCar.getValue() +", Zniżka na nastepnę zamówienie: " + redCar.getDiscount()+"%");
        System.out.println(airCar.assemble()+". Cena: " + airCar.getValue() + ", Zniżka na nastepnę zamówienie: " + airCar.getDiscount() +"%");
        System.out.println(redAirCar.assemble() + ". Cena: " + redAirCar.getValue() +", Zniżka na nastepnę zamówienie: " + redAirCar.getDiscount()+"%");
        System.out.println(redAirPowerCar.assemble() + ". Cena: "+ redAirPowerCar.getValue()+", Zniżka na nastepnę zamówienie: " + redAirPowerCar.getDiscount()+"%");
    }
}
