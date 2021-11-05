package chapters.chapterClasses.entitys.composition.state;

import java.util.ArrayList;

public class City {

    String city;
    String capital;
    ArrayList<District> districts;

    public City(ArrayList<District> districts, String city) {
        this.districts = districts;
        this.city = city;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return String.format("city='%s', districts=%s}", city, districts);
    }
}