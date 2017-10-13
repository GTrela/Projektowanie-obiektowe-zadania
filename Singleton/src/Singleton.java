public class Singleton {

    private static Singleton self;
    private String name;
    private String surname;
    private int lotNumber;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(self == null) {
            self = new Singleton();
        }
        return self;
    }

    public void setData(String name, String surname, int lotNumber) {
        this.name = name;
        this.surname = surname;
        this.lotNumber = lotNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }
}
