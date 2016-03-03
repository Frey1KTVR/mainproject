
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class level3 {
    public static void main(String[] arg){
        int[] Arr= new int[20];
        Random rand=new Random();
        int gen=0;
        for(int j=0;j<Arr.length;j++){
            gen=rand.nextInt(20-1);
            if(gen%2!=0){
                gen*=2;
            }
            Arr[j]=gen;
        }
        
        System.out.println(Arrays.toString(Arr));
        int[] filtredArray=Arr;
        Arrays.sort(filtredArray);
        System.out.println(Arrays.toString(filtredArray));
        int max=filtredArray[19];
        int min=filtredArray[0];
        int indexMin=0;
        int indexMax=19;
        for (int i=0;i<filtredArray.length;i++){
            if(min==filtredArray[i]){
                indexMin+=1;
            }
            if(max==filtredArray[i]){
                indexMax-=1;
            }
        }
        System.out.println(indexMin);
        System.out.println(indexMax);
        int sum=0;
        int avg=0;
        for(int k=indexMin;k<(indexMax+1);k++){
            sum+=filtredArray[k];
            System.out.println(filtredArray[k]+" and "+sum);
            avg+=1;
        }
        int srednee=sum/avg;
        System.out.println(srednee);
    }
    
}
