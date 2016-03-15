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
    private void setCode(String code) {
        this.code = code;
        //GENDER CENTURY
        
        String gen=code.substring(0,1);
        switch (gen) {
            case "3":{
                setGender("male");
                setCentury("19");
                break;
            }
            case "4":{
                setGender("female");
                setCentury("19");
                break;
            }
            case "5":{
                setGender("male");
                setCentury("20");
                break;
            }
            case "6":{
                setGender("female");
                setCentury("20");
                break;
            }
            default:
                throw new AssertionError();
        }
        if(gen.equals("3") || gen.equals("5")){
            setGender("male");
        }
        else if(gen.equals("4")|| gen.equals("6")){
            setGender("female");
        }
        //YEAR
        String year=code.substring(1,3);
        setYear(year);
        //DAY
        String day=code.substring(5,7);
        setDay(day);
        //MONTH
        String month=code.substring(3,5);
        setMonth(month);
        
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
    private void setCentury(String century) {
        this.century=century;
    }
    public String getCentury(){
        return century;
    }

    

    public int getAge(){
          return age;
      }

    private void setAge() throws ParseException {
        String id=getCode();
        
        Calendar today=Calendar.getInstance();
        Calendar dob = Calendar.getInstance();       
        SimpleDateFormat birth=new SimpleDateFormat("dd/mm/yy");       
        Date birthday=birth.parse(getDay()+'/'+getMonth()+'/'+getYear());
        dob.setTime(birthday);
        //System.out.println("s"+dob+"%n");
        // include day of birth
        dob.add(Calendar.MONTH, -1);
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if ( (today.get(Calendar.DAY_OF_YEAR)) < (dob.get(Calendar.DAY_OF_YEAR))) {
            age=age-1;
        }
        
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    private void setBirthday(String birthday) {
        birthday=getDay()+"."+getMonth()+"."+getCentury()+getYear();
        this.birthday = birthday;
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

  













