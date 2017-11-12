package items;

public class Frytki implements Item {
    @Override
    public String name() {
        return "Frytki";
    }

    @Override
    public Double price() {
        return 7.0;
    }
}
