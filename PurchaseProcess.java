import java.io.*;

/**
 * Write a description of class PurchaseProcess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PurchaseProcess extends Option
{
    /**
     * Constructor for objects of class PurchaseProcess
     * no parameter because this is always the second object created, start
     * of users choice history, and the first IshansCarShop object does not
     * create any choice history element
    */
    public PurchaseProcess()
    {
        this.old=null;
        this.welcome=null;
        this.menuName="Ishan's Car Shop";
        this.secondLine="please choose the manufacturer";
        this.item=new String[]{"Tesla","Mercedes Benz", "Honda"};
        this.price=new int[]{0,0,0};
        
        this.menu();
    }

    @Override
    public void nextChoice()
    {
        switch(this.choice)
        {
            case 0: new Tesla(this); break;
            case 1: new MB(this); break;
            case 2: new Honda(this); break;
            case 6: Option.clearScreen();
                    System.exit(0);
        }
    }
}
