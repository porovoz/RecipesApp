package com.bestapp.recipesapp.controllers;

import com.bestapp.recipesapp.model.Recipe;
import com.bestapp.recipesapp.services.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        Recipe createdRecipe = recipeService.addRecipe(recipe);
        return ResponseEntity.ok(createdRecipe);
    }

    @GetMapping("/{recipeNumber}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable long recipeNumber) {
        Recipe recipe = recipeService.getRecipe(recipeNumber);
        if (recipe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }

    @GetMapping
    public ResponseEntity<Map<Long, Recipe>> getAllRecipes() {
        Map<Long, Recipe> recipes = recipeService.getAllRecipes();
        if (recipes == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipes);
    }

    @PutMapping("/{recipeNumber}")
    public ResponseEntity<Recipe> editRecipe(@PathVariable long recipeNumber, @RequestBody Recipe recipe) {
        Recipe recipe1 = recipeService.editRecipe(recipeNumber, recipe);
        if (recipe1 == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe1);
    }

    @DeleteMapping("/{recipeNumber}")
    public ResponseEntity<Void> deleteRecipeById(@PathVariable long recipeNumber) {
        if (recipeService.deleteRecipeById(recipeNumber)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllRecipes() {
        recipeService.deleteAllRecipes();
        return ResponseEntity.ok().build();
    }
}