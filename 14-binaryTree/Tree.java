public class Tree {
    private Node root;

    public Tree(Node n) {
	root=n;
    }

    public Node search(int i) {
	Node t=root;
	while (t!=null) {
	    //int c=t.getData().compareTo(i);
	    int c=t.getData()-i;
	    if (c==0) return t;
	    else if (c<0) t=t.getLeft();
	    else t=t.getRight();
	}
	return null;
    }

    public void insert(int i) {
	Node toInsert=new Node(i);
	if (root==null) {
	    root=toInsert;
	} else {
	    Node n1=null;
	    Node n2=root;
	    while (n2!=null) {
		int c=n2.getData()-i;
		n1=n2;
		if (c<0) {
		    n2=n2.getRight();
		} else {
		    n2=n2.getLeft();
		}
	    }
	    int c2=n1.getData()-i;
	    if (c2>0) n1.setRight(toInsert);
	    else n1.setLeft(toInsert);
	}
    }
		

}
