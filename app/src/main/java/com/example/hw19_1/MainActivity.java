package com.example.hw19_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private ArrayList<String> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        recyclerView = findViewById(R.id.rv_food);
        loadData();
        adapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        foodList.add("Босо Лагман");
        foodList.add("Шаурма");
        foodList.add("Тако");
        foodList.add("Рамен");
        foodList.add("Курица в кисло-сладком");
        foodList.add("Бешбармак");
        foodList.add("Фетучини");
        foodList.add("Пельмени");
        foodList.add("Борщ");
        foodList.add("Картошка по-деревенски");
        foodList.add("Гамбургер");
    }
}