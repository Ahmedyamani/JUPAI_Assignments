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
public class stringutlis {
    static String isbetter(String a,String b,BiPredicate<String,String> c){
        if (c.test(a, b)==true)
        return a;
        else
            return b;
        }
    static boolean isletter(String word){
        char[] c= word.toCharArray();
        for (char i:c){
            if(!Character.isLetter(i)){
                return false;
        }
         
    }
        return true;
    }
}

