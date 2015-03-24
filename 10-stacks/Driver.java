public class Driver {
    public static void main(String[] args) {
	myStack s=new myStack(new Node(1));
	s.push(3);
	s.push(5);
	System.out.println(s.pop());
	System.out.println(s.empty());
	System.out.println(s.top());
	//s.pop();
	//s.pop();
	System.out.println(s.empty());
	System.out.println(s);
    }
}
