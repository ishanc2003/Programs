

import java.io.*;


/**
 * Write a description of class ToyotaEngine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HondaEngine extends Option
{
    /**
     * Constructor for objects of class HondaEngine
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
    public HondaEngine(Option old)
    {
        this.old=old;
        this.menuName="Honda Engine";
        this.secondLine="please choose your engine";
        this.item=new String[]{"1.0i-TEC", "1.3i-TEC", "1.6i-DTEC",
            "1.5i-VTEC TURBO CVT", "2.0 VTEC Turbo"};
        this.price=new int[]{8000,10000,12000,15000,18000};
                
        this.menu();
    }
    
    @Override
    public void nextChoice()
    {
        if(this.choice>=0 && this.choice<this.item.length)
        {
            new Color(this);
        }
     }
}
