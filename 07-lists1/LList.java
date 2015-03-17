public class LList {
    private int len;
    private Node l=null;
    private Node header;
    
    public LList() {
	header=new Node(l);
    }
    
    public void add(String s){
	Node tmp = new Node(s);
	header.setNext(tmp);
	tmp.setNext(l);
	l = tmp;
	len++;
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

    public Node getNodeAt(int x) {
	int n=x+1;
	Node temp=this.l;
	for (int i=0;temp!=null;i++) {
	    if (i==n) {
		return temp;
	    } 
	    temp=temp.getNext();
	}
	return new Node("Index out of bounds.");
    }	

    public String get(int n) {
	return getNodeAt(n).getData();
    }

    public void add(int n, String s) {
	Node node=new Node(s);
	if (n==0) {
	    add(s);
	} else {
	    node.setNext(getNodeAt(n));
	    getNodeAt(n-1).setNext(node);
	}
	len++;
    }

    public void remove(int n) {
	
    }
}
