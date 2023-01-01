import java.io.*;

/**
 * Write a description of class Color here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Color extends Option
{
    /**
     * Constructor for objects of class Color
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
    public Color(Option old)
    {
        this.old=old;
        this.menuName="Color";
        this.secondLine="please choose a color";
        this.item=new String[]{"black", "white", "yellow", "green", "red",
                            "blue", "metallic"};
        this.price=new int[]{0,100,200,200,200,200,200};
                
        this.menu();

    }

    @Override
    public void nextChoice()
    {
        if(this.choice>=0 && this.choice<this.item.length)
        {
            new Bill(this);
        }
    }
}
