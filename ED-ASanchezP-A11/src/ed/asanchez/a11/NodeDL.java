/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.asanchez.a11;

/**
 *
 * @author Brusky
 */
public class NodeDL <T>{
    T data;
    NodeDL next;
    NodeDL prev;
    
    NodeDL(T d){
        this.data = d;
        this.next = null;
        this.prev = null;
    }
    
     public void print(){
        System.out.print(data);
    }
}
