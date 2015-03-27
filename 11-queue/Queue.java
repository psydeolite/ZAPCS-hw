public class Queue<E>{
    private Node<E> first;
    private Node<E> last;
    
    public Queue(){
	first =  new Node<E>(null);
	last = first;
    }
    
    public void enqueue(E data){
	Node<E> temp = new Node(data);
	if (empty()) first.setNext(temp);
	last.setNext(temp);
	last = temp;
	//moves from first to last
	/*if (first==null) {
	    first=temp;
	    last=temp;
	} else {
	    last.setNext(temp);
	    last=temp;
	    }*/
    }
    
    public E dequeue(){
	E retval=first.getNext().getData();
	first=first.getNext();
	/*E retval=first.getData();
	  first=first.getNext();
	  if (start==null) end=null;
	*/
	return retval;
    }
    
    public boolean empty(){
	return first.getNext() == null;
    }

    public E head() {
	return first.getData();
    }
    
    public String toString(){
	String string = "";
	Node<E> tmp = first;
	for (tmp=tmp.getNext() ; tmp!=null ; tmp=tmp.getNext()){
	    string = string + tmp + " --> ";
	}
	return string;
    }
    
}
