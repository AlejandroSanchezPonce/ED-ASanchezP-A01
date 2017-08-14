/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.asanchezp.a03;
import java.util.*;
/**
 *
 * @author Brusky
 */
abstract public class FetchClass {
    public int V [];
    public abstract int Fetch(int B);
    
    
    public int[] getV() {
        return V;
    }

    public void setV(int[] V,int dato) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("inserte el tamano de los valores que quiere crear");
        int N = teclado.nextInt();
        Random rnd = new Random();
        int[] C = new int[N];
        for (int i = 0; i<C.length;i++){
            V[i] = rnd.nextInt();
    }
        this.V = C;
    }
    private void showV(){
        System.out.println(V);
    }
    private void showF(int i){
        if(V[i]== -1){
            System.out.println("esta en" + i);
        }else{
            System.out.println(V[i]);
        }
    }
}
