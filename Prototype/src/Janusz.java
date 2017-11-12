import java.util.HashMap;

public class Janusz extends Person {
    public Janusz() {
        name = "Janusz";
        surname = "Kowalski";
        recievedMoney = new HashMap<>();
        recievedMoney.put(10.0, 100);
        recievedMoney.put(50.0, 23);
        recievedMoney.put(100.0, 2);
    }

    @Override
    public Person clone() {
        return new Janusz();
    }
}
