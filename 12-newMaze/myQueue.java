public class myQueue<E> {
    public Node start;
    public Node end;
    public myQueue(){
	start = new Node();
	end = new Node();
	end.setNext(start);
    }
    public boolean empty(){
	return (end.getNext() == start);
    }
    public void enQueue(Node n){
	//Node tmp = new Node(x,y);
	tmp.setNext(n);
	end.setNext(tmp);
    }
    public E deQueue (){
	Node tmp = end.getNext();
	Node before = end;
	while (tmp.getNext() != start) {
	    tmp = tmp.getNext();
	    before = before.getNext();
	}
	E retval = tmp;
	before.setNext(start);
	return retval;
    }
    public E head(){
	Node tmp = end.getNext();
	while (tmp.getNext() != start) {
	    tmp = tmp.getNext();
	}
	return (tmp);
    }
    
    public String toString() {
	String s = "";
	Node tmp = end.getNext();
	while (tmp != null) {
	    s += tmp + "\n";
	    tmp = tmp.getNext();
	}
	return s;
    }
}
