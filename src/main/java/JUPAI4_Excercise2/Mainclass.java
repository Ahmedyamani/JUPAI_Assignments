/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUPAI4_Excercise2;

import java.util.function.BiPredicate;

/**
 *
 * @author Ahmed yamani
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String a="HEY";
         String b="Hello";
         String longer= stringutlis.isbetter(a, b, (st1,st2)->st1.length()>st2.length());
         System.out.println(longer);
         System.out.println(stringutlis.isletter("yo1"));
         
    }

    
    
}
