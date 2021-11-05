package chapters.chapterSerialization.projects.flowers.xmlWrapper;

import chapters.chapterSerialization.projects.flowers.entity.FlowerComposition;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "Flowers")
public class FlowerWrapper {

    private List<FlowerComposition> flowerCompositions;

    public FlowerWrapper(){}

    public FlowerWrapper(List<FlowerComposition> flowerCompositions) {
        this.flowerCompositions = flowerCompositions;
    }

    public void setItems(List<FlowerComposition> flowerCompositions) {
        this.flowerCompositions = flowerCompositions;
    }

    @XmlElement(name = "flower")
    public List<FlowerComposition> getItems() {
        return flowerCompositions;
    }
}