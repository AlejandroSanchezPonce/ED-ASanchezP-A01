/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.asancezp.t02;
import java.util.*;
/**
 *
 * @author Brusky
 */
public class EDASancezPT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack palindromo = new Stack(); 
        System.out.println("Insert");
        Scanner keyboard = new Scanner(System.in);
        String SPalindrome = keyboard.nextLine().replaceAll(" ","");
        char[]pal = SPalindrome.toCharArray();
        for(int i=0; i< pal.length ;i++){ 
        palindromo.push(SPalindrome.charAt(i));
        }       
        String p = "";
        while(!palindromo.Empty()){
            p=  p+palindromo.pop();
        }
        if(SPalindrome.equals(p)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}

