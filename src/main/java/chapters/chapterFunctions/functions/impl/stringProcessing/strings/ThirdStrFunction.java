package chapters.chapterFunctions.functions.impl.stringProcessing.strings;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.*;
import static java.lang.System.out;
/** Counter of digits in the string **/
public class ThirdStrFunction implements IFunction {

    @Override
    public void calcFunction() {
        addString[1] = "Is 1 the 2 word 35 great? 255 How many words 7 you 23 can 53 pronounce?";
        for (int i = 0; i < addString[1].length(); i++) {
            if (Character.isDigit(addString[1].toCharArray()[i])) {
                operation[1]++;
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 3. String Function\n";
            addString[2] = " The natural string:";
            addString[3] = " Counter of digits - ";
            return format("%n%s%s%n%s%n%s%.0f%n",
                    addString[0], addString[2], addString[1], addString[3], operation[1]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}