package Task1;

public enum Months {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    DECEMBER(31, Seasons.WINTER),

    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),

    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),

    SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN);

    private int days;
    private Seasons seanons;

    Months(int days, Seasons seanons){
        this.days = days;
        this.seanons = seanons;
    }
    public int getDays() {
        return days;
    }

    public Seasons getSeanons() {
        return seanons;
    }
}
