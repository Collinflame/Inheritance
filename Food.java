
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food extends Consumable{
    boolean canExpire;
    
    public Food(String name, String type, String description, String consumableType, boolean needsHeat, boolean canExpire){
        super(name, "Consumable", description, "Food", needsHeat);
        this.canExpire = canExpire;
    }
    
    public void poisonFood(){
        System.out.println("You Attempt to Poison Someone!");
        int numb = (int)(Math.random()*5 + 1);
        if (numb == 1){
            System.out.println("You Accidentally ate the Poisoned Food and Died!");
        } else{
            System.out.println("You Successfully Posioned the Person!");
        }
    }
}
