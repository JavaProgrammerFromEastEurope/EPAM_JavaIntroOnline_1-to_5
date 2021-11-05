package chapters.chapterFunctions.functions.impl.stringProcessing.strings;

import chapters.chapterFunctions.functions.IFunction;

import static application.utils.CharArrays.makeMultipleChar;
import static application.utils.CharArrays.sumOfSequenceChar;
import static java.lang.String.*;
import static java.lang.System.out;
/** Count of Sequence Comma Character **/
public class FifthStrFunction implements IFunction {

    @Override
    public void calcFunction() {
        addString[2] = "Is,, the,, word,,,,, great? How many words, you,,, can, pronounce?,,,,";
        addString[3] = addString[1] = addString[2];
        for (int i = 0; i < addString[1].length(); i++) {
            if (addString[1].toCharArray()[i] == ',') {
                if (i == addString[1].toCharArray().length - 1) {
                    addString[1] = addString[1].substring(0, i);
                    break;
                }
                operation[0] = sumOfSequenceChar(addString[1].toCharArray(), i, ',');
                if (operation[0] > 1) {
                    addString[2] = makeMultipleChar((int) operation[0], ",");
                    addString[1] = addString[1].replaceAll(addString[2], ",");
                }
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 5. String Function\n";
            addString[4] = " The natural string:";
            addString[5] = " Modified string:";
            return format("%n%s%s%n%s%n%s%n%s%n",
                    addString[0], addString[4],
                    addString[3], addString[5], addString[1]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}