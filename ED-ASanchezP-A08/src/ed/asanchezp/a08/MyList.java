/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.asanchezp.a08;
/**
 *
 * @author Brusky
 */
public class MyList <T>{
    Node first;
    Node last;
    Node pointer;
    //Constructor
    MyList(){
        this.first = null;
        this.last = null;
        pointer = null;
    }
    MyList(T d){
        Node node = new Node(d);
        first = node;
        last = node;
        node.next = null;
    }
    public boolean isEmpty(){
        return this.first==null;
    }
    public void insertFirst(T n){
        Node node = new Node(n);
        if(isEmpty()){          
            first = node;
            last = node;
            node.next = null;
        }else{
            node.next = first;
            first = node;
        }
    }
    public void insertLast(T n){
        Node node = new Node(n);
        if(isEmpty()){
            first = node;
            last = node;
            node.next = null;
        }else{
            last.next = node;
            last = node;
        }
    }
    public void deleteFirst(){
        if(!isEmpty()){
            if(first.next == null){
                first = null;
                last = null;
            }else{
                first = first.next;
            }
        }
        System.out.println("it is empty");
    }
    public void deletaLast(){
        if(!isEmpty()){
            if(first == last){
                first = last = null;
            }else{
                pointer = first;
                while(pointer.next != last){
                    pointer = pointer.next;
                }
                last = pointer;
                last.next = null;
                pointer = null;
            }
        }
    }
    public boolean deleteNode(T n){
        Node p = fetchBack(n);
        if(p != null){
            if(p.data == n){
            deleteFirst();
             }else{
                 p.next = p.next.next;
            }
            return true;
        }
        return false;
    }    
    public Node fetch(T n){
        if(!isEmpty()){
            if(first.data == n){
                return first;
            } 
            Node p = fetchBack(n); 
            if(p!=null){ 
                if(p.data != n){ 
                    return p.next;
                }
            }
        }
        return null;
    } 
    public Node fetchBack(T n){
        if(!isEmpty()){
            if(first == last){
                if(first.data == n){
                    return first;
                }else{
                    return null;
                }
              }else{
                    if(first.data == n){
                        return first;
                    }else{
                        pointer = first;
                        while(pointer.next != null){
                            if(pointer.next.data == n){
                            return pointer;
                            }
                        pointer = pointer.next;
                        }
                    }
            }
        }
        return null;
    }

}