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
public class Deque <T>{
private NodeDL<T> F;
private NodeDL<T> R;
private int size;
    
Deque(){
        F = null;
	R = null;
	size = 0;
    }
Deque(T d){
        NodeDL node = new NodeDL(d);
        F = R = node;
        size = 1;
    }
public void enqueueFront(T d){
    NodeDL node = new NodeDL(d);
        if (isEmpty()) {
        F = R = node;
	}else{
	node.next = F;
	F.prev = node;
	F = node;
        }size++;
}
public void enqueueRear(T d){
    if (isEmpty()) {
    enqueueFront(d);
    }else {
	NodeDL node = new NodeDL(d);
	R.next = node;
	node.prev = R;
	R = node;
	size++;
    }
}
public T dequeueFront(){
    if (!isEmpty()) {
	NodeDL<T> fd = F;
	if (size == 1) {
	clearDeque();
	} else {
	F = F.next;
	F.prev = null;
	fd.next = null;
	size--;
	}return fd.data;
	} else {
	return null;
	}
    }
public T dequeueRear(){
    if (!isEmpty()) {
    NodeDL<T> rd = R;
    if (size == 1) {
	clearDeque();
	}else {
	R = R.prev;
	R.next = null;
	rd.prev = null;
	size--;
	}return rd.data;
	}else{
return null;
	}
    }
    public T getFront(){
        return F.data;
    }
    public T getRear(){
        return R.data;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void clearDeque(){
        F = R = null;
        size = 0;
    }
    public void showDeque(){; 
        NodeDL<T> p =F;
        if(p==null){
            System.out.print("NULL");
        }
        while(p!=null){
            p.print();
            p=p.next;
        }
    }
}