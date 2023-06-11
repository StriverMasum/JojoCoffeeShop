package MiscFunctionsCoffeeShop;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime
{
   public static void displayDateTime(){
       Date date= new Date();
       //System.out.println(date.toString());            //this one prints in a default manner
       String out1="hh:mm a",out2="dd-MMMMM, yyyy";
       SimpleDateFormat obj1=new SimpleDateFormat(out1);
       SimpleDateFormat obj2=new SimpleDateFormat(out2);
       System.out.println("It's "+obj1.format(date)+" on "+obj2.format(date)); 
   }
}
