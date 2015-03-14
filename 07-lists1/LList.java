public class LList {
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public Node getNodeAt(int n) {
	Node temp=this.l;
	for (int i=0;temp!=null;i++) {
	    if (i==n) {
		return temp;
	    } 
	    temp=temp.getNext();
	}
	return new Node("Index out of bounds.");
    }	

    public String find(int n) {
	return getNodeAt(n).getData();
    }

    public void insert(int n, String s) {
	Node node=new Node(s);
	if (n==0) {
	    add(s);
	} else {
	    node.setNext(getNodeAt(n));
	    getNodeAt(n-1).setNext(node);
	}
	    
    }
}
