/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
package ed.asanchezp.a02;

/**
 *
 * @author Brusky
 */
public class EDASanchezPA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] v = {120,80,98,10};
        System.out.println(factorial(5));
        System.out.println(Suma(v, v.length-1));
        System.out.println(Multi(v, v.length-1));
    }
    
    public static int factorial(int n){
    if (n==0)
        return 1;
    else
        return n*(factorial(n-1));
    }
    
    public static int Suma(int [] v,int n){
    if (n==0)
        return 1;
    else
        return v[n]*(Suma(v,n-1));
    }
    
    public static int Multi(int [] v,int n){
    if (n==0)
        return 1;
    else
        return v[n]*(Multi(v,n-1));
    }
}
