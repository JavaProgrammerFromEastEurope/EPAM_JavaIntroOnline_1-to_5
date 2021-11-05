package chapters.chapterFunctions.functions.impl.stringProcessing.strings;

import chapters.chapterFunctions.functions.IFunction;

import static java.lang.String.*;
import static java.lang.System.out;
/** The 'Word' to 'Letter' replacement **/
public class SecondStrFunction implements IFunction {

    @Override
    public void calcFunction() {
        addString[1] = "Is the word great? How many words you can pronounce?";
        addString[2] = "word";
        addString[3] = "letter";
        addString[4] = addString[1].replaceAll(addString[2], addString[3]);
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 2. String Function\n";
            addString[2] = " The natural string:";
            addString[3] = " The modified string:";
            return format("%n%s%s%n%s%n%s%n%s%n",
                    addString[0],addString[2], addString[1],
                                 addString[3], addString[4]);
        } finally {
            IFunction.super.setDefaults();
        }
    }
}