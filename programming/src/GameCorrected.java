
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
Test #2
 */
public class GameCorrected {
    
    public static void main(String[] args) {
        Random random=new Random();
        int mynumber= random.nextInt(15-10+1)+10;
        int number;
        String q="q";
        System.out.println("задуманно число от 10 до 15, угадай!");
        System.out.println("У тебя 3 попытки:");
        
       
        
        
        for (int z=1;z<4;z++){
            System.out.printf("Попытка номер %d%n",z);
            
            StringIsNumber strint=new StringIsNumber();
            number=strint.getNumber();
            
            if(number.equals(q)){
            }
            if(number<10 || number>15){
                System.out.println("Please, be careful. Enter number from requested 10 to 15 ");
                z--;
            }
            
            else{
            if(number==mynumber){
            System.out.println("You win!");
            break;
            }
            else if(z!=3){
            System.out.println("Incorrect, try again");
            }
            }
            
            
    
        }
        System.out.printf("GAME OVER! The number was: %d%n",mynumber);
        
    }
}
    
   
    
