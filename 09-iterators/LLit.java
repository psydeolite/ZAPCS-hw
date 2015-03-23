import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private Node<E> first;
    private Node<E> lnext;
    public LLit(Node<E> n){
	t=n;
	first=n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public boolean hasNext(Node n) {
	return n!=null;
    }

    public E next(){
	E retval = t.getData();
	lnext=t;
	t=t.getNext();
	return retval;
    }

    public void remove() {
	Node one=first;
	while (hasNext(one)) {
	    if (one.getNext()==lnext) 
		one.setNext(lnext.getNext());
	    else 
		one=one.getNext();
	}
    }
}
