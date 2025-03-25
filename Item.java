
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    String name;
    String type;
    String description;
    
    public Item(String name, String type, String description){
        this.name = name;
        this.type = type;
        this.description = description;
    }
    
    public String getName(){
        return name;
    }
}
