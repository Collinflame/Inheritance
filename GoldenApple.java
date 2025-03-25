
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoldenApple extends Food{    
    boolean enchanted;
    
    public GoldenApple(){
        super("Golden Apple", "Consumable", "The Magical Fruit", "Food", false, false);
        enchanted = false;
    }
    
    public void enchant(){
        if (enchanted == false){
            enchanted = true;
            System.out.println("You Now Have an Enchanted Golden Apple!");
        } else{
            System.out.println("Its Already Enchanted");
        }
    }
    
    public void eat(){
        if (enchanted == false){
            System.out.println("You Now Have Superhuman Abilities!");
        } else{
            System.out.println("You Now Have God-Like Abilities");
        }
    }
}
