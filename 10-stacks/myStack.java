public class myStack<E> {
    Node<E> first=new Node<E>();
    public myStack(Node<E> n) {
	first=n;
    }
    
    public void push(E data) {
	Node<E> toPush=new Node<E>(data);
	toPush.setNext(first);
	first=toPush;
    }

    public E pop() {
	E returnVal=first.getData();
	first=first.getNext();
	return returnVal;	
    }

    public boolean empty() {
	return (first==null);
    }

    public E top() {
	return first.getData();
    }

    public String toString() {
	String s="";
	Node<E> current=first;
	for (current=first;current!=null;current=current.getNext()) {
	    s+=current+"-->";
	}
	return s+"null";
    }
    

}
