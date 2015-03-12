public class LList {
    private Node l=null;
    public void add(String s) {
	Node tmp=new Node(s);
	tmp.setNext(l);
	l=tmp;
    }
    public String toString() {
	String s="";
	Node tmp;
	for (tmp=l;tmp!=null;tmp=tmp.getNext()) {
	    s+=tmp+"--";
	}
	s+="null";
	return s;
    }
    
}
