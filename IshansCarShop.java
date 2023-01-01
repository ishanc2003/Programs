import java.io.*;

class IshansCarShop extends Option
{    
    /**
     * Constructor for objects of class IshansCarShop
     * no parameter since this is always the first object in the history
    */
    public IshansCarShop()
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);

        this.old=null;
        this.welcome="Welcome to Ishan's Car Shop";
        this.welcomeFile="car.txt";
        this.menuName="Welcome to Ishan's Car Shop";
        this.secondLine="Please enter your name";
        
        this.welcome();
        this.nextChoice();
    }
    
    @Override
    public void nextChoice()
    {
        while(this.state==0)
        {
            Option.clearScreen();
            
            System.out.println("LOGIN");
            System.out.println("Please enter your name");
            
            try
            {
                customer=br.readLine();
            }
            catch(Exception e)
            {
                System.exit(1);
            }
            
            new PurchaseProcess();
            
            if(state==1)
            {
                state=0;
                this.nextChoice();
            }
         }
    }
    
    /**
     * main
     * starts the application. main loop
     */
    public static void main() throws IOException
    {
        IshansCarShop shop=new IshansCarShop();
        
        int state=shop.state();
        
        while(state<2)
        {
            shop.nextChoice();
            state=shop.state();
        }
    }
}