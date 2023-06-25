package com.example.RestaurantModel.configuration;

import com.example.RestaurantModel.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration
class BeanManager {

    @Bean
    public List<Restaurant> getInitializedList()
    {
        Restaurant initUser = new Restaurant(0,"ElChico",20,"Indian","9999889999","dmo dmo dmo dmo",10);
        List<Restaurant> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }

}