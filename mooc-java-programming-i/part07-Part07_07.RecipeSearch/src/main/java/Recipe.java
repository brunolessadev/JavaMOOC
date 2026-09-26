import java.util.ArrayList;

public class Recipe {

    private String name;
    private int preparationTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int preparationTime, ArrayList<String> ingredients) {
        this.name = name;
        this.preparationTime = preparationTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return name + ", " + "cooking time: " + preparationTime;
    }
}
