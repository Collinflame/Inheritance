
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bread extends Food{    
    boolean rotten;
    
    public Bread(){
        super("Bread", "Consumable", "The Ideal Food", "Food", false, true);
        rotten = false;
    }
    
    public void eat(){
        int numb = (int)(Math.random()*20 + 1);
        System.out.println("You Have a 5% Shot of Eating Rotten Bread!");
        if (numb == 1){
            rotten = true;
            System.out.println("You Get Sick and Die From Rotten Bread!");
        } else{
            System.out.println("You Eat Some Bread!");
        }
        }
    }
