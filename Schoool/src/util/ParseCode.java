/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static java.lang.Integer.parseInt;
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
    private int year;
    private int day;
    private int month;
    private String century;
    private int age;
    private String birthday;
    
    public ParseCode() {
    }

    public ParseCode(String code) {
        setCode(code);
    }
    
    
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
        //GENDER CENTURY
        //YEAR
        String year=code.substring(1,3);
        
        String gen=code.substring(0,1);
        switch (gen) {
            case "3":{
                setGender("male");
                setYear("19"+year);
                break;
            }
            case "4":{
                setGender("female");
                setYear("19"+year);
                break;
            }
            case "5":{
                setGender("male");
                setYear("20"+year);
                break;
            }
            case "6":{
                setGender("female");
                setYear("20"+year);
                break;
            }
          
        }
//        if(gen.equals("3") || gen.equals("5")){
//            setGender("male");
//        }
//        else if(gen.equals("4")|| gen.equals("6")){
//            setGender("female");
//        }
        
        //DAY
        String da=code.substring(5,7);
        int day=parseInt(da);
        setDay(day);
        //MONTH
        String mont=code.substring(3,5);
        int month=parseInt(mont);
        setMonth(month);
        //AGE
        Calendar today=Calendar.getInstance();
        Calendar dob = Calendar.getInstance();       
//        SimpleDateFormat birth=new SimpleDateFormat("dd/mm/yy");       
//        String birthday=birth.parse(getDay()+'/'+getMonth()+'/'+getYear());
        dob.set(getYear(),getMonth(),getDay());
        //System.out.println("s"+dob+"%n");
        // include day of birth
        dob.add(Calendar.MONTH, -1);
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if ( (today.get(Calendar.DAY_OF_YEAR)) < (dob.get(Calendar.DAY_OF_YEAR))) {
            age=age-1;
        }
        setAge(age);
        //BIRTHDAY
        String birthdayy=getDay()+"."+getMonth()+"."+getCentury()+getYear();
        setBirthday(birthdayy);
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender=gender; 
    }
       
    public int getYear() {
        return year;
    }

    private void setYear(String year) {
        int yea=parseInt(year);
        this.year = yea;
    }

    public int getDay() {
        return day;
    }

    private void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    private void setMonth(int month) {
        this.month = month;
    }
    private void setCentury(String century) {
        this.century=century;
    }
    public String getCentury(){
        return century;
    }

    

    public int getAge(){
          return age;
      }

    private void setAge(int age) {
        
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    private void setBirthday(String birthdayy) {
        
        this.birthday = birthdayy;
    }









    
}

//    public int age () throws ParseException{
//        IsNumber isNumber=new IsNumber();
//        String id;
//        String gen;
//        String gen;
//        while(true){
//        
//        id=isNumber.Code();
//        
//        gen=id.substring(0, 1);
//        
//        System.out.println(gen);
//        
//        
//        if(gen.equals("3") || gen.equals("5")){
//            gen ="male";
//            
//            break;
//        }
//        else if(gen.equals("4")|| gen.equals("6")){
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

  













