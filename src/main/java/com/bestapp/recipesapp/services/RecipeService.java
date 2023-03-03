package com.bestapp.recipesapp.services;

import com.bestapp.recipesapp.model.Recipe;

public interface RecipeService {
    Recipe addRecipe(Recipe recipe);
    Recipe getRecipe(long recipeNumber);
}
