import java.util.HashMap;

public class Marian extends Person {
    public Marian() {
        name = "Marian";
        surname = "Brzęczyszczykiewicz";
        recievedMoney = new HashMap<>();
        recievedMoney.put(20.0, 10);
        recievedMoney.put(10.0, 23);
        recievedMoney.put(500.0, 2);
    }

    @Override
    public Person clone() {
        return new Marian();
    }
}
