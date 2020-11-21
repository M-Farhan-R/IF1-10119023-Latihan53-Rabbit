package if1.pkg10119023.latihan53.rabbit;

public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        eats = food;
        noOfLegs = legs;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats(){
        return eats;
    }

    public int getNoOfLegs(){
        return noOfLegs;
    }
}
