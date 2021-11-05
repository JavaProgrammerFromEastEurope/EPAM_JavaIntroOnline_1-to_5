package chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.StringLists;

import static java.lang.String.*;
import static java.lang.System.out;

/** Adding extra 'b' after character 'a' **/
public class SecondStrBuilderFunction extends StringLists implements IFunction {

    @Override
    public void calcFunction() {
        addString[1] = "So perhaps,  you've  generated some fancy text, and you're content that you can now\n" +
                " copy and paste your fancy text in   the comments section of funny cat videos, but perhaps\n" +
                " you're wondering how  it's even     possible to change     the font of your text?";

        setStringBuilder(new StringBuilder(addString[1]));
        for (int i = 0; i < getStringBuilder().length(); i++) {
            if (getStringBuilder().charAt(i) == 'a') {
                getStringBuilder().insert(i + 1, 'b');
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 2. String Builder Function\n";
            addString[3] = "The real string:";
            addString[4] = "The modified string:";
            return format("%n%s%s%n%s%n%s%n%s%n",
                    addString[0], addString[3],
                    addString[1], addString[4], getStringBuilder());
        } finally {
            IFunction.super.setDefaults();
        }
    }
}