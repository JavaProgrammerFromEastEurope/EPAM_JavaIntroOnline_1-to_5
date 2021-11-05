package chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.StringLists;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.*;
import static java.lang.System.out;

/** def cde abc **/
public class SeventhStrBuilderFunction extends StringLists implements IFunction {

    TreeSet<Character> treeSet;
    TreeMap<Character, Integer> treeMap;

    private void initVars() {
        addString[1] = "def cde abc";
        treeMap = new TreeMap<>();
        setStringBuilder(new StringBuilder());
        treeSet = addString[1].chars().mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(TreeSet::new));
        IntStream.range(0, treeSet.size())
                .forEach(index -> treeMap.put(treeSet.pollFirst(), 0));
    }

    private void incValueMap() {
        for (Character object : addString[1].toCharArray()) {
            treeMap.put(object, treeMap.get(object) + 1);
            if (treeMap.get(object) == 1 && !object.equals(' '))
                getStringBuilder().append(object);
        }
    }

    @Override
    public void calcFunction() {
        initVars();
        incValueMap();
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 7. String Builder Function\n";
            addString[2] = "The string:";
            addString[3] = "The result string:";
            return format("%n%s%s%n%s%n%s%n%s%n%n",
                    addString[0], addString[2],
                    addString[1], addString[3], getStringBuilder());
        } finally {
            IFunction.super.setDefaults();
        }
    }
}