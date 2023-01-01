import java.io.*;

class MB extends Option
{
    /**
     * Constructor for objects of class MB
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
    public MB(Option old)
    {
        this.old=old;
        this.menuName="Mercedes Benz";
        this.secondLine="choose your model";
        this.item=new String[]{"A Class","C Class", "E Class", "S Class"};
        this.price=new int[]{15000,20000,25000,30000};
        
        this.menu();
    }

    @Override
    public void nextChoice()
    {
        new MBEngine(this);
    }    
}