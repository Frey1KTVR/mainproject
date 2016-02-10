
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class game {
    private static Object sccanner;
    public static void main(String[] args) {
        Random random=new Random();
        int mynumber= random.nextInt(15-10+1)+10;
        
        
        System.out.println("задуманно число от 10 до 15, угадай!");
        System.out.println("Утебя 3 попытки:");
        
       
        
        
        for (int z=1;z<4;z++){
            System.out.printf("Попытка номер %d%n",z);
            Scanner sc= new Scanner(System.in);
            int number=sc.nextInt();
            if(number==mynumber){
            System.out.println("You win!");
            break;
            }
            else if(z!=3){
            System.out.println("Incorrect, try again");
            }
        }
        System.out.printf("GAME OVER! The number was: %d%n",mynumber);
        
    }    
}   
    
