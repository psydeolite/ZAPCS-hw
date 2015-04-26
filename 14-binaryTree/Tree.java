
public class Tree {
    private Node root;
    private int length=0;
    public Tree(Node n) {
	root=n;
    }

    public Tree() {
	root=null;
    }

    public Node search(int i) {
	Node t=root;
	while (t!=null) {
	    System.out.println("loop");
	    if (t.getData()==i) return t;
	    else if (t.getData()<i) t=t.getRight();
	    else t=t.getLeft();
	}
       	return t;
    }

    public Node search(Node t, int i) {
	if (t!=null) {
	    if (t.getData()==i) 
		return t;
	    else if (t.getData()<i) 
		return search(t.getRight(),i);
	    else 
		return search(t.getLeft(),i);
	}
	return t;
    }

    public Node rsearch(int i) {
	return search(root,i);
    }
    
    public void insert(int i) {
	Node toInsert=new Node(i);
	if (root==null) {
	    root=toInsert;
	} else {
	    System.out.println("inserting");
	    Node n1=null;
	    Node n2=root;
	    while (n2!=null) {
		if (n2.getData()<i) {
		    n1=n2;
		    n2=n2.getRight();
		} else {
		    n1=n2;
		    n2=n2.getLeft();
		}
	    }
	    if (n1.getData()<i) n1.setRight(toInsert);
	    else n1.setLeft(toInsert);
	}
    }

    public void insert(Node t, int i) {
	Node toInsert=new Node(i);
	System.out.println(t);
	if (t==null) {
	    //toInsert;
	    System.out.println(t);
	} else {
	    if (t.getData()>i) {
		insert(t.getLeft(), i);
	    } else {
		insert(t.getRight(), i);
	    }
	}
    }

    public void rinsert(int i) {
	insert(root, i);
    }
	     
    //close enough, right
    public String toStringHelp(Node n) {
	if (n==null) 
	    return "";
	else 
	    return n.toString()+"\n"+toStringHelp(n.getLeft())+"     " +toStringHelp(n.getRight());
    }

    public String toString() {
	return toStringHelp(root);
    }

    public static void main(String[] args) {
	Tree arbre=new Tree();
	System.out.println(arbre);
	arbre.rinsert(3);
	System.out.println(arbre);
	arbre.rinsert(1);
	System.out.println(arbre);
	arbre.rinsert(5);
	System.out.println(arbre);
	System.out.println(arbre.search(1));
    }
		

}
