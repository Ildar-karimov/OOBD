package OOBD.lab1.hw;

import java.util.List;

public class Client extends Person {

    public Client(String firstName, String lastName, String phoneNumber, String email) {
        super(firstName, lastName, phoneNumber, email);
    }

    public Client(){}

    private List<Item> items;

    @Override
    public String toString() {
        return "Avito.Client: " + getLastName() +
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
