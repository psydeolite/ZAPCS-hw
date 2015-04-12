public class myStack<E> {
    Node first=new Node();
    public myStack(Node n) {
	first=n;
    }
    public myStack() {
	first=new Node();
    }
    
    public void push(Node toPush) {
	toPush.setNext(first);
	first=toPush;
    }

    public Node pop() {
	Node returnVal=first;
	first=first.getNext();
	return returnVal;	
    }

    public boolean empty() {
	return (first==null);
    }

    public Node top() {
	return first;
    }

    public String toString() {
	String s="";
	Node current=first;
	for (current=first;current!=null;current=current.getNext()) {
	    s+=current+"-->";
	}
	return s+"null";
    }
    

}
