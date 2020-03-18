package com.special.myapplication;

import androidx.annotation.NonNull;

public class Course {
    String courseName;
    int courseId;
    Seasons startingSeasons; //"Winter", "Summer", "fall", "Spring"


    public Course(String name, int courseId, Seasons startingSeason) {
        courseName = name;
        this.courseId = courseId;
        this.startingSeasons = startingSeason;
    }


    @NonNull
    @Override
    public String toString() {
        return courseName+"  Starting Season:  "+startingSeasons.name();
    }
}
