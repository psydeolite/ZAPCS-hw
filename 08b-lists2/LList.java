public class LList {
    private int len;
    private Node l=null;
    private Node header;
    
    public LList() {
	header=new Node(l);
	header.setData(null);
    }

    public int size() {
	return len;
    }
    
    public boolean add(int n){
	Node tmp = new Node(n);
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
	return new Node(-404);
    }	

    public int get(int n) {
	return getNodeAt(n).getData();
    }

    public boolean add(int n, int s) {
	Node node=new Node(s);
	node.setNext(getNodeAt(n));
	getNodeAt(n-1).setNext(node);
	len++;
	return true;
    }

    public int remove(int n) {
	if (n>=this.len || n<0) 
	    return -404;
	Node after=getNodeAt(n+1);
	Node before=getNodeAt(n-1);
	Node offender=getNodeAt(n);
	before.setNext(after);
	len--;
	return offender.getData();
    }
}
