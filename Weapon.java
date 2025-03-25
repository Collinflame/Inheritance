
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weapon extends Item implements WeaponInterface{
    String weaponType;
    int uses;
    int maxDamage;
    
    public Weapon(String name, String type, String description, String weaponType, int uses, int maxDamage){
        super(name, "Offense", description);
        this.weaponType = weaponType; 
        this.uses = uses;
        this.maxDamage = maxDamage;
    }
        
    public int attack(){
        if (uses == 0){
            System.out.println("You Can't Attack With Air!");
            return 0;
        }
        int damage = (int)(Math.random()*maxDamage + 1);
        System.out.println("You Deal " + damage + " Damage!");
        uses--;
        System.out.println("You Still Have " + uses + " Uses!");
        return damage;
    }
    
    public boolean parry(){
        if (uses == 0){
            System.out.println("You Can't Parry With Air!");
            return false;
        }
        int numb = (int)(Math.random()*2 + 1);
        System.out.println("You Have a 50% Shot to Parry the Attack!");
        if (numb == 1){
            return true;    
        } else{
            return false;
        }
    }
    
    public void getUses(){
        int numb = (int)(Math.random()*5 + 1);
        System.out.println("You Have a 20% Shot to Get More Uses!");
        if (numb == 1){
            uses += 10;
            System.out.println("You Got 10 More Uses!");
        } else{
            System.out.println("Failure!");
        }
    }
}
