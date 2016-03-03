
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pupil
 */
public class StringIsNumber {

    private int number;

    private void setNumber() {
        int youNumber;
        String q="q";
        Scanner sc = new Scanner(System.in);
        while (true) {
            String youString = sc.next();
            if(youString.equals(q)){
                youString=404.404;
                return 404.404;
            }
            else if (isNumString(youString)) {
                youNumber = Integer.parseInt(youString);
                break;
            } else {
                System.out.println(" We can use only numbers in this game ");
            }
        }
        this.number=youNumber;
    }
    public int getNumber(){
        setNumber();
        return this.number;
    }

    static boolean isNumString(String S) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(S);

        return m.matches();
    }
}
