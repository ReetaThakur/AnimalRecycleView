package com.example.animalrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {
    ArrayList<Animal> animalsList;
    private ItemClickListener itemClickListener;

    public AnimalAdapter(ArrayList<Animal> arrayList,ItemClickListener itemClickListener){
        animalsList=arrayList;
        this.itemClickListener=itemClickListener;

    }
    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_layout,parent,false);

        return new AnimalHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder( AnimalHolder holder, int position) {
        Animal animal=animalsList.get(position);
        holder.setData(animal);

    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }
}
