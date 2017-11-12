package items;

public class Kurczak implements Item {
    @Override
    public String name() {
        return "Kurczak";
    }

    @Override
    public Double price() {
        return 14.0;
    }
}
