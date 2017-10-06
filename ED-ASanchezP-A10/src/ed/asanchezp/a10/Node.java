/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.asanchezp.a10;

/**
 *
 * @author Brusky
 */
public class Node <T>{
    T data;
    Node next;
    
    Node(T p){
        this.data = p;
        this.next = null;
    }
     public void printS(){
        System.out.println(data);
    }
}
