
import java.io.*;

/**
 * Write a description of class Honda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Honda extends Option
{
    /**
     * Constructor for objects of class Honda
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
   public Honda(Option old)
    {
        this.old=old;
        this.menuName="Honda";
        this.secondLine="choose your model";
        this.item=new String[]{"Jazz","Civic", "City"};
        this.price=new int[]{10000,14000,18000};
        
        this.menu();
    }

    @Override
    public void nextChoice()
    {
        new HondaEngine(this);
    }    
}
