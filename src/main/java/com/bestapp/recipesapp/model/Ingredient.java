package com.bestapp.recipesapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {
    private String ingredientName;
    private int ingredientQuantity;
    private String unitOfMeasurement;
}