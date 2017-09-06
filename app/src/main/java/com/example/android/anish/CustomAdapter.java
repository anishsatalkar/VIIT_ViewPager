package com.example.android.anish;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 06-Sep-17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.FireModelHolder> {

    private List<FireModel> dataSet;

    public CustomAdapter(List<FireModel> fireDataSet){
        this.dataSet = fireDataSet;
    }

    public class FireModelHolder extends RecyclerView.ViewHolder {
        public TextView lecture_time, lecture_subject;

        public FireModelHolder(View view) {
            super(view);
            lecture_time = (TextView) view.findViewById(R.id.lecture_time);
            lecture_subject = (TextView) view.findViewById(R.id.lecture_subject);
        }
    }



    @Override
    public FireModelHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        return new FireModelHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FireModelHolder holder, int position) {
        FireModel fireModel = dataSet.get(position);
        Log.d("IN BIND", String.valueOf(dataSet.get(position)));
        holder.lecture_time.setText(fireModel.getLecture_time());
        holder.lecture_subject.setText(fireModel.getLecture_subject());
    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
