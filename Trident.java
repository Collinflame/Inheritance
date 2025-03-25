
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trident extends Weapon{
    boolean enchanted;
    
    public Trident(){
        super("Trident", "Offense", "Range Weapon With Great Damage, Low Durability", "Range", 10, 60);
        enchanted = false;
    }
    
    public void enchantTrident(){
        if (uses == 0){
            System.out.println("You Can't Upgrade Air!");
            return;
        }
        if (enchanted == true){
            System.out.println("Its Already Enchanted");
            return;
        }
        int chance = (int)(Math.random()*10 + 1);
        System.out.println("You Have a 10% Shot to Enchant Your Trident!");
        if (chance == 1){
            enchanted = true;
            uses += 10;
            maxDamage += 60;
            System.out.println("You Got 10 More Uses and Double the Max Damage!");
        } else{
            System.out.println("Failure!");
        }
    }
}
