package com.bestapp.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String applicationStatus() {
        return "The application is running";
    }

    @GetMapping("/info")
    public String information() {
        return "Student name: Alexander Sokol; " +
                "Project name: Recipes; " +
                "Project creation date: 23.02.2023; " +
                "Project description: An application that presents recipes for cooking.";
    }
}
