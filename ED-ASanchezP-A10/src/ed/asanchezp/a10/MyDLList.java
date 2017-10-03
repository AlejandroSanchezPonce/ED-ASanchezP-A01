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
public class MyDLList <T>{
    NodeDLL first;
    NodeDLL last;
    NodeDLL pointer;
    int length;
    
    MyDLList(){
        this.first = null;
        this.last = null;
        this.pointer = null;
        length = 0;
    }
    MyDLList(T p){
        NodeDLL node = new NodeDLL(p);
        this.first = node;
        this.last = node;
        pointer = null;
        length = 1;
    }
    public boolean Empty(){
        return length == 0;
    }

    public void insertFirst(T p){
        NodeDLL node = new NodeDLL(p);
        if(Empty()){
            this.first = node;
            this.last = node;
        }else{
            node.next = first;
            first.prev = node;
            first = node;
        }
        length+=1;
    }
    public void insertLast(T p){
        NodeDLL node = new NodeDLL(p);
        if(!Empty()){
            last.next = node;
            node.prev = last;
            last = node;
        }else{
            first = node;
            last = node;
        }
        length+=1;
    }
    public void deleteFirst(){
        if(!Empty()){
            first.next.prev=null;
            first=first.next;
            length-=1;
        }
    }
    public void deleteLast(){
        if(!Empty()){
            last=last.prev;
            last.next=null;
            length-=1;
        }
    }
    public void deleteNode(T data){
        if(!Empty()){
            if(first.data == data){
                deleteFirst();
                length-=1;
            }
            if(last.data==data){
                deleteLast();
                length-=1;
            }
            pointer=first;
            do{
                if(pointer.data==data){
                    pointer.prev.next=pointer.next;
                    pointer.next.prev=pointer.prev;
                    pointer = null;
                    length-=1;
                }else{
                    pointer=pointer.next;
                }
            }while(pointer!=null);
        }
    }
    public void showListFirstLast(){
        if(!Empty()){
            pointer=first;
            System.out.print("First->");
            while(pointer!=null){
                System.out.print("[" + pointer.data + "]");
                pointer=pointer.next;
                if(pointer!=null){
                    System.out.print("->");
                }
            }
            System.out.print("<-Last");
        }
    }
    public void showListLastFirst(){
        if(!Empty()){
            pointer=last;
            System.out.print("Last->");
            while(pointer!=null){
                System.out.print("[" + pointer.data + "]");
                pointer=pointer.prev;
                if(pointer!=null){
                    System.out.print("->");
                }
            }
            System.out.print("<-First");
        }
    }
}
