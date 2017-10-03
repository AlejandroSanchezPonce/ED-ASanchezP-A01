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
public class MyCList <T> {
    Node pivot;
    Node pointer;
    int length;
    
    MyCList(){
        this.pivot = null;
        this.pointer = null;
        this.length = 0;
    }
    MyCList(T p){
        Node node = new Node(p);
        pivot = node.next = node;
        length++;
    }
    public boolean Empty(){
        return length == 0;
    }
    public void insert(T d){
        Node node = new Node(d);
        if(Empty()){
            pivot = node.next = node;
        }else{
            node.next = pivot.next;
            pivot.next = node;
        }
        length++;
    }
    public void deleteNode(T p){
        if(!Empty()){
            pointer = pivot;
            for(int i = 1; i<=length;i++){
                if(pointer.next.data == p){
                    pointer.next = pointer.next.next;
                    if(pivot.data == p){
                        pivot = pointer;
                    }
                    length--;
                    pointer = null;
                    i=length+1;
                }
                pointer = pointer.next;
            }
        }
    }
    public void deleteList(){
        pivot = pointer = null;
    }
    public void print(){
        pointer = pivot;
        for(int i = 0; i<length ; i++){
            System.out.print(  pointer.data.toString() );
            pointer = pointer.next;
        }
    }
}