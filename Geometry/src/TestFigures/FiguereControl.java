/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFigures;
import Interface.ToRead;
import FIGURES.Circle;
import FIGURES.Rectangle;
import FIGURES.Square;
import FIGURES.Triangle;



/**
 *
 * @author pupil
 */
public class FiguereControl {
    public static void main(String[] args){
        Triangle trian=new Triangle(4,7);
        trian.toRead();
        Circle cir=new Circle(3);
        cir.toRead();
        Rectangle rectan=new Rectangle(3,7);
        rectan.toRead();
        Square sqr=new Square(10);
        sqr.toRead();
        
    }

    
}
