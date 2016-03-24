/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;


import util.ParseCode;

/**
 *
 * @author pupil
 */
public abstract class Person {
    private String name;
    private String surname;
    private String code;
    private int age;
    private String birthday;
    private int year;
    private int day;
    private String month;
    private String gender;
    public Person(){};

    public Person(String name, String surname, String code){
        setName(name);
        setSurname(surname);
        setCode(code);
        setYear(year);
        setDay(day);
        setMonth(month);
        setBirthday(birthday);
        setAge(age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setCode(String code) throws ParseException {
        ParseCode cd=new ParseCode(code);
        
        this.code = code;
        this.gender=cd.getGender();
        this.day=cd.getDay();
        this.month=cd.getYear();
        this.age=cd.getAge();
        this.birthday=cd.getBirthday();
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

  

    
}
