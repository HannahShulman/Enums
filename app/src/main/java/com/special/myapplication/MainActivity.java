package com.special.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Course> list = new ArrayList<>();
        list.add(new Course("course1", 1, Seasons.SUMMER));
        list.add(new Course("course1", 1, Seasons.SUMMER));
        list.add(new Course("course1", 2,  Seasons.SUMMER));
        list.add(new Course("course1", 1,  Seasons.SUMMER));
        list.add(new Course("course1", 1,  Seasons.SUMMER));
        list.add(new Course("course1", 1,  Seasons.SUMMER));
        list.add(new Course("course1", 1,  Seasons.SUMMER));
        list.add(new Course("course1", 1,  Seasons.WINTER));
        list.add(new Course("course1", 1,  Seasons.SUMMER));
        list.add(new Course("course1", 1,  Seasons.WINTER));
        list.add(new Course("course1", 1,  Seasons.WINTER));
        list.add(new Course("course1", 1,  Seasons.FALL));
        list.add(new Course("course1", 1,  Seasons.SUMMER));
        list.add(new Course("course1", 1,  Seasons.SUMMER));
        list.add(new Course("course1", 1,  Seasons.SUMMER));


        RecyclerView course_list = findViewById(R.id.course_list);
        CourseRecycler adapter = new CourseRecycler(list);
        course_list.setAdapter(adapter);

    }
}
