package if1.pkg10119023.latihan53.rabbit;
/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program perkenalan kelinci :/
 *
 */
public class IF110119023Latihan53Rabbit {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("Peter",false,"grass",4,"grey");
        String name = r.getName();
        System.out.println("Hello, his name is ".concat(name));
        System.out.println(name.concat(" is Vegetarian? ").concat(String.valueOf(r.isVegetarian())));
        System.out.println(name+" eats "+r.getEats());
        System.out.println(name+" has "+r.getNoOfLegs()+" legs");
        System.out.println(name+" color is "+r.getColor());
    }
}
