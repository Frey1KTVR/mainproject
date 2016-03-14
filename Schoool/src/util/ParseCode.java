/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author pupil
 */
public class ParseCode {
    private String code;
    private String gender;
    private String year;
    private String day;
    private String month;
    
    public ParseCode() {
    }

    public ParseCode(String code) {
        setCode(code);
    }
    
    private String getCode() {
        return code;
    }

    private void setCode(String code) {
        this.code = code;
        //GENDER
        String a=code.substring(0,1);
        
        if(a.equals("3") || a.equals("5")){
            setGender("male");
        }
        else if(a.equals("4")|| a.equals("6")){
            setGender("female");
        }
        //
        
        
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
      this.gender=gender; 
    }
       

    public String getYear() {
        return year;
    }

    private void setYear(String year) {
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    private void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    private void setMonth(String month) {
        this.month = month;
    }












//    public int age () throws ParseException{
//        IsNumber isNumber=new IsNumber();
//        String id;
//        String a;
//        String gen;
//        while(true){
//        
//        id=isNumber.Code();
//        
//        a=id.substring(0, 1);
//        
//        System.out.println(a);
//        
//        
//        if(a.equals("3") || a.equals("5")){
//            gen ="male";
//            
//            break;
//        }
//        else if(a.equals("4")|| a.equals("6")){
//            gen ="female";
//            break;
//        }
//        else{
//        System.out.println("First symbol must be 3,4,5 or 6 ");
//        }
//        }
//        
//        String yearString=id.substring(1,3);
//        String mounthString=id.substring(3, 5);
//        String dayString=id.substring(5, 7);
//        Calendar today=Calendar.getInstance();
//        
//
//        Calendar dob = Calendar.getInstance();
//        
//        SimpleDateFormat birth=new SimpleDateFormat("dd/mm/yy");
//        
//        Date birthday=birth.parse(dayString+'/'+mounthString+'/'+yearString);
//        
//
//        dob.setTime(birthday);
//        
//        //System.out.println("s"+dob+"%n");
//        
//        // include day of birth
//        dob.add(Calendar.MONTH, -1);
//
//        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
//        
//        if ( (today.get(Calendar.DAY_OF_YEAR)) < (dob.get(Calendar.DAY_OF_YEAR))) {
//            age=age-1;
//        }
//        
//        return age;
//        
//}
}















