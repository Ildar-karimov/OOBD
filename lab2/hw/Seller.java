package OOBD.lab2.hw;

import java.util.List;

public class Seller extends Person {

    public Seller(String firstName, String lastName, String phoneNumber, String email) {
        super(firstName, lastName, phoneNumber, email);
    }

    public Seller(){}

    private List<Item> items;

    @Override
    public String toString() {
        return "Avito.Seller: " + getLastName() +
                ", items=" +items +
                '\n';
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


}
