package chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.StringLists;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.*;
import static java.lang.System.out;

/** Find the longest words **/
public class EighthStrBuilderFunction extends StringLists implements IFunction {

    TreeSet<String> treeSet;
    TreeMap<String, Integer> treeMap;

    @Override
    public void calcFunction() {

        treeMap = new TreeMap<>();
        treeSet = new TreeSet<>();
        addString[1] = "Mr. redivider ate my metal worm, Do geese see God?,\n " +
                "Was it deified or metallics civic you saw?, Murder for radar of level rum.\n " +
                "Go rotor salami, I'm kayak hog.";

        setStringBuilder(new StringBuilder(addString[1]));
        setFirstList(initArrayStringList(getStringBuilder()));
        treeSet.addAll(Arrays.stream(getFirstList().toArray(String[]::new)).map(String::toString)
                .collect(Collectors.toCollection(TreeSet::new)));

        IntStream.range(0, treeSet.size())
                .forEach(index -> {
                    addString[2] = treeSet.pollFirst();
                    operation[0] = Math.max(operation[0], addString[2].length());
                    treeMap.put(addString[2], addString[2].length());
                });
    }

    private ArrayList<String> printLongestWords() {
        var arraylist = new ArrayList<String>();
        treeMap.forEach((key, value) -> {
            if (value == operation[0])
                arraylist.add(format(" %s ", key));
        });
        return arraylist;
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 8. String Builder Function\n";
            addString[3] = "The string:";
            addString[4] = "The longest words are:";
            return format("%n%s%s%n%s%n%s %d%n%s%n",
                    addString[0], addString[3], addString[1],
                    addString[4], (int) operation[0],
                    List.of(printLongestWords()));
        } finally {
            IFunction.super.setDefaults();
        }
    }
}