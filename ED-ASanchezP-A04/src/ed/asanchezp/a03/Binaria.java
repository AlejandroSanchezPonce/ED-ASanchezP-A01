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
public class Binaria extends FetchClass implements Sorting{
 @Override
    public void sorter() {
        int b,z;
        for(int i=0; i<V.length;i++){
            b=i;
            for(int a=i+1;a<V.length;a++){
                if(V[a]<V[b]){
                    b=a;
                }
            }
            if(i != b){
            z=V[i];
            V[i]=V[b];
            V[b]=z;
    }
            
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
    }
}
