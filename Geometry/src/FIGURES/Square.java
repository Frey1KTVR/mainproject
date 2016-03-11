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
import Interface.ToRead;
public class Square implements ToRead {
    int side;

    public Square(int side){    
        this.side=side;     
    }
    public void toRead(){
        System.out.printf("Square square is : "+side*side+"%n");
    }
}
