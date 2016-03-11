/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author pupil
 */
public class Age {
    
    public int age () throws ParseException{
        Code idc=new Code();
        String id=idc.Code();
        
        String yearString=id.substring(1,3);
        String centuryString = id.substring(0, 1);
        String mounthString=id.substring(3, 5);
        String dayString=id.substring(5, 7);
        Calendar today=Calendar.getInstance();
        

        Calendar dob = Calendar.getInstance();
        SimpleDateFormat birth=new SimpleDateFormat("dd/mm/yy");
        Date birthday=birth.parse(dayString+'/'+mounthString+'/'+yearString);
        

        dob.setTime(birthday);
        // include day of birth
        dob.add(Calendar.DAY_OF_MONTH, -1);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
    }
        return age;
        
}
}
