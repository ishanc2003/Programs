
/**
 * Write a description of class TeslaBattery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeslaBattery extends Option
{
    /**
     * Constructor for objects of class TeslaBattery
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
    public TeslaBattery(Option old)
    {
        this.old=old;
        this.menuName="Tesla-Battery";
        this.secondLine="please choose your battery";
        this.item=new String[]{"75D->269 mi range", "P100D->325 mi range"};
        this.price=new int[]{70000,135000};
                
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
