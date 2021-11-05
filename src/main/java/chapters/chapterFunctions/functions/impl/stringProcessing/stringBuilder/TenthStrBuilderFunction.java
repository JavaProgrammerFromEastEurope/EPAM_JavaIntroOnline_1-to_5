package chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.StringLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.lang.String.*;
import static java.lang.System.out;
/** Dividing string by exclamation marks **/
public class TenthStrBuilderFunction extends StringLists implements IFunction {

    @Override
    public void calcFunction() {
        addString[1] = "So perhaps, you've generated some fancy text, and you're content that you can now\n" +
                " copy and paste your fancy text in the comments section of funny cat videos. But perhaps\n" +
                " you're wondering how it's even possible to change the font of your text?";

        Pattern pattern = Pattern.compile("[.!?]");
        setFirstList(Arrays.stream(pattern.split(addString[1]))
                .map(String::toString).collect(Collectors.toCollection(ArrayList::new)));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 10. String Builder Function\n";
            addString[2] = "The string:";
            addString[3] = "The number of sentences:";
            return format("%n%s%s%n%s%n%s%n%d%n",
                    addString[0], addString[2], getFirstList(),
                    addString[3], getFirstList().size());
        } finally {
            IFunction.super.setDefaults();
        }
    }
}
