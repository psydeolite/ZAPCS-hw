
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
	    int c=t.getData()-i;
	    if (c==0) return t;
	    else if (c<0) t=t.getLeft();
	    else t=t.getRight();
	}
	return null;
    }

    public Node search(Node t, int i) {
	if (t!=null) {
	    int c=t.getData()-i;
	    if (c==0) 
		return t;
	    else if (c<0) 
		return search(t.getLeft(),i);
	    else 
		return search(t.getRight(),i);
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

    public void insert(Node t, int i) {
	Node toInsert=new Node(i);
	if (t==null) {
	    return;
	} else {
	    int c=t.getData()-i;
	    if (c>0) {
		insert(t.getRight(), i);
		t.setRight(toInsert);
	    } else {
		insert(t.getLeft(), i);
		t.setLeft(toInsert);
	    }
	}
    }

    public void rinsert(int i) {
	insert(root, i);
    }
		
    public static void main(String[] args) {
	Tree arbre=new Tree();
	arbre.insert(3);
	arbre.insert(1);
	arbre.insert(5);
	System.out.println(arbre.search(5));
    }
		

}
