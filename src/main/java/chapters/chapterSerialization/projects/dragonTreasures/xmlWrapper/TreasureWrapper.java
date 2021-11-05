package chapters.chapterSerialization.projects.dragonTreasures.xmlWrapper;

import chapters.chapterSerialization.projects.dragonTreasures.entity.Treasure;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "Items")
public class TreasureWrapper {

    private List<Treasure> treasures;

    public TreasureWrapper(){}

    public TreasureWrapper(List<Treasure> notes) {
        this.treasures = notes;
    }

    public void setItems(List<Treasure> notes) {
        this.treasures = notes;
    }

    @XmlElement(name = "treasure")
    public List<Treasure> getItems() {
        return treasures;
    }
}