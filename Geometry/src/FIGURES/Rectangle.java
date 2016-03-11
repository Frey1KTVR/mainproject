/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIGURES;



/**
 *
 * @author pupil
 */
public class Rectangle {
    int a;
    int b;
    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void toRead(){
        System.out.println("Rectangle square is : "+a*b);
    }
}

