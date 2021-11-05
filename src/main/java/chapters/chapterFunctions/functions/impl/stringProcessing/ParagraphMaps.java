package chapters.chapterFunctions.functions.impl.stringProcessing;

import application.sortComparator.impl.function.SortByLengthWord;
import application.utils.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static application.utils.CharArrays.sumOfCharValues;
import static java.lang.String.format;
import static java.lang.System.out;
import static java.nio.file.Files.newBufferedReader;
import static java.util.Comparator.comparingInt;

public abstract class ParagraphMaps extends StringLists {

    private TreeMap<Integer, HashMap<List<String>, Integer>> paragraphMap;
    private HashMap<List<String>, Integer> entrySet;
    private Pattern pattern;


    public void setParagraphMap(TreeMap<Integer, HashMap<List<String>, Integer>> paragraphMap) {
        this.paragraphMap = paragraphMap;
    }

    private static final String PATH = "regExpressions/AliceWonderland.txt";

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public HashMap<List<String>, Integer> getEntrySet() {
        return entrySet;
    }

    public void setEntrySet(HashMap<List<String>, Integer> entrySet) {
        this.entrySet = entrySet;
    }

    public TreeMap<Integer, HashMap<List<String>, Integer>> getParagraphMap() {
        return paragraphMap;
    }


    protected String getStringFromFile() {
        var stringFromFile = new AtomicReference<String>();
        try (BufferedReader bufferedReader = newBufferedReader(Paths.get(
                getClass().getResource(format("/%s", PATH)).toURI()))) {
            stringFromFile.set(bufferedReader.lines().collect(Collectors.joining(" ")));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return stringFromFile.get();
    }

    protected HashMap<List<String>, Integer>  initEntrySet(ArrayList<String> text) {
        setPattern(Pattern.compile("(\\.\\s+)"));
        var entrySet = new HashMap<List<String>, Integer>();
        for (String paragraph : text) {
            setExtraList(Arrays.stream(getPattern().split(paragraph))
                    .collect(Collectors.toCollection(ArrayList::new)));
            entrySet.put(getExtraList(), getExtraList().size());
        }
        return entrySet;
    }

    protected TreeMap<Integer, HashMap<List<String>, Integer>> sortByEntrySet(
            HashMap<List<String>, Integer> entries, SortEnum sort) {
        var paragraphMap = new TreeMap<Integer, HashMap<List<String>, Integer>>();
        var list = new ArrayList<>(entries.entrySet());
        HashMap<List<String>, Integer> sortedEntrySet;
        switch (sort) {
            case SORT_BY_ENTRY_VALUE:
                list.sort(Map.Entry.comparingByValue());
                for (int i = 1; i <= list.size(); i++) {
                    sortedEntrySet = new HashMap<>();
                    sortedEntrySet.put(
                            list.get(i - 1).getKey(),
                            list.get(i - 1).getValue());
                    paragraphMap.put(i, sortedEntrySet);
                }
                break;
            case SORT_BY_LENGTH:
                for (int i = 1; i <= list.size(); i++) {
                    sortedEntrySet = new HashMap<>();
                    sortedEntrySet.put(
                            sortByLength(list.get(i - 1).getKey()),
                            list.get(i - 1).getValue());
                    paragraphMap.put(i, sortedEntrySet);
                }
                break;
            case SORT_BY_CHAR:
                    out.println("Input a character:");
                final String character = (String) Input.inputCharacter();
                for (int i = 1; i <= list.size(); i++) {
                    sortedEntrySet = new HashMap<>();
                    sortedEntrySet.put(
                            sortByCharacter(list.get(i - 1).getKey(), character),
                            list.get(i - 1).getValue());
                    paragraphMap.put(i, sortedEntrySet);
                }
                break;
        }
        return paragraphMap;
    }

    protected ArrayList<String> sortByLength(List<String> paragraph) {
        setPattern(Pattern.compile("\\W+"));
        var sortedArrayList = new ArrayList<String>();
        for (String sentence : paragraph) {
            setExtraList(Arrays.stream(getPattern().split(sentence))
                    .sorted(new SortByLengthWord())
                    .collect(Collectors.toCollection(ArrayList::new)));
            sortedArrayList.add(makeTemplateString(getExtraList()));
        }
        return sortedArrayList;
    }

    protected ArrayList<String> sortByCharacter(List<String> paragraph, String character) {
        setPattern(Pattern.compile("\\s+"));
        var sortedArrayList = new ArrayList<String>();
        for (String sentence : paragraph) {
            setExtraList(Arrays.stream(getPattern().split(sentence))
                    .sorted(comparingInt((String word) ->
                            sumOfCharValues(word.toCharArray(), 0,
                                    character.charAt(0))).reversed()
                            .thenComparing(Comparator.naturalOrder()))
                    .collect(Collectors.toCollection(ArrayList::new)));
            sortedArrayList.add(makeTemplateString(getExtraList()));
        }
        return sortedArrayList;
    }

    public enum SortEnum {
        SORT_BY_ENTRY_VALUE,
        SORT_BY_LENGTH,
        SORT_BY_CHAR
    }
}