package chapters.chapterFunctions.functions.impl.stringProcessing.regExpressions;

import chapters.chapterFunctions.functions.IFunction;
import chapters.chapterFunctions.functions.impl.stringProcessing.ParagraphMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.lang.System.out;

/**
 * Sort words sentences by number inputted character
 **/
public class ThirdRegExpFunction extends ParagraphMaps implements IFunction {

    @Override
    public void calcFunction() {
        setPattern(Pattern.compile("[\t]"));
        setFirstList(Arrays.stream(getPattern().split(getStringFromFile()))
                .collect(Collectors.toCollection(ArrayList::new)));
        getFirstList().remove("");
        setEntrySet(initEntrySet(getFirstList()));
        setParagraphMap(sortByEntrySet(getEntrySet(),SortEnum.SORT_BY_CHAR));
    }

    @Override
    public String getResultString() {
        var resultList = new ArrayList<>();
        out.println(IFunction.warning);
        addString[0] = " 3. Regular Expression Function\n";
        resultList.add("Sort paragraphs by number inputted character:");
        getParagraphMap().forEach((k, v) ->
                getParagraphMap().get(k).forEach((key, value) -> {
                    resultList.add(String.format("%n%s: - %s", k, value));
                    key.forEach(o ->
                            resultList.add(String.format(" - [%2s]", o)));
                }));
        return String.format("%n%s%s%n", addString[0], List.of(resultList));
    }
}