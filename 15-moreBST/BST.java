import java.io.*;
import java.util.*;
public class BST{
    Node r;

    public Node search(Node t, int i){
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i<t.getData()){
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }

    public String search(int i){
	Node n = search(r,i);
	if (n==null){
	    return "NOT FOUND";
	}else{
	    return n.toString();
	}
    }

    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = r;
	if (r==null){
	    r=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}

				
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }

    public int maxVal(Node max, Node t) {
	if (t==null) {
	    return max.getData();
	} else {
	    return maxVal(t,t.getRight());
	}
    }

    public int height(Node t, int maxH) {
	if (t==null) {
	    return maxH;
	} else {
	    height(t.getRight(), maxH+1);
	    height(t.getLeft(), maxH+1);
	}
	return null;
    }

    public static void main(String[] args){
	BST t = new BST();
	Random r = new Random();
	for (int i = 0; i < 20; i ++){
	    int z = r.nextInt(100);
	    //System.out.println(z);
	    t.insert(z);
	}
	t.insert(200);
	System.out.println(t);
	System.out.println(t.search(30));
	System.out.println(t.maxVal(t.r, t.r));
    }
}






								


		
