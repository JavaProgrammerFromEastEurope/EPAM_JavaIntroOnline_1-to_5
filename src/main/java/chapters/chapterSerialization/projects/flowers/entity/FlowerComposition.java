package chapters.chapterSerialization.projects.flowers.entity;

import java.io.Serializable;
import java.util.Objects;

public class FlowerComposition implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private int price;
    private Box box;
    private Flower flower;

    public FlowerComposition(int price, Box box, Flower flower) {
        this.price = price;
        this.box = box;
        this.flower = flower;
    }

    public FlowerComposition(){}

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Box getBox() {
        return box;
    }

    public Flower getFlower() {
        return flower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerComposition flowerComposition = (FlowerComposition) o;
        return id == flowerComposition.id
                && price == flowerComposition.price
                && Objects.equals(box, flowerComposition.box)
                && Objects.equals(flower, flowerComposition.flower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, box, flower);
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "id=" + id +
                ", price=" + price +
                ", box=" + box +
                ", flower=" + flower +
                '}';
    }
}