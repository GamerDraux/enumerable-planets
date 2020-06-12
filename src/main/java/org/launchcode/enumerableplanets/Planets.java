package org.launchcode.enumerableplanets;

public enum Planets {
    MERCURY("Mercury",88, 800),
    VENUS("Venus",225,860),
    EARTH("Earth",365,60),
    MARS("Mars",687,-20),
    JUPITER("Jupiter",4333,-150),
    SATURN("Saturn", 10759,-220),
    URANUS("Uranus",30687,-330),
    NEPTUNE("Neptune",60200,-350);

    public final String name;
    public final int yearLength;
    public final int avgTemp;


    Planets(String name, int yearLength, int avgTemp){
        this.name=name;
        this.yearLength=yearLength;
        this.avgTemp=avgTemp;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getAvgTemp() {
        return avgTemp;
    }
}
