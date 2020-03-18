package com.special.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.special.myapplication.Seasons.UNKNOWN;

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


        Button btn = findViewById(R.id.btn);
        final EditText courseStart = findViewById(R.id.course_start);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String courseText = courseStart.getText().toString();
                Course course = new Course("randomName",
                        3456, Seasons.getSeason(courseText.toLowerCase()));

                if (course.startingSeasons == UNKNOWN) {
                    Toast.makeText(MainActivity.this, "Your input is wrong",
                            Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "Your input is correct",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
