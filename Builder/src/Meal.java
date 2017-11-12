import items.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private String name = "";
    private Double price = 0.0;
    private List<Item> items = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        String description = "";
        for (Item item:items) {
            description += item.name() + " , ";
        }
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public void addItem(Item item){
        items.add(item);
        price += item.price();
    }
}