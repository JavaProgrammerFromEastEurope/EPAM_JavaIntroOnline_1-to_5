package chapters.chapterClasses.entitys.composition.tourist.enums;

public enum Transport {
    CivilCar, PassengerBus, Ship, Aircraft;

    public static Transport valueOf(int i) {
        switch (i) {
            case 0:
                return CivilCar;
            case 1:
                return PassengerBus;
            case 2:
                return Ship;
            default:
                return Aircraft;
        }
    }
}
