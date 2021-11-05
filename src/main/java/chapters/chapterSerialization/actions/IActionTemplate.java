package chapters.chapterSerialization.actions;

public interface IActionTemplate {
    void addObject();
    void updateObject();
    void removeObject();
    void firstSort();
    void secondSort();
    default void showMostValObject(){}
    default void showPriseObject(){}
    default void xmlExportObject(){}
}