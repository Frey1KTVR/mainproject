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
public class Administrator extends Person {
    
    private double salary;
    private String rank;
    public Administrator(){};
    public Administrator(double salary, String rank, String name, String surname, String code) throws ParseException {
        super(name, surname, code);
        setSalary(salary);
        setRank(rank);
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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
