/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.asanchezp.a03;

/**
 *
 * @author Brusky
 */
public class Binaria extends FetchClass{

    @Override
    public int Fetch(int B) {
        int menor = 0;
        int mayor = V.length;
        int centro = ((menor + mayor)/2);
        int numCentro;
        while(menor<mayor){
            numCentro = V[centro];
            if(numCentro == B){
                return centro;
            }else{
                if(B< numCentro){
                    menor = centro;
                    centro = (menor+mayor)/2;
                }else{
                    mayor = centro;
                    centro = (menor+mayor)/2;
                }
            }
        }
        
   return -1; 
}
}
