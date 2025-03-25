
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bow extends Weapon{
    static String[] types = {"Regular", "Golden", "Fire", "Explosive", "Poisoned"};
    String arrowType;
    int level;
    
    public Bow(){
        super("Bow", "Offese", "Range Weapon With Great Durability, Low Damage", "Range", 30, 25);
        arrowType = "Regular";
        level = 1;
    }
    
    public void upgradeArrows(){
        if (uses == 0){
            System.out.println("You Can't Upgrade Air!");
            return;
        }
        if (level > 4){
            System.out.println("Its Already Poisoned");
            return;
        }
        arrowType = types[level];
        level++;
        maxDamage += 10;
        System.out.println("You Now Have " + arrowType + " Arrows Which is Level " + level);
        System.out.println("10 Greater Maximum Damage!");
    }
}
