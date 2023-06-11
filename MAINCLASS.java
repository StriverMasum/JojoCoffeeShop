import MiscFunctionsCoffeeShop.DateTime;
import MiscFunctionsCoffeeShop.Clear;
import MiscFunctionsCoffeeShop.Messages;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MAINCLASS
{
    //Welcome Greeting Method
    public static void welcomeGreet(){
        System.out.println("+=======================================+");
        System.out.println("|   !!WELCOME TO JOJO'S COFFEE SHOP!!   |");
        System.out.println("+=======================================+");
    }
    public static void pause(){
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
    }
    public static void sleep(int sec){
        try{
           Thread.currentThread().sleep(sec*1000); 
        }
        catch(InterruptedException e){
            System.out.println("ERROR IN SLEEP METHOD!");
        }
    }
    public static int getIntInRange(int i,int j){
        boolean flag = true;
        int num = 0;
        Scanner in = new Scanner(System.in);
        start:
        while(flag){
            try{
                num = in.nextInt();
            }
            catch(InputMismatchException e){
               System.out.println("YOU ENTERED AN INCOMPATIBLE INPUT!");
               sleep(1);
               break start;
            }
            if(num>=i && num<=j){
                flag = false;
            }
            else{
                System.out.print("\nINVALID INPUT!\nTRY AGAIN : ");
            }
        }
        return num;
    }
    //MAIN METHOD!!!!!
    public static void main(String[] args)
    {
        boolean mainFlag = true;
        
        while(mainFlag){
            Clear.clearScreen();
            welcomeGreet();
            MainMenu mainMenuObj = new MainMenu();
            mainMenuObj.showMenu();
            int i = getIntInRange(1,3);
            if(i == 1){
                Clear.clearScreen();
                SubMenu subMenuObj = new SubMenu();
                subMenuObj.showMenu();
                System.out.println("ENTER ORDER : ");
                int j = getIntInRange(1,7); //ITEM CODE
                if(j == 7){
                    System.out.println("NO ITEM ORDERED!");
                    System.out.println("\nPress any character and then enter to return to the Main Menu!");
                    pause();
                }
                else{
                    System.out.println("ENTER QUANTITY(1-100): ");
                    int k = getIntInRange(1,100); //ITEM QUANTITY
                    CustomerOrder newOrder = new CustomerOrder(j,k);
                    double billAmount = newOrder.processOrder();
                    Clear.clearScreen();
                    System.out.println("TOTAL BILL AMOUNT = $"+billAmount);
                    System.out.println("ENJOY YOUR ORDER.");
                    System.out.println("\nPress any character and then enter to return to the Main Menu!");
                    pause();
                }
                
            }
            else if(i == 2){
               Clear.clearScreen();
               DateTime.displayDateTime();
               System.out.println("\nPress any character and then enter to return to the Main Menu!");
               pause();
            }
            else if(i == 3){
                mainFlag = false;    
            }
        }
        Clear.clearScreen();
        Messages.displayQuote();
        Messages.displayAbout();
        System.exit(0);
    
    }
}