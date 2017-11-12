package items;

public class Schabowy implements Item {
    @Override
    public String name() {
        return "Schabowy";
    }

    @Override
    public Double price() {
        return 10.0;
    }
}
