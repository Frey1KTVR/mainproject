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
public class Circle {
    int radius;

    
    public Circle(int radius){
        
        this.radius=radius;
         
         
    }
    public void toRead(){
        System.out.printf("Circle square is : "+radius*radius*Math.PI+"%n");
    }
}