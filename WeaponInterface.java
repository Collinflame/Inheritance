
/**
 * Methods for all weapons
 * 
 * @author Wiebe 
 * @version 1.2
 */
public interface WeaponInterface
{
    /**
     * Attacks an Enemy for an Amount
     * Returns Amount of Damage Dealt
     */
    int attack();
    /**
     * Attemps to Parry an Attack
     * Returns if Parry was Successful
     */
    boolean parry();
    
}
