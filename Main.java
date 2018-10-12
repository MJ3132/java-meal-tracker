
public class Main {

    public static void main(String[] args) {

        User Martin = new User("Martin", "Jarrin", "martinjarrin@gmail.com", 85);

        System.out.println("My First name is " + Martin.getFirstName() );

        System.out.println("My last name is " + Martin.getLastName());

        System.out.println("My Email address is " + Martin.getEmail());

        System.out.println("My goal for complete meals is " + Martin.getTargetAdherence() + "%");

        System.out.println("/-/-/-/-/-/--/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");


        Food Roti = new Food("Pasta", 25, 50, 10, Category.Fat);
        Food Curry = new Food("Sushi", 45, 70, 80, Category.Vegetable);
        Food Pizza= new Food("Pizza", 10, 20, 10, Category.Fat);

        System.out.println("One of the foods I am eating in this meal is " + Roti.getName());

        Pasta.addCategory(Category.Fat);

        System.out.println("The main food group for Roti is " + Roti.getCategory());

        System.out.println("Roti has " + Pasta.getCalories() + " calories");

        System.out.println("Roti has " + Pasta.getCarbs() + " grams of carbohydrates");

        System.out.println("Roti has " + Pasta.getFat() + " grams of fat");

        System.out.println("Roti has " + Pasta.getProtein() + " grams of protein");

        System.out.println("/-/-/-/-/-/--/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        Meal meal = new Meal("Dinner");

        meal.addFood(Pasta);
        meal.addFood(Sushi);
        meal.addFood(Pizza);

        System.out.println("This meal is called " + meal.getName());
        System.out.println("This meal consists of");
        meal.viewFoods();

        System.out.println("/-/-/-/-/-/--/-/-/-/-/-/-/-/-/-/-/-/-");

        System.out.println("I am eating Dinner at " + meal.getMealTime());
        System.out.println("Dinner has " + meal.getCalories() + " calories");
        System.out.println("Dinner has " + meal.getCarbs() + " carbs");
        System.out.println("Dinner has " + meal.getProtein() + " protein");
        System.out.println("Dinner has " + meal.getFat() + " fat");

        if (meal.isComplete()) {
            System.out.println("Dinner is complete");
        } else {
            System.out.println("Dinner is not complete");
        }

        System.out.println("/-/-/-/-/-/--/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");

        MealTracker Monday = new MealTracker(Martin);
        Monday.addMeal(meal);

        System.out.println("My meals for the day include");
        Monday.viewMeals();

        if (Monday.onTrack()) {
            System.out.println("This meal is keeping me on track");
        } else {
            System.out.println("I am not currently on track for my daily eating needs");
        }

        System.out.println("Today I have eaten a total of " + Monday.getMealCount() + " meals");
        System.out.println("Today I had a total of " + Monday.getAdherence() + " complete meals");
    }
    }