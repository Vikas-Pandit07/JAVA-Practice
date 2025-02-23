package com.kodnest.oops.Overloading;

public class MealTracker extends MealTrackerApp {
    public void takeMeal(String mealType) {
        System.out.println("Meal logged: " + mealType);
    }

    public void takeMeal(String mealType, int calories) {
        System.out.println("Meal logged: " + mealType + " with " + calories + " Calories");
    }

    public void takeMeal(String mealType, int calories, String micros) {
        System.out.println("Meal logged: " + mealType + " with " + calories + " Calories, Micros: " + micros);
    }

    public void takeMeal(String mealType, int calories, String micros, String micornutrients) {
        System.out.println("Meal logged: " + mealType + " with " + calories + " Calories, Micros: " + micros + ", Micronutrients: " + micornutrients);
    }

    public void show() {
        System.out.println("HIII");
    }
}
