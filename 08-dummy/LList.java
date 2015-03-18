public class LList {
    private int len;
    private Node l=null;
    private Node header;
    
    public LList() {
	header=new Node(l);
	header.setData("header");
    }
    
    public boolean add(String s){
	Node tmp = new Node(s);
	header.setNext(tmp);
	tmp.setNext(l);
	l = tmp;
	len++;
	return true;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = header; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public Node getNodeAt(int n) {
	Node temp=this.header;
	for (int i=-1;temp!=null;i++) {
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

    public boolean add(int n, String s) {
	Node node=new Node(s);
	if (n==0) {
	    add(s);
	} else {
	    node.setNext(getNodeAt(n));
	    getNodeAt(n-1).setNext(node);
	}
	len++;
	return true;
    }

    public boolean remove(int n) {
	Node after=getNodeAt(n+1);
	Node before=getNodeAt(n-1);
	before.setNext(after);
	len++;
	return true;
    }
}
