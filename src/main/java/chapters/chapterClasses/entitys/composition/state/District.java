package chapters.chapterClasses.entitys.composition.state;

public class District {

    String district;

    public District(String district) {
        this.district = district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return String.format("district='%s'}", district);
    }
}