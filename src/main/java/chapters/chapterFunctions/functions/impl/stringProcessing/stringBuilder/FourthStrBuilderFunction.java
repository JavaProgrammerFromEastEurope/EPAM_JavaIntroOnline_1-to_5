package chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.*;
import static java.lang.System.out;
/**The Cake is Fake **/
public class FourthStrBuilderFunction implements IFunction {

    @Override
    public void calcFunction() {
        addString[1] = "informatics";
        addString[2] = format("%s%s%s", addString[1].charAt(7),
                addString[1].substring(3, 5), addString[1].charAt(7));
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 4. String Builder Function\n";
            addString[3] = "The string:";
            addString[4] = "The result string:";
            return format("%n%s%s%n%s%n%s%n%s%n",
                    addString[0], addString[3],
                    addString[1], addString[4], addString[2]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}