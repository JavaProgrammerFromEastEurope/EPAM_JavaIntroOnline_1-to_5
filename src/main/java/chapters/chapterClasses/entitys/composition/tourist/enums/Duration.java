package chapters.chapterClasses.entitys.composition.tourist.enums;

public enum Duration {
    Week, TwoWeeks, ThreeWeeks, Month;

    public static Duration valueOf(int i) {
        switch (i) {
            case 0:
                return Week;
            case 1:
                return TwoWeeks;
            case 2:
                return ThreeWeeks;
            default:
                return Month;
        }
    }
}
