package com.murilonerdx.alimentos.repository;

import com.murilonerdx.alimentos.model.FoodEntity;

import java.util.List;

public class FoodBusiness {

    public List<FoodEntity> getList(){
        return new FoodRepository().getmList();
    }

    public FoodEntity get(int id){
        return new FoodRepository().get(id);
    }
}
