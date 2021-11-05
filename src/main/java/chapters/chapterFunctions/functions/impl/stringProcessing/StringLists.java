package chapters.chapterFunctions.functions.impl.stringProcessing;

import java.util.ArrayList;
import java.util.List;

public abstract class StringLists {

    private ArrayList<String> firstList;
    private ArrayList<String> extraList;
    private StringBuilder stringBuilder;

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public ArrayList<String> getFirstList() {
        return firstList;
    }

    public ArrayList<String> getExtraList() {
        return extraList;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setFirstList(ArrayList<String> firstList) {
        this.firstList = firstList;
    }

    public void setExtraList(ArrayList<String> extraList) {
        this.extraList = extraList;
    }

    public static ArrayList<String> initArrayStringList(StringBuilder stringBuilder) {
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            if (stringBuilder.indexOf(" ") != -1) {
                arrayList.add(stringBuilder.substring(0, stringBuilder.indexOf(" ")));
                stringBuilder.delete(0, stringBuilder.indexOf(" ") + 1);
                continue;
            } else {
                arrayList.add(stringBuilder.substring(0, stringBuilder.length() - 1));
                stringBuilder.delete(0, stringBuilder.length());
            }
            break;
        }
        return arrayList;
    }

    public static String makeTemplateString(List<String> array) {
        StringBuilder stringBuffer = new StringBuilder();
        array.forEach(o -> stringBuffer.append(String.format("[%2s]", o)));
        return stringBuffer.toString();
    }
}