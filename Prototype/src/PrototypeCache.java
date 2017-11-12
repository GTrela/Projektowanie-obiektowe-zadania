import java.util.Hashtable;

public class PrototypeCache {
    private static Hashtable<String, Person> personMap = new Hashtable<>();

    public static Person getPerson(String nameAndSurname) {
        try {
            Person cachePerson = personMap.get(nameAndSurname);
            return cachePerson.clone();
        } catch (NullPointerException ex) {
            return null;
        }
    }

    public static void loadCache() {
        Janusz janusz = new Janusz();
        personMap.put(janusz.name + janusz.surname, janusz);
        Marian marian = new Marian();
        personMap.put(marian.name + marian.surname, marian);
        Grazyna grazyna = new Grazyna();
        personMap.put(grazyna.name + grazyna.surname, grazyna);
    }
}
