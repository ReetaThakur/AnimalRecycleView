package com.example.animalrecycleview;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView type;
    private TextView sound;
    private ItemClickListener itemClickListener;
    private ConstraintLayout constraintLayout;
    public AnimalHolder(View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener=itemClickListener;
        initView(itemView,itemClickListener);
    }


    private void initView(View itemView,ItemClickListener itemClickListener){
        imageView=itemView.findViewById(R.id.image);
        type=itemView.findViewById(R.id.type);
        sound=itemView.findViewById(R.id.sound);
        constraintLayout=itemView.findViewById(R.id.rvCard);

    }
    public void setData(Animal animal){
        imageView.setImageResource(animal.getImage());
        type.setText(animal.getType());
        sound.setText(animal.getSound());
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(animal);
            }
        });
    }
}
