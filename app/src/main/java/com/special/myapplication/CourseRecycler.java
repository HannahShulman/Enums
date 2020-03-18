package com.special.myapplication;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseRecycler extends RecyclerView.Adapter<CourseRecycler.CourseViewHolder> {


    ArrayList<Course> courseList;
    public CourseRecycler(ArrayList<Course> list) {
        courseList = list;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_layout, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        holder.info.setText(courseList.get(position).startingSeasons.name());

        switch (courseList.get(position).startingSeasons){
            case SUMMER:
                holder.info.setTextColor(Color.RED);
                break;
            case FALL:
                holder.info.setTextColor(Color.YELLOW);
                break;
             case WINTER:
                holder.info.setTextColor(Color.GREEN);
                break;
            case SPRING:
                holder.info.setTextColor(Color.BLUE);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    class CourseViewHolder extends  RecyclerView.ViewHolder{

        TextView info;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            info = itemView.findViewById(R.id.info);
        }
    }
}
