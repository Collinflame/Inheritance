
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Armor extends Item implements DefenseCommands{
    boolean wearable;
    int durability;
    int maxProtection;
    
    public Armor(String name, String type, String description, boolean wearable, int durability, int maxProtection){
        super(name, "Defense", description);
        this.wearable = wearable;
        this.durability = durability;
        this.maxProtection = maxProtection;
    }
    
    
    public boolean blocked(){
        if (durability <= 0){
            System.out.println("Your Armor Broke!");
            return false;
        }
        int chance = (int)(Math.random()*2 + 1);
        System.out.println("You Have a 50% Shot to Block With Your Armor!");
        if (chance == 1){  
            int damage = (int)(Math.random()*maxProtection + 1);
            System.out.println("You Blocked " + damage + " Damage!");
            return true;
        } else{
            int damage = (int)(Math.random()*maxProtection + 1);
            durability-= damage;
            System.out.println("You Armor Didn't Block it and Took " + damage + " Damage!");
            if (durability > 0){
                System.out.println("You Armor Can Still Take " + durability + " Damage!");
            } else{
                System.out.println("Your Armor Broke!");
                durability = 0;
            }
            return false;
        }
    }
    
    public void fixArmor(){
        int numb = (int)(Math.random()*3 + 1);
        System.out.println("You Have a 33% Shot to Fix Your Armor!");
        if (numb == 1){
            durability += 200;
            System.out.println("You Can Take 200 More Damage!");
        } else{
            System.out.println("Failure!");
        }
    }
}
