package com.special.myapplication;

public enum Seasons {
    FALL, WINTER, SPRING, SUMMER, UNKNOWN;

    public static Seasons getSeason(String input){
        Seasons selectSeason;
        switch(input){
            case "summer":
                selectSeason = SUMMER;
                break;

            case "fall":
                selectSeason = FALL;
                break;

            case "winter":
                selectSeason = WINTER;
                break;

            case "spring":
                selectSeason = SPRING;
                break;

            default:
                selectSeason = UNKNOWN;
        }
        return selectSeason;
    }
}
