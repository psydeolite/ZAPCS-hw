import java.util.*;

public class PriorityQueue {
    public LinkedList<Node> l=new LinkedList<Node>();

    public void add(Node n) {
	l.add(n);
    }
    
    public Node Eremove() {
	double dist=l.getFirst().getEPriority();
	Node retval=null;
	for (int i=1;i<l.size();i++) {
	    if (l.get(i).getEPriority()<dist) {
		retval=l.get(i);
		dist=retval.getEPriority();
	    }
	}
	l.remove(retval);
	return retval;
    }
		
}
