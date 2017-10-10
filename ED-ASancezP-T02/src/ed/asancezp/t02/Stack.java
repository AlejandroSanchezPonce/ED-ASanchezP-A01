/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.asancezp.t02;

/**
 *
 * @author Brusky
 */
public class Stack <T>{
    private Node<T> T;
    private int size;
    public Stack() {
        this.T = null;
        this.size = 0;
    }
    public Stack(T p) {
        Node <T> node = new Node(p);
        this.T = node;
        this.size = 1;
    }
    public int getSize() {
        return size;
    }   
    public void push(T p){
        Node <T> node = new Node(p);
        node.next = T;
        T = node;
        size++;
    }   
    public T pop(){
        if (size>0) {
            T p = T.data;
            T = T.next;
            size--;
            return p;
	}else {
		return null;
	}
    }
    public T getTop() {
        if (size > 0) {
            return T.data;
	}else {
		return null;
	}
    } 
    public void showStack(){
        Node<T> t = T;
	while(t!=null) {
            t.printS();
            t = t.next;
	}
	       System.out.println("NULL");
    }
        public boolean Empty(){
        return size==0;
    }
    
}
