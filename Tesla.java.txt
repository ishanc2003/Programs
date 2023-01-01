import java.io.*;

class Tesla extends Option
{
    /**
     * Constructor for objects of class Tesla
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
    public Tesla(Option old)
    {
        this.old=old;
        this.menuName="Tesla";
        this.secondLine="choose your model";
        this.item=new String[]{"Model S","Model X", "Model 3", "Roadster"};
        this.price=new int[]{1000,1500,2000,2500};
        
        this.menu();
    }

    @Override
    public void nextChoice()
    {
        new TeslaWheels(this);
    }    
}