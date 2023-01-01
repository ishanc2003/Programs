import java.io.*;

/**
 * Write a description of class TeslaWheels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeslaWheels extends Option
{
    /**
     * Constructor for objects of class TeslaWheels
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
     
    public TeslaWheels(Option old)
    {
        this.old=old;
        this.menuName="Tesla-Wheels";
        this.secondLine="please choose your set of wheels";
        this.item=new String[]{"15 inches","19 inches", "21 inches"};
        this.price=new int[]{8000,12000,15000};
                
        this.menu();

    }
    
    @Override
    public void nextChoice()
    {
        if(this.choice>=0 && this.choice<this.item.length)
        {
            new TeslaBattery(this);
        }
     }
}
