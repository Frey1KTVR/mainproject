/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class Student extends Person {
    
    private int grade;
    private String group;

    public Student() {
    }

    public Student(int grade, String group,String name, String surname, String code, int age, String birthday, String year, String day, String month) throws ParseException {
        super(name, surname, code, age,  birthday,  year,  day, month);
        this.grade = grade;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

   

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public String toString(){
        return "I am a Student\n\t"+
                "my full name is "+getName()+getSurname()+
                "\nID code: "+getCode()+
                "\nmy age is"+getAge()+
                "\nDate of birth is: "+getBirthday()+
                "\nmy  average grade is 4 "+getGrade()+
                "\nand name of my group is: "+getGroup();
                
    }
    


    
   

}
