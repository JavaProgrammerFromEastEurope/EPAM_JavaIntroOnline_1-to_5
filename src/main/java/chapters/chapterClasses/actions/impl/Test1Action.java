package chapters.chapterClasses.actions.impl;

import application.utils.Input;
import chapters.chapterClasses.actions.IClassAction;

public class Test1Action implements IClassAction {

    private int first;
    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getSum(int first, int second) {
        return first + second;
    }

    public int getMax(int first, int second) {
        return Math.max(first, second);
    }

    @Override
    public String toString() {
        return "Test1{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public void inputVariables() {
         setFirst(Input.getInteger("Input 1 integer:"));
        setSecond(Input.getInteger("Input 2 integer:"));
    }

    @Override
    public void printResult() {
        addString[0] = " The sum of two variables:";
        addString[1] = " The max of two variables:";
        System.out.printf(" %s %d%n %s %d%n%n",
                addString[0], getSum(getFirst(), getSecond()),
                addString[1], getMax(getFirst(), getSecond()));
        IClassAction.super.setDefaultOperations();
    }
}