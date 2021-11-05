package chapters.chapterClasses.entitys.oop.payment;

import java.util.Objects;

public class Purchase {

    private String name;
    private int cost;
    private final int quantity;

    public Purchase(String nameOfPurchase, int cost, int quantity) {
        this.name = nameOfPurchase;
        this.cost = cost;
        this.quantity = quantity;
        this.cost *= quantity;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return cost == purchase.cost
                && quantity == purchase.quantity
                && Objects.equals(name, purchase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, quantity);
    }

    @Override
    public String toString() {
        return String.format("Purchase{name='%s', cost=%d, quantity=%d}",
                name, cost, quantity);
    }
}