
package menu;

/**
 *
 * @author NaeemFranks
 */
public class VegetarianMenu extends Menu2
{
    String[] vegEntreeChoice = {"Spinach Lasagna", "Cheese Enchiladas", "Fruite Plate"};
    
    public VegetarianMenu()
    {
        super();
        for(int x = 0; x < vegEntreeChoice.length; ++x)
            entreeChoice[x] = vegEntreeChoice[x]; 
    }
}
