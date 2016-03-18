/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class Student {
    private String name;
    private String surname;
    private String code;
    private int grade;
    private String group;

    public Student() {
    }

    public Student(String name, String surname, String code, int grade, String group) {
        this.name = name;
        this.surname = surname;
        this.code = code;
        this.grade = grade;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
    public int age(){
        String idString=getCode();
        String yearString=idString.substring(1,3);
        String centuryString = idString.substring(0, 1);
        String mounthString=idString.substring(3, 5);
        String dayString=idString.substring(5, 7);
        Calendar today=Calendar.getInstance();
        

        Calendar dob = Calendar.getInstance();
        
        

        //dob.setTime(birthday);
        // include day of birth
        dob.add(Calendar.DAY_OF_MONTH, -1);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
    }
    return age;

    }


    
   

}
