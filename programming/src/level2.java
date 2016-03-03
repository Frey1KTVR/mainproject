import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Test #2
 */
public class level2 {
    
    
    public static void main(String[] args) {
        while (true){
        Random random=new Random();
        System.out.println("Input the lowest number from witch you will start guessing:");
        Scanner sca=new Scanner(System.in);
        int from=sca.nextInt();
        System.out.println("now the highest number:");
        Scanner scan=new Scanner(System.in);
        int to=scan.nextInt();
        int mynumber= random.nextInt(to-from+1)+from;
        int number;
        System.out.println("задуманно число от "+from+" до "+to+", угадай!");
        System.out.println("У тебя 3 попытки:");
        System.out.println("To exit, please input 'q' and press 'ENTER'.");
        for (int z=1;z<4;z++){
            System.out.printf("Попытка номер %d%n",z);
            Scanner sc= new Scanner(System.in);
            String youString = sc.next();
            String q="q";
            if(youString.equals(q)){
                break;
            }
            if(isNumString(youString)){
                number=Integer.parseInt(youString);
            if(number<from || number>to){
                System.out.println("Please, be careful. Enter number from requested "+from+" to "+to);
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
            else{
                System.out.println("Please, use numbers only!");
                z--;
            }
        }
        System.out.printf("GAME OVER! The number was: %d%n",mynumber);
       
        
        
        }
//        Scanner sp = new Scanner(System.in);
//        String quit=sp.next(); 
//        String q="q";
//        if(quit.equals(q)){
//         
//        }
    }
    static boolean isNumString(String S){
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(S);
        return m.matches();
    }
}   