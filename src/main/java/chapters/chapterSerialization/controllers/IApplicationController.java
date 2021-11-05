package chapters.chapterSerialization.controllers;

public interface IApplicationController {

    void makeFirstAction();

    void makeSecondAction();

    void makeThirdAction();

    default void makeFourthAction(){}

    default void makeFifthAction(){}

    default void makeSixthAction(){}

    default void makeSeventhAction(){}

    default void makeEighthAction(){}
}