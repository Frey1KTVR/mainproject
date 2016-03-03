
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
public class level1 {
    public static void main(String[] args){
        System.out.println("Input 4-digits number:");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int thousand,hundred,dozen,units;
        thousand=number/1000;
        hundred=number%1000/100;
        System.out.println("There is "+hundred+" hundreds;");
        dozen=number%100/10;
        System.out.println(dozen+" dozens;");
        units=number%10;
        System.out.println("and "+units+" units in number - "+number);
        int sum=thousand+hundred+dozen+units;
        System.out.println("In summary of those you get "+sum);
        
    }
}

