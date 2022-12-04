package com.example.task_2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private ArrayList<DataModel> dataSet;
    private RecyclerViewInterface recyclerViewInterface;

    public MyAdapter(ArrayList<DataModel> dataSet) {
        this.dataSet = dataSet;
        this.recyclerViewInterface = recyclerViewInterface;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext() ).inflate(R.layout.fragment_card_layout2 , parent ,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }


    @SuppressLint("RestrictedApi")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int listPosition) {
        TextView textViewName = viewHolder.textViewName;
        TextView textViewShortData = viewHolder.textViewShortData;
        ImageView imageView = viewHolder.imageViewIcon;
        CardView cardView = viewHolder.cardView;
        textViewName.setText(dataSet.get(listPosition).getName());
        textViewShortData.setText(dataSet.get(listPosition).getShortData());
        imageView.setImageResource(dataSet.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public  static  class MyViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView textViewName;
        TextView textViewShortData;
        ImageView imageViewIcon;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.CardView);
            textViewName = ( TextView) itemView.findViewById(R.id.textViewName);
            textViewShortData = (TextView) itemView.findViewById(R.id.textViewShortData);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageViewButton);

            imageViewIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("msg","Adapter");
//                    if(recyclerViewInterface != null){
//                        int position = getAdapterPosition();
//
//                        if(position != RecyclerView.NO_POSITION){
//                            recyclerViewInterface.onItemClick(position);
//                        }

                }
            });
        }
    }
}

