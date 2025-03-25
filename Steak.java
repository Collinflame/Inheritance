
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Steak extends Food{    
    int cooked;
    boolean rotten;
    
    public Steak(){
        super("Steak", "Consumable", "Protein From a Cow", "Food", true, true);
        cooked = 0;
        rotten = false;
    }
    
    public void cookSteak(){
        if (cooked == 0){
            cooked++;
            System.out.println("You Now Have a Perfect Steak!");
        } else if (cooked == 1){
            cooked++;
            System.out.println("You Already Cooked the Steak!");
            System.out.println("Now the Steak is Burnt!");
        } else{
            System.out.println("You Already Have Burnt Steak!");
        }
    }
    
    public void eat(){
        int numb = (int)(Math.random()*10 + 1);
        System.out.println("You Have a 10% Shot of Eating a Rotten Steak!");
        if (numb == 1){
            rotten = true;
            System.out.println("You Get Sick and Die From Rotten Steak!");
        } else if (cooked == 0){
            System.out.println("You Get Sick and Die From Uncooked Steak!");
        } else if (cooked == 1){
            System.out.println("You Enjoy a Nice Steak!");
        } else{
            System.out.println("You Get Sick and Die From Burnt Steak!");
        }
        }
    }
