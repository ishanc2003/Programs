import java.io.*;

/**
 * Write a description of class MBEngine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MBEngine extends Option
{
     /**
     * Constructor for objects of class MBEngine
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
    public MBEngine(Option old)
    {
        this.old=old;
        this.menuName="MB Engine";
        this.secondLine="please choose your engine";
        this.item=new String[]{"180", "200", "220", "350", "500", "6.9"};
        this.price=new int[]{10000,12000,15000,30000,50000,80000};
                
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
