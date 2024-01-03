import java.util.ArrayList;

public class Menu {

    private ArrayList<Recipe> recipes;

    public Menu()
    {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe)
    {
        if(!recipes.contains(recipe))
        {
            recipes.add(recipe);
            System.out.println("The recipe added successfully");
        }
        else
            System.out.println("The recipe already exists");
    }

    public void printMenu()
    {
        System.out.println("This is the menu");
        for (int i = 0; i < recipes.size(); i++) {
            Recipe aux = recipes.get(i);
            System.out.println((i+ 1) + ". " +aux.getName() + ": $" + aux.getPrice());
        }
    }

    public void replaceRecipe(int index, Recipe newRecipe)
    {
        try{
            recipes.set(index -1, newRecipe);
            System.out.println("The recipe replaced successfully");
        }
        catch (Exception e)
        {
            System.out.println("An error occurred");
        }
    }

    public void printAmountRecipes()
    {
        System.out.println("The amount of recipes is: " + recipes.size());
    }


}
