import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        PrototypeCache.loadCache();

        Person osoba1 = PrototypeCache.getPerson("JanuszKowalski");
        Person osoba2 = PrototypeCache.getPerson("MarianBrzęczyszczykiewicz");
        Person osoba3 = PrototypeCache.getPerson("GrażynaCzubówna");

        Hashtable<String, Person> personMap = new Hashtable<>();
        personMap.put(osoba1.name + osoba1.surname, osoba1);
        personMap.put(osoba2.name + osoba2.surname, osoba2);
        personMap.put(osoba3.name + osoba3.surname, osoba3);

        double suma = 0.0;
        for (Person osoba : personMap.values()) {
            suma += osoba.getRecievedMoney();
            System.out.println(osoba.toString() + "w tym:");
            osoba.AmmountofDenomination();
        }

        System.out.println("Razem uzbierali: " + suma + " zł.");
    }
}
