
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shield extends Armor{
    boolean reinforced;
    boolean enchanted;
    
    public Shield(){
        super("Helmet", "Defense", "The Best All-Around Defense", false, 275, 250);
        reinforced = false;
        enchanted = false;
    }
    
    public void upgrade(){
        if (maxProtection <= 0){
            System.out.println("Your Armor Broke!");
            return;
        }
        if (reinforced == false){
            reinforced = true;
            durability += 100;
            maxProtection += 100;
            System.out.println("You Now Have a Reinforced Shield!");
            System.out.println("You Gain 100 Potential Protection Durability!");
        } else if (enchanted == false){
            enchanted = true;
            durability += 125;
            maxProtection += 125;
            System.out.println("You Now Have an Enchanted Reinforced Shield!");
            System.out.println("You Gain 125 Potential Protection Durability!");
        } else{
            System.out.println("You Already Have an Enchanted Reinforced Shield!");
        }
    }
}
