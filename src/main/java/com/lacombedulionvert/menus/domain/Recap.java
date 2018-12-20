package com.lacombedulionvert.menus.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Recap {

    public List<String> getDishNumberByName(List<String> dishes) {
        Set<String> distinctDishNames = new HashSet<>(dishes);
        return distinctDishNames.stream()
                .map(name -> countByName(dishes, name))
                .collect(Collectors.toList());

    }


    private String countByName(List<String> dishNames, String name) {
        long dishCount = dishNames
                .stream()
                .filter(dishName -> dishName.equals(name))
                .count();
        return name + " : " + dishCount;
    }
}

