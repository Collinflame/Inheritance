
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DamagePotion extends Potion{    
    int maxDamage;
    
    public DamagePotion(){
        super("Damage Potion", "Consumable", "Drink to Feel Pain", "Potion", true, "Offense");
        maxDamage = 100;
    }
    
    public void drink(){
        System.out.println("You Attempt to Get Someone to Drink the Damage Potion");
        int numb = (int)(Math.random()*5 + 1);
        int damage = (int)(Math.random()*maxDamage + 1);
        if (numb == 1){
            System.out.println("You Accidentally Drank the Potion and Lost " + damage + " Health!");
        } else{
            System.out.println("You Successfully Harmed the Person!");
        }
        }
    }
