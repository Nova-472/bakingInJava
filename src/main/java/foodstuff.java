import java.util.List;
import  java.math.BigDecimal; //use bigDecimal in the math libery so it wont complane

public class foodstuff {
    //Properties
    private String foodType;
    private String ingredients;
    private BigDecimal price;
    private String itemName;
    private boolean soldStatus;

    //Constructors, for creating new food item object. uses methods to check if the value is valid

    public foodstuff(String foodType, String ingredients, BigDecimal price, String itemName) {
        setFoodType(foodType);
        setIngredients(ingredients);
        setPrice(price);
        this.soldStatus = false; //when an item is created it has not been sold yet. (item sold status is changed in stock manager)
        this.itemName = itemName;
    }

    private void setFoodType(String foodType) {
        if(foodType == "") {
            this.foodType = "Miscellaneous";
        } else {
            this.foodType = foodType;
        }
    }

    private void setIngredients(String ingredients) {
        if(ingredients == "") {
            this.ingredients = "No ingredients Data";
        } else {
            this.ingredients = ingredients;
        }
    }
    private void setPrice(BigDecimal price){
        if(price == null){}
    }



    //Methods


}
