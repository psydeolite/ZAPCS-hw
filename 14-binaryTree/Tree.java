import java.util.*;
import java.io.*;

public class Tree {
    private Node root;
    private int length=0;
    private int level;
    public Tree(Node n) {
	root=n;
    }

    public Tree() {
	root=null;
    }

    public Node search(int i) {
	Node t=root;
	while (t!=null) {
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
	//System.out.println(t);
	if (t==null) {
	    t=toInsert;
	    //System.out.println(t);
	} else {
	    if (t.getData()>i) {
		//System.out.println("not null");
		insert(t.getLeft(), i);
		t.setLeft(toInsert);
		//System.out.println("setleft");
	    } else {
		insert(t.getRight(), i);
		t.setRight(toInsert);
		//System.out.println("setright");
	    }
	}
    }

    public void rinsert(int i) {
	insert(root, i);
    }

    public boolean isLeaf(Node n) {
	return (n.getLeft()==null && n.getRight()==null);
    }
    
    //close enough, right
    public String traverse(Node n) {
	if (n==null) 
	    return "";
	else 
	    return traverse(n.getLeft())+" "+n+" "+traverse(n.getRight());
    }

    public String toString() {
	return traverse(root);
    }

    public static void main(String[] args) {
	Tree arbre=new Tree();
	Random r=new Random();
	for (int i=0;i<20;i++) {
	   
	    arbre.insert(r.nextInt(30));
	}
	System.out.println(arbre);
	
    }
		

}
