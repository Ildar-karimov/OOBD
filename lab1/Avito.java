package OOBD.lab1.hw;

import java.util.List;

public class Avito {


    private List<Client> clients;
    private List<Seller> sellers;
    private List<Item> items;

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Avito: " +
                ", clients=" + clients + '\n' +
                ", sellers=" + sellers + '\n' +
                ", items=" + items;
    }
}
