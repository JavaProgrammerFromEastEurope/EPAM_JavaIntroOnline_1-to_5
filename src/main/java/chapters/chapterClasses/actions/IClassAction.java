package chapters.chapterClasses.actions;

public interface IClassAction {

    String[] addString = new String[6];

    void inputVariables();
    void printResult();

    default void setDefaultOperations() {
        java.util.Arrays.fill(addString, null);
    }
}