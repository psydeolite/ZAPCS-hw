import java.util.*;

public class PriorityQueue {
    public LinkedList<Node> l=new LinkedList<Node>();

    public void add(Node n) {
	l.add(n);
    }
    
    public Node Eremove() {
	double dist=l.getFirst().getEPriority();
	Node retval=l.getFirst();
	for (int i=1;i<l.size();i++) {
	    if (l.get(i).getEPriority()<dist) {
		retval=l.get(i);
		dist=retval.getEPriority();
	    }
	}
	l.remove(retval);
	return retval;
    }
    
     public Node Mremove() {
	double dist=l.getFirst().getMPriority();
	Node retval=l.getFirst();
	for (int i=1;i<l.size();i++) {
	    if (l.get(i).getMPriority()<dist) {
		retval=l.get(i);
		dist=retval.getMPriority();
	    }
	}
	l.remove(retval);
	return retval;
    }
    
    public boolean isEmpty() {
	return l.size()==0;
    }
		
}
