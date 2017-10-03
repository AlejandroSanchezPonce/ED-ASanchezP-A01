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
public class MyList <T>{
    Node first;
    Node last;
    Node pointer;
    int length; 
    MyList(){
        this.first = null;
        this.last = null;
        pointer = null;
        length = 0;
    }
    MyList(T p){
        Node node = new Node(p);
        first = node;
        last = node;
        node.next = null;
        length++;
    }

    public boolean Empty(){
        return this.first == null;
    }
    public void insertFirst(T n){
        Node node = new Node(n);
        if(Empty()){          
            first = node;
            last = node;
            node.next = null;
        }else{
            node.next = first;
            first = node;
        }
        length++;
    }
    public void insertLast(T n){
        Node node = new Node(n);
        if(Empty()){
            first = node;
            last = node;
            node.next = null;
        }else{
            last.next = node;
            last = node;
        }
        length++;
    }
    public void deleteFirst(){
        if(!Empty()){
            if(first.next == null){
                first = null;
                last = null;
            }else{
                first = first.next;
            }
            length--;
        }
        if(Empty()){
        System.out.println("The list is empty");
        }
    }
    public void deleteLast(){
        if(!Empty()){
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
            length--;
        }
    }
    public boolean deleteNode(T n){
        Node p = fetchBack(n);
        if(p != null){
            if(p.data == n){
            deleteFirst();
             }else{
                 p.next = p.next.next;
                 length--;
            }
            return true;
        }
        return false;
    }
    
        
    public Node fetch(T n){
        if(!Empty()){
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
        if(!Empty()){
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
    
    public void showList(){
        pointer = first;
        for(int i = 0; i<length ; i++){
            System.out.print(pointer.data.toString());
            pointer = pointer.next;
        }
    }

}
