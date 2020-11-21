package if1.pkg10119023.latihan53.rabbit;

public class Rabbit extends Animal{
    private String color,name;

    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String getName(){
        return name;
    }
}
