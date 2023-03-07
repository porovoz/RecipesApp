package com.bestapp.recipesapp.services.impl;

import com.bestapp.recipesapp.model.Recipe;
import com.bestapp.recipesapp.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private static Map<Long, Recipe> recipes = new HashMap<>();
    private static long recipeNumber = 0;

    @Override
    public Recipe addRecipe(Recipe recipe) {
        recipes.putIfAbsent(recipeNumber++, recipe);
        return recipe;
    }

    @Override
    public Map<Long, Recipe> getAllRecipes() {
        return recipes;
    }

    @Override
    public Recipe getRecipe(long recipeNumber) {
        return recipes.get(recipeNumber);
    }

    @Override
    public Recipe editRecipe(long recipeNumber, Recipe recipe) {
        for (Recipe value : recipes.values()) {
            if (recipes.containsKey(recipeNumber)) {
                recipes.put(recipeNumber, recipe);
                return recipe;
            }
        }
        return null;
    }

    @Override
    public boolean deleteRecipeById(long recipeNumber) {
        for (Recipe value : recipes.values()) {
            if (recipes.containsKey(recipeNumber)) {
                recipes.remove(recipeNumber);
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteAllRecipes() {
        recipes = new HashMap<>();
    }
}