public class ADriver {
    public static void main(String[] args) {
	myArrayStack a=new myArrayStack();
	a.push(5);
	a.push(4);
	a.push(3);
	System.out.println(a);
	System.out.println(a.pop());
	System.out.println(a);
	System.out.println(a.top());
	a.pop();
	a.pop();
	System.out.println(a.empty());
	
    }
    


}
