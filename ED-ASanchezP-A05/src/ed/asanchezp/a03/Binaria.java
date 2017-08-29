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
abstract public class Binaria extends FetchClass implements Sorting{
    @Override
    public void sorter(){
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
        }
    }
        public void mergeSort(int menor, int mayor) {
        if(menor < mayor){
            int mid = (menor + mayor) / 2;
            mergeSort(menor, mid); 
            mergeSort(mid + 1, mayor);
            merge(menor, mid, mayor);
        }
    }
    
    public void merge(int menor, int mayor, int mid){
         int[] temp = new int[V.length];
        for(int i = menor; i <= mayor; i++){
            temp[i] = V[i];
        }
        int i = menor;
        int j = mid + 1;
        int k = menor;   
        while (i <= mid && j <= mayor) {
            if (temp[i] <= temp[j]) {
                                             
                V[k] = temp[i];
                i++;
            } else {
                V[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            V[k] = temp[i];
            k++;
            i++;
        }
    }
            
    @Override
        public int Fetch(int B){
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

