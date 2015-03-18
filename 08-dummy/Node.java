public class Node {
    private Integer data;
    private Node next;
    public Node(Integer s){
	data = s;
	next = null;
    }
    public Node(Node n) {
	data=null;
	next=n;
    }
    public void setData(Integer s){
	data = s;
    }
    public int getData() {
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString() {
	return ""+data;}
}
