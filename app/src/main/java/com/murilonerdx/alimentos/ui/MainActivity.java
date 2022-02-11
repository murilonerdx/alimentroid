package com.murilonerdx.alimentos.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.murilonerdx.alimentos.R;
import com.murilonerdx.alimentos.model.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FoodEntity foodEntity = new FoodEntity();
        List<FoodEntity> foodEntityList = new ArrayList<>();
        foodEntityList.add(foodEntity);
        this.mViewHolder.mRecyclerView = findViewById(R.id.recycler_food);
    }

    private static class ViewHolder {
        RecyclerView mRecyclerView;
    }
}