package com.bestapp.recipesapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> cookingInstructions;
}