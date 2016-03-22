/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import java.text.ParseException;

/**
 *
 * @author pupil
 */
public class Administration extends Person {
    
    private int salary;
    private String rank;
    public Administration(){};
    public Administration(int salary, String rank, String name, String surname, String code, int age, String birthday, String year, String day, String month) throws ParseException {
        super(name, surname, code, age,  birthday,  year,  day, month);
        setSalary(salary);
        setRank(rank);
        
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public String toString(){
        return "I am a Administrator\n\t"+
                "my full name is "+getName()+getSurname()+
                "\nID code: "+getCode()+
                "\nmy age is"+getAge()+
                "\nDate of birth is: "+getBirthday()+
                "\nmy  average salary is: "+getSalary()+
                "\nand name of my group is: "+getRank();
    
}
}
