package com.bestapp.recipesapp.services;

import com.bestapp.recipesapp.model.Ingredient;

public interface IngredientService {
    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(long ingredientNumber);
}
