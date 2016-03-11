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
public class Triangle{
     int base;
     int height;
     public Triangle(int base,int height){
         this.base=base;
         this.height=height;
         
     }
    public void toRead(){
        System.out.println("Triangle square is : "+(height*base)/2);
    }
}
