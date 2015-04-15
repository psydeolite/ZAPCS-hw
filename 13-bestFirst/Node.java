import java.util.*;
import java.io.*;
import java.lang.Math;

public class Node {
    private int x,y;
    private Node next;
    private Node prev;
    private Node exitNode;
    
    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }

    public Node(int x, int y, Node e) {
	this.x=x;
	this.y=y;
	exitNode=e;
    }
    
    public Node getPrev() {
	return prev;
    }

    public Node getNext() {
	return next;
    }
    
    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public double getEPriority() {
	double exX=exitNode.getX();
	double exY=exitNode.getY();
	return Math.sqrt(Math.pow(exX,2)+Math.pow(exY,2));
    }

    public int getMPriority() {
	int ey=exitNode.getX();
	int ex=exitNode.getY();
	return Math.abs(ex-x)+Math.abs(ey-y);
    }
}










