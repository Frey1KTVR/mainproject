/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import util.ParseCode;
import java.text.ParseException;

/**
 *
 * @author pupil
 */
public class mainTEST {
    public static void main(String[] args) throws ParseException{
    ParseCode age=new ParseCode();
    int ag=age.age();
    System.out.println(ag);
    }
}
