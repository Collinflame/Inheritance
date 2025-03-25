
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chestplate extends Armor{
    static String[] materials = {"Leather", "Chain", "Iron", "Gold", "Diamond"};
    String material;
    int level;
    
    public Chestplate(){
        super("Chestplate", "Defense", "Protects the Chest, Maximum Protection", true, 300, 100);
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
        maxProtection += 50;
        System.out.println("You Now Have a " + material + " Chestplate Which is Level " + level);
        System.out.println("You Gain 50 Potential Protection!");
    }
}
