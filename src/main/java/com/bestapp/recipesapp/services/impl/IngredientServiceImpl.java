package com.bestapp.recipesapp.services.impl;

import com.bestapp.recipesapp.model.Ingredient;
import com.bestapp.recipesapp.services.IngredientService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private static Map<Long, Ingredient> ingredients = new HashMap<>();
    private static long ingredientNumber = 0;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        ingredients.putIfAbsent(ingredientNumber++, ingredient);
        return ingredient;
    }

    @Override
    public Map<Long, Ingredient> getAllIngredients() {
        return ingredients;
    }

    @Override
    public Ingredient getIngredient(long ingredientNumber) {
        return ingredients.get(ingredientNumber);
    }

    @Override
    public Ingredient editIngredient(long ingredientNumber, Ingredient ingredient) {
            if (ingredients.containsKey(ingredientNumber)) {
                ingredients.put(ingredientNumber, ingredient);
                return ingredient;
            }
        return null;
    }

    @Override
    public boolean deleteIngredientById(long ingredientNumber) {
            if (ingredients.containsKey(ingredientNumber)) {
                ingredients.remove(ingredientNumber);
                return true;
            }
        return false;
    }

    @Override
    public void deleteAllIngredients() {
        ingredients = new HashMap<>();
    }
}
