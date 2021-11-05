package chapters.chapterFunctions.functions.impl.stringProcessing.strings;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.StringLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.String.*;
import static java.lang.System.out;

/** Camel case and Snake case **/
public class FirstStrFunction extends StringLists implements IFunction {

    @Override
    public void calcFunction() {
        setFirstList(Arrays.stream(new String[]{"firstString", "secondString", "thirdString", "fourthString"})
                .collect(Collectors.toCollection(ArrayList::new)));
        setExtraList(new ArrayList<>(getFirstList()));

        for (int i = 0; i < getExtraList().size(); i++) {
            addString[0] = valueOf(getExtraList().get(i));
            operation[0] = addString[0].length();
            for (int j = 0; j < operation[0]; j++) {
                if (Character.isUpperCase(addString[0].toCharArray()[j])) {
                    addString[1] = addString[0].substring(0, j);
                    addString[2] = addString[0].substring(j + 1, (int) operation[0]);
                    addString[3] = valueOf(Character.toLowerCase(addString[0].toCharArray()[j]));
                    getExtraList().set(i, format("%s_%s%s", addString[1], addString[3], addString[2]));
                }
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 1. String Function\n";
            addString[1] = " The camel case strings List:";
            addString[2] = " The snake case strings List:";
            return format("%n%s%s%n%s%n%s%n%s%n",
                    addString[0], addString[1], getFirstList(), addString[2], getExtraList());
        } finally {
            IFunction.super.setDefaults();
        }
    }
}