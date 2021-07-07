package com.example.animalrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private ArrayList<Animal> list=new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);
        builDataForRecycle();
        setDataForAdapter();
    }
    private void builDataForRecycle(){
        for(int i=0;i<7;i++) {
            list.add(new Animal(R.drawable.cat1, "Type-Cat", "Sound:MawMaw"));
            list.add(new Animal(R.drawable.rat, "Type-Rat", "Sound:Chichi"));
            list.add(new Animal(R.drawable.tiger1, "Type-tiger", "Sound:Haha"));
            list.add(new Animal(R.drawable.rabbity, "Type-Rabbit", "Sound:Chocho"));
        }


    }
    private void setDataForAdapter(){
        AnimalAdapter animalAdapter=new AnimalAdapter(list,this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(animalAdapter);

    }


    @Override
    public void onItemClicked(Animal animal) {
        Toast.makeText(MainActivity.this,animal.getType(),Toast.LENGTH_LONG).show();

    }
}