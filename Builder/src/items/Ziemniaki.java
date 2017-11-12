package items;

public class Ziemniaki implements Item {
    @Override
    public String name() {
        return "Ziemniaki";
    }

    @Override
    public Double price() {
        return 3.0;
    }
}
