import java.io.*;

/**
 * Write a description of class Bill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bill extends Option
{
    /**
     * Constructor for objects of class Bill
     * 
     * @param  old  the Option object prior to this one
     *              and thus the chain of taken options
    */
    public Bill(Option old)
    {
        this.old=old;
        this.menuName="Car Configuration completed!";
        this.secondLine="do you want to";
        this.item=new String[]{"confirm and print bill"};
        this.price=new int[]{0};
        
        this.menu();
        System.out.println("\t\t\t\t\t\tstate="+this.state);
    }
    
    @Override
    public void nextChoice()
    {
        int ch=0;
        
        if(this.choice==0)
        {
            clearScreen();
            
            System.out.println("\n\n\n\n\n\t\t\t\t\t\t\tISHAN'S CAR SHOP");
            System.out.println("\n\t\t\t\t\t\tcustomer:\t "+(customer.length()>20?customer.substring(0,20):customer));
            int sum=old.write(false);
            System.out.println("\t\t\t\t\t\t============================================");
            System.out.printf("\t\t\t\t\t\t%32s   $%10.2f%n","->",(double)sum);
            System.out.printf("\t\t\t\t\t\t%32s   $%10.2f%n","29% GST",0.29*(double)sum);
            System.out.println("\t\t\t\t\t\t============================================");
            System.out.printf("\t\t\t\t\t\t%32s   $%10.2f%n","->",1.29*(double)sum);
            System.out.println("\t\t\t\t\t\tthank you for your order!");
            System.out.println("\n\n\n\n\n\t\t\t\t\tenter 1 to log out and re start the Car Configurator");
            System.out.println("\t\t\t\t\tenter any other number to terminate program");
            
            while(ch<1)
                ch=this.getNum();
            
            // if any other than number one is chosen, terminate application
            if(ch!=1)
                System.exit(0);
            
            // set application state to 1 (=> return to start) 
            this.state=1;
        }
        else
            // bill not requested, normal return to previous level
            this.state=0;
    }
}
