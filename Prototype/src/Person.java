import java.util.HashMap;

public abstract class Person implements Cloneable {

    protected String name;
    protected String surname;
    protected HashMap<Double, Integer> recievedMoney;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public double getRecievedMoney() {
        double sum = 0.0;
        for (double denomination : recievedMoney.keySet()) {
            sum = sum + (denomination * recievedMoney.get(denomination));
        }
        return sum;
    }

    public void AmmountofDenomination() {
        for (double denomination : recievedMoney.keySet()) {
            System.out.println(recievedMoney.get(denomination) + " banknotów " + denomination + " złotowych.");
        }
        System.out.println();
    }

    public void setRecievedMoney(double denomination, int amont) {
        recievedMoney.put(denomination, amont);
    }

    public String toString() {
        return name + " " + surname + " uzbierał: " + getRecievedMoney() + " zł.";
    }

    public Person clone() {
        return null;
    }
}
