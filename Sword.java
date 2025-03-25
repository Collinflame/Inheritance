
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sword extends Weapon{
    static String[] materials = {"Wood", "Stone", "Iron", "Gold", "Diamond"};
    String material;
    int level;
    
    public Sword(){
        super("Sword", "Offense", "Melee Weapon with Good Durability", "Melee", 15, 100);
        material = "Wood";
        level = 1;
    }
    
    public void upgrade(){
        if (uses == 0){
            System.out.println("You Can't Upgrade Air!");
            return;
        }
        if (level > 4){
            System.out.println("Its Already Diamond");
            return;
        }
        material = materials[level];
        level++;
        uses += 3;
        maxDamage += 10;
        System.out.println("You Now Have a " + material + " Sword Which is Level " + level);
        System.out.println("3 More Uses and 10 Greater Maximum Damage!");
    }
}
