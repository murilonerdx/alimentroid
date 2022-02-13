package com.murilonerdx.alimentos.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.murilonerdx.alimentos.model.FoodEntity;
import com.murilonerdx.alimentos.viewholder.FoodViewHolder;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {
    private List<FoodEntity> foodEntityList;

    public FoodAdapter(List<FoodEntity> foodEntityList) {
        this.foodEntityList = foodEntityList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return foodEntityList.size();
    }
}
