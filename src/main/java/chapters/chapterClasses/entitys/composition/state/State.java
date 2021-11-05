package chapters.chapterClasses.entitys.composition.state;

import java.util.ArrayList;

import static java.lang.String.format;

public class State {

    String state;
    String area;
    ArrayList<Region> regions;

    public State(String state, ArrayList<Region> regions) {
        this.state = state;
        this.regions = regions;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public String getArea() {
        return area;
    }

    public String getState() {
        return state;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    @Override
    public String toString() {
        return format("state='%s', regions=%s}", state, regions);
    }
}