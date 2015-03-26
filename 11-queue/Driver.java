public class Driver{				
    public static void main(String[] args){
	Queue q = new Queue();
	System.out.println("" + q.empty());
	q.enqueue("hello");
	System.out.println(q);
	q.enqueue("world");
	q.enqueue("it's beautiful");
	System.out.println(q);
	System.out.println("dq: "+q.dequeue());
	System.out.println(q);
	System.out.println(q.head());
    }
}
