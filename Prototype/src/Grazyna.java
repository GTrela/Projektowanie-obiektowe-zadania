import java.util.HashMap;

public class Grazyna extends Person {
    public Grazyna() {
        name = "Grażyna";
        surname = "Czubówna";
        recievedMoney = new HashMap<>();
        recievedMoney.put(50.0, 20);
        recievedMoney.put(10.0, 43);
        recievedMoney.put(20.0, 32);
    }

    @Override
    public Person clone() {
        return new Grazyna();
    }
}
