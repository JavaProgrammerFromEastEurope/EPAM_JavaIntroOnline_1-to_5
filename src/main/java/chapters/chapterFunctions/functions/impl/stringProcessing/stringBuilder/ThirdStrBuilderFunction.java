package chapters.chapterFunctions.functions.impl.stringProcessing.stringBuilder;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.StringLists;

import java.util.ArrayList;

import static java.lang.String.*;
import static java.lang.System.out;
/** The list of palindrome strings **/
public class ThirdStrBuilderFunction extends StringLists implements IFunction {

    @Override
    public void calcFunction() {
        addString[1] = "Mr. redivider ate my metal worm, Do geese see God?,\n " +
                "Was it deified or civic you saw?, Murder for radar of level rum.\n " +
                "Go rotor salami, I'm kayak hog.";

        setStringBuilder(new StringBuilder(addString[1]));
        setFirstList(initArrayStringList(getStringBuilder()));
        setExtraList(new ArrayList<>());

        for (String string : getFirstList()) {
            StringBuffer rev =  new StringBuffer(string).reverse();
            if (string.equals(rev.toString())) {
                getExtraList().add(string);
            }
        }
    }

    @Override
    public String getResultString() {
        try {
            out.println(IFunction.warning);
            addString[0] = " 3. String Builder Function\n";
            addString[2] = " The string:";
            addString[3] = " The list of a palindrome strings:";
            return format("%n%s%s%n%s%n%s%n%s%n%n",
                    addString[0], addString[2],
                    addString[1], addString[3], getExtraList());
        } finally {
            IFunction.super.setDefaults();
        }
    }
}