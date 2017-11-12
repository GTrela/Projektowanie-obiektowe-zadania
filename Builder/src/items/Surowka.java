package items;

public class Surowka implements Item {
    @Override
    public String name() {
        return "Surowka";
    }

    @Override
    public Double price() {
        return 5.5;
    }
}
