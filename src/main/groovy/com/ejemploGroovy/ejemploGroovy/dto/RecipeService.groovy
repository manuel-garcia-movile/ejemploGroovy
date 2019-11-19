package com.ejemploGroovy.ejemploGroovy.dto

class RecipeService {
    def cook(Recipe recipe, int minutes, String device) {
        if (minutes > recipe.time) {
            throw new BurnedException("Time given $minutes is bigger than optimal time $recipe.time so the recipe is burned.")
        }
        if (device != recipe.device) {
            throw new InvalidDeviceException("Please use $recipe.device for this recipe.")
        }
    }
}
