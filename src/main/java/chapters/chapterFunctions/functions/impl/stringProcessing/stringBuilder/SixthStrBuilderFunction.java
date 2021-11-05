package chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.StringLists;

import static java.lang.String.*;
import static java.lang.System.out;

/** Double every string character **/
public class SixthStrBuilderFunction extends StringLists implements IFunction {

    @Override
    public void calcFunction() {
        addString[1] = "Sample text string";
        setStringBuilder(new StringBuilder(addString[1]));
        for (int i = 0; i < addString[1].length(); i++) {
            getStringBuilder().insert(i + i, addString[1].charAt(i));
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 6. String Builder Function\n";
            addString[2] = "The string:";
            addString[3] = "The result string:";
            return format("%n%s%s%n%s%n%s%n%s%n",
                    addString[0], addString[2],
                    addString[1], addString[3], getStringBuilder());
        } finally {
            IFunction.super.setDefaults();
        }
    }
}