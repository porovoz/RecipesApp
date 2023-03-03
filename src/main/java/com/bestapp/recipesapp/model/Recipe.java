package com.bestapp.recipesapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> cookingInstructions;
}