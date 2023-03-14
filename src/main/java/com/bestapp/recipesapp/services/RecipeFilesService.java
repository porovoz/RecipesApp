package com.bestapp.recipesapp.services;

public interface RecipeFilesService {
    boolean saveToFile(String json);

    String readFromFile();
}
