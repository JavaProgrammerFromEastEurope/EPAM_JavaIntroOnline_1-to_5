package chapters.chapterSerialization.projects.flowers.entity;

import java.io.Serializable;
import java.util.Objects;

public class Box implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int price;

    public Box(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return price == box.price
                && Objects.equals(name, box.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", cost=" + price +
                '}';
    }
}