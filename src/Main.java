import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome to the supermarket!");

        boolean stop = false;
        Menu menu = new Menu();

        while (!stop) {
            System.out.println("Choose the number of your action: \n" +
                    "1. Add recipe to the menu \n" + "2. Replace a recipe \n" +
                    "3. Print the amount of recipes on the menu \n" + "4. Print the whole menu \n" + "5. Stop \n");
            int action = Integer.parseInt(scan.nextLine());

            switch(action){
                case(1):
                    System.out.println("Input the name of your recipe");
                    String name = scan.nextLine();
                    System.out.println("Input the price of one recipe");
                    double price = Double.parseDouble(scan.nextLine());

                    if(!Objects.equals(name, "") && name != null)
                    {
                        Recipe recipe = new Recipe(name, price);
                        menu.addRecipe(recipe);
                    }
                    else {
                        System.out.println("An error occurred");
                    }
                    break;

                case(2):
                    menu.printMenu();
                    System.out.println("Input the number of your recipe to replace");
                    int replace = Integer.parseInt(scan.nextLine());

                    System.out.println("Input the name of your recipe");
                    String newName = scan.nextLine();
                    System.out.println("Input the price of one recipe");
                    double newPrice = Double.parseDouble(scan.nextLine());
                    Recipe newRecipe = new Recipe(newName, newPrice);

                    menu.replaceRecipe(replace, newRecipe);
                    break;

                case(3):
                    menu.printAmountRecipes();
                    break;

                case(4):
                    menu.printMenu();
                    break;

                case(5):
                    stop = true;
                    System.out.println("Good Bye!");
                    break;

                default:
                    System.out.println("Please, choose a valid option");
            }
        }

    }
}