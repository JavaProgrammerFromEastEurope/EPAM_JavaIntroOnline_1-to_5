package chapters.chapterClasses.entitys.composition.state;

import java.util.ArrayList;

public class Region {

    String region;
    String mainCity;
    ArrayList<City> cities;


    public Region(String region, ArrayList<City> cities) {
        this.region = region;
        this.cities = cities;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public void setMainCity(String mainCity) {
        this.mainCity = mainCity;
    }

    public String getMainCity() {
        return mainCity;
    }

    public String getRegion() {
        return region;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return String.format("region='%s', cities=%s}", region, cities);
    }
}