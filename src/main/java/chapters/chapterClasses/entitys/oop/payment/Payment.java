package chapters.chapterClasses.entitys.oop.payment;

import java.util.ArrayList;
import java.util.Objects;

public class Payment {

    private final ArrayList<Purchase> purchases;

    public Payment(ArrayList<Purchase> purchases) {
        this.purchases = purchases;
    }

    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    public int getAllPaymentsCost() {
        int finalCost = 0;
        for (Purchase purchase : purchases) {
            finalCost += purchase.getCost();
        }
        return finalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(purchases, payment.purchases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchases);
    }

    @Override
    public String toString() {
        return String.format("Payment{purchases=%s}", purchases);
    }
}