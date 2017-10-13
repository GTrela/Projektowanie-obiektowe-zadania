public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.setData("Janusz", "Kowalski", 123);
        Singleton other = Singleton.getInstance();
        System.out.println(other.getName() + " " + other.getSurname() + " lot: " + other.getLotNumber());
    }
}
