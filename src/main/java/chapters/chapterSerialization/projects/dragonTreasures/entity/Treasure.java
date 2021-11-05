package chapters.chapterSerialization.projects.dragonTreasures.entity;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private int price;
    private String type;
    private String name;

    public Treasure(int price, String type, String name) {
        this.price = price;
        this.type = type;
        this.name = name;
    }

    public Treasure(){}

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return id == treasure.id
                && price == treasure.price
                && Objects.equals(type, treasure.type)
                && Objects.equals(name, treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, type, name);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}