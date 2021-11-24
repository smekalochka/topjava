package ru.javawebinar.topjava.dao;

import ru.javawebinar.topjava.model.Meal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MealDaoImpl implements MealDao {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Meal> mealMap = new HashMap<>();


    @Override
    public void addMeal(Meal meal) {

    }

    @Override
    public void deleteMeal(Meal meal) {

    }

    @Override
    public void updateMeal(Meal meal) {

    }

    @Override
    public List<Meal> getAllMeals() {
        return null;
    }

    @Override
    public Meal getMealById(int mealId) {
        return null;
    }
}
