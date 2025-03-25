
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bat extends Weapon{
    String material;
    boolean spikes;
    
    public Bat(){
        super("Bat", "Offense", "Melee Weapon With Good Potential", "Melee", 20, 40);
        material = "Wood";
        spikes = false;
    }
    
    public void upgrade(){
        if (uses == 0){
            System.out.println("You Can't Upgrade Air!");
            return;
        }
        if (material == "Wood"){
            material = "Metal";
            System.out.println("You Now Have a Metal Bat!");
            uses += 3;
            maxDamage += 30;
            System.out.println("3 More Uses and 30 Greater Maximum Damage!");
        } else if (spikes == false){
            spikes = true;
            System.out.println("You Now Have a Spiked Bat!");
            uses += 2;
            maxDamage += 80;
            System.out.println("2 More Uses and 80 Greater Maximum Damage!");
        } else{
            System.out.println("Its Already Spiked");
        }
    }
}
