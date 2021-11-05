package chapters.chapterSerialization.projects.flowers.dao.xml;

import chapters.chapterSerialization.projects.flowers.dao.IItem;
import chapters.chapterSerialization.projects.flowers.entity.FlowerComposition;
import chapters.chapterSerialization.projects.flowers.xmlWrapper.FlowerWrapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.String.format;

public class XmlItem implements IItem {

    private static final String PATH = "flowers/flowers.xml";

    private final ClassLoader classLoader = getClass().getClassLoader();

    @Override
    public List<FlowerComposition> get() {
        try {
            JAXBContext context = JAXBContext.newInstance(FlowerWrapper.class, FlowerComposition.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            var file = new File(Objects.requireNonNull(
                    getClass().getResource(format("/%s", PATH))).getFile());
            FlowerWrapper flowerWrapper = (FlowerWrapper) unmarshaller.unmarshal(file);
            var items = flowerWrapper.getItems();
            return items == null ? new ArrayList<>() : items;
        } catch (JAXBException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void save(List<FlowerComposition> flowerCompositions) {
        FlowerWrapper flowerWrapper = new FlowerWrapper(flowerCompositions);
        try {
            JAXBContext context = JAXBContext.newInstance(FlowerWrapper.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            var file = new File(Objects.requireNonNull(
                    classLoader.getResource(PATH)).getFile());
            marshaller.marshal(flowerWrapper, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}