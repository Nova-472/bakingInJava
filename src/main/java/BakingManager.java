import java.util.ArrayList;
import java.util.List;

public class BakingManager {
    //Properties
    //Creates an instance of stock
    Stock stock = new Stock();
    static StoreManager storeManager = new StoreManager(250.0);

    //Constructors

    //Methods

    public void countAllStock() {
        //Lists all current stock
        System.out.println("Currently there are "+ stock.getAmount() + " items in stock." + "\n------");

    }

    public void listAllStock() {
        System.out.println("All Items in list: \n" + stock.getAllStockNames() + "------");
    }

    public void findIngridiants(String find) {
        //This checks if the "Find" sting is valid, if no tels the user the input is wrong using an inline statement and String.format. Otherwise it will seach again to get listIngridiants and list those.
        System.out.println((stock.listIngridiants(find) == null)? String.format("The Item %s You Searched For Was Not Found!", find) : "The Item " + find + " Contains: " + stock.listIngridiants(find) + "\n-----");
    }

    public void addFoodItem(String foodType, List<String> ingredients, Double price, String itemName){
        //Adds new item using data from main

        //Checks for Ingredients and removes them. If Ingredient amount is at 0 it will be removed from the list.

        //Check
        //Foreach
        /*for (String selectedIngredient : ingredients) {
            //Compare to list of current ingredients

            if(selectedIngredient.toString().contains(IngredientsManager.getIngredientStock.)) {


            }
        } */

        if(IngredientsManager.isCookable(ingredients)) {
            //Remove. I am aware that there is no need for "=="
            IngredientsManager.removeIngredients(ingredients);
            //New Item

            //Must both be successful for object creation.
            stock.addStock(foodType, ingredients, price, itemName);
        } else {
            System.out.println("Item could not be created");
        }


    }

    public void editItemName(String oldName, String newName) {
        //Recives old name and upddates to new name.
        System.out.println("\n ----" + stock.editItemName(oldName, newName) + "----\n");
    }

    public void getItemPrice(String itemName){
        //Gets Item prices using an item name
        System.out.println(String.format("The item %s is worth $%f", itemName, stock.getItemPrice(itemName)));
    }

    public void totalCost() {
        //Totals all item costs together
        System.out.println(String.format("The Total Worth of Stock Currently is: $%f", stock.total() ) );
    }
    public void removeItem(String itemToRemove) {
        //Usees find item to remove item from allstock
        stock.removeItem(itemToRemove);
    }

    public void sellItem(String itemName) {
        //This gets the  item the user wishes to sell and finds the price, adds it to the total bank account. Once the item has been removed a new balance is printed out
      //Sets bank account
       storeManager.setBankAccout(storeManager.getBankAccout() + stock.findItem(itemName).getPrice());
        System.out.println(itemName + " Was Sold At the price of $" + stock.findItem(itemName).getPrice() + " Bank Balance is now $" + storeManager.getBankAccout());
        removeItem(itemName);
    }




}