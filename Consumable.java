
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Consumable extends Item{
    String consumableType;
    boolean needsHeat;
    
    public Consumable(String name, String type, String description, String consumableType, boolean needsHeat){
        super(name, "Consumable", description);
        this.consumableType = consumableType;
        this.needsHeat = needsHeat;
    }
    
    public String advertisement(){
        return "Get the new " + name + "! " + description + " is all you need in life!";
    }
}
