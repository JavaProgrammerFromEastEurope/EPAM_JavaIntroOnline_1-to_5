package chapters.chapterSerialization.actions.impl;

import application.exceptions.daoObjects.NotFoundItemException;
import application.sortComparator.impl.apps.treasures.SortByNameItem;
import application.sortComparator.impl.apps.treasures.SortByPriceItem;
import application.utils.Input;
import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterSerialization.actions.IActionTemplate;
import chapters.chapterSerialization.projects.dragonTreasures.dao.serializable.SerializableItem;
import chapters.chapterSerialization.projects.dragonTreasures.dao.xml.XmlItem;
import chapters.chapterSerialization.projects.dragonTreasures.entity.Treasure;

import java.util.List;

import static java.lang.String.format;
import static java.lang.System.out;
import static receiver.Receiver.communicationBridge;

public class TreasureActions implements IActionTemplate {

    private static final SerializableItem serializableItems = new SerializableItem();
    private static final XmlItem xmlTreasure = new XmlItem();

    private static Treasure inputTreasureObject() {
        int price = Input.getInteger("Input cost:");
        String type = Input.getString("Input type:");
        String name = Input.getString("Input name:");
        return new Treasure(price, type, name);
    }

    @Override
    public void addObject() {
        try {
            serializableItems.add(inputTreasureObject());
            out.println("Adding treasure was successful!");
        } catch (Exception e) {
            communicationBridge.sendString(e.getMessage());
        }
    }

    @Override
    public void updateObject() {
        try {
            var id = (long) Input.getInteger("Input treasure id to update");
            var treasure = inputTreasureObject();
            treasure.setId(id);
            serializableItems.update(treasure);
            out.println("Updating flower was successful!");
        } catch (NotFoundItemException e) {
            communicationBridge.sendString(e.getMessage());
        }
    }

    @Override
    public void removeObject() {
        long id = Input.getInteger("Input treasure id to remove:");
        try {
            serializableItems.remove(id);
            out.println("Removing treasure was successful!");
        } catch (NotFoundItemException e) {
            communicationBridge.sendString(e.getMessage());
        }
    }

    @Override
    public void firstSort() {
        out.println(IFunction.warning);
        List<Treasure> treasures = serializableItems.get();
        treasures.sort(new SortByNameItem());
        communicationBridge.sendString(
                    printListItems(treasures));
    }

    @Override
    public void secondSort() {
        out.println(IFunction.warning);
        List<Treasure> treasures = serializableItems.get();
        treasures.sort(new SortByPriceItem());
        communicationBridge.sendString(
                    printListItems(treasures));
    }

    @Override
    public void showMostValObject() {
        List<Treasure> treasures = serializableItems.get();
        if (treasures.size() == 0) {
            out.println("List of treasures is empty!");
            return;
        }
        out.println(IFunction.warning);
        treasures.sort(new SortByPriceItem());
        communicationBridge.sendString(
                format(" The treasure with most val prise:%n %s %n%n",
                        treasures.get(0)));
    }

    @Override
    public void showPriseObject() {
        List<Treasure> treasures = serializableItems.get();
        if (treasures.size() == 0) {
            out.println("List of treasures is empty!");
            return;
        }
        out.println(IFunction.warning);
        int price = Input.getInteger("Input price for the treasure:");
        for (var treasure : treasures) {
            if (treasure.getPrice() == price) {
                communicationBridge.sendString(
                        format("%s%n", treasure));
                return;
            }
        }
        var string = "The treasure with price = ";
        out.printf(" %s %d, not found!%n%n", string, price);
    }

    private String printListItems(List<Treasure> treasures) {
        var resultList = new StringBuilder();
        if (treasures.size() == 0) {
            out.println("List of treasures is empty!");
            return "";
        }
        for (var treasure : treasures) {
            resultList.append(format("%s%n", treasure));
        }
        return resultList.toString();
    }

    @Override
    public void xmlExportObject() {
        xmlTreasure.save(serializableItems.get());
        out.println("Exporting treasures to xml file was successful!");
    }
}