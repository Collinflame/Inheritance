
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Potion extends Consumable{
    String potionType;
    
    public Potion(String name, String type, String description, String consumableType, boolean needsHeat, String potionType){
        super(name, "Consumable", description, "Potion", needsHeat);
        this.potionType = potionType;
    }
    
    public void createDuplicate(){
        System.out.println("You Attempt to Create a Duplicate Potion!");
        if (needsHeat == false){
            System.out.println("You Perfectly Created a Duplicate!");
        } else{
            System.out.println("You Forgot the Heat and It Exploded!");
        }
    }
}
