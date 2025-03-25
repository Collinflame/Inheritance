
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HealingPotion extends Potion{    
    int maxHeals;
    
    public HealingPotion(){
        super("Healing Potion", "Consumable", "Drink to Heal Yourself", "Potion", false, "Defense");
        maxHeals = 45;
    }
    
    public void drink(){
        int heals = (int)(Math.random()*maxHeals + 1);
        System.out.println("You Drank the Potion and Gained " + heals + " Health!");
        }
    }
