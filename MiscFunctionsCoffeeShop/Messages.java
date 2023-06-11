package MiscFunctionsCoffeeShop;
import javax.swing.JOptionPane;
public class Messages
{
    public static void displayAbout(){
      String msg = "PROJECT BY : \nMohd Shakeeb(130)\nPriyanka Bhagat(147)\nKomal Tikoo(203)\nOusama Bin Zamir(253)\nHarsimran Kour(321)\nEkta Sharma(LES 263)";
      JOptionPane.showMessageDialog(null,msg,"ABOUT",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void displayFinalGreet(){
      String msg = "THANKS FOR VISITING!\nHAVE A PLEASANT DAY!";
      JOptionPane.showMessageDialog(null,msg,"JOJO'S COFFEE SHOP",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void displayQuote(){
      String[] quote = {
          "'It may be difficult, but it will be worth it in the end.'",
          "'No snowflake in an avalanche ever feels responsible.'",
          "'Don't worry about money.\nThe best things in life are free.'",
          "'A ship is safe at harbour, but that's not what it's built for.'",
          "'Who are you?'",
          "'Obstacles don't block the path.\nThey are the path.'",
          "'Just peel the potatoes.'",
          "'Man stands in his own shadow and wonders why it's dark.'",
          "'If you only do whay you can, you will never be more that what you are now.'",
          "'Yesterday is history, tomorrow is mystery, but today is a gift.\nThat's why it's called the present.'"
      };
      int randomNum = (int)(Math.random()*10);
      JOptionPane.showMessageDialog(null,quote[randomNum],"THANKS FOR THE VISIT!",JOptionPane.INFORMATION_MESSAGE);
    }
}
