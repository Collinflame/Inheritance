
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Helmet extends Armor{
    static String[] materials = {"Leather", "Chain", "Iron", "Gold", "Diamond"};
    String material;
    int level;
    
    public Helmet(){
        super("Helmet", "Defense", "Protects the Head, Great Durability, Weak Protection", true, 600, 25);
        material = "Leather";
        level = 1;
    }
    
    public void upgrade(){
        if (maxProtection <= 0){
            System.out.println("Your Armor Broke!");
            return;
        }
        if (level > 4){
            System.out.println("Its Already Diamond");
            return;
        }
        material = materials[level];
        level++;
        maxProtection += 20;
        durability += 30;
        System.out.println("You Now Have a " + material + " Chestplate Which is Level " + level);
        System.out.println("You Gain 20 Potential Protection and 30 Durability!");
    }
}
