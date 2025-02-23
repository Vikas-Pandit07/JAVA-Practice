package com.kodnest.oops.Overloading;

public class MealTrackerApp {
    public static void main(String[] args) {
        MealTracker tracker = new MealTracker();
        tracker.takeMeal("Breakfast");
        tracker.takeMeal("Lunch", 600);
        tracker.takeMeal("Dinner", 800, "40% carbs, 30% protein");
        tracker.takeMeal("Snack", 300, "10% carbs, 20% protein", "high fiber");
        tracker.show();
    }
}
