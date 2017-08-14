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
public class Secuencial extends FetchClass{

    @Override
    public int Fetch(int B) {
        for(int i = 0 ; i < V.length ;i++){
            if(V[i]== B){
                return V[i];
            }
        }return -1;
    }
    
}

