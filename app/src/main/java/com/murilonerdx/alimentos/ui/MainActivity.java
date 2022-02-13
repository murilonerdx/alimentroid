package com.murilonerdx.alimentos.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.murilonerdx.alimentos.R;
import com.murilonerdx.alimentos.adapter.FoodAdapter;
import com.murilonerdx.alimentos.model.FoodEntity;
import com.murilonerdx.alimentos.repository.FoodBusiness;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<FoodEntity> foodEntityList = new FoodBusiness().getList();

        this.mViewHolder.mRecyclerView = findViewById(R.id.recycler_food);

        FoodAdapter adapter = new FoodAdapter(foodEntityList);
        this.mViewHolder.mRecyclerView.setAdapter(adapter);

        this.mViewHolder.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private static class ViewHolder {
        RecyclerView mRecyclerView;
    }
}