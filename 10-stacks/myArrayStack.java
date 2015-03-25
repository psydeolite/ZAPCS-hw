public class myArrayStack {
    int[] list;
    int len=0;
    public myArrayStack() {
	list=new int[0];
    }

    public void push(int data) {
	len++;
	int[] nlist=new int[len];
	for (int i=0;i<len-1;i++) {
	    nlist[i]=list[i];
	}
	nlist[len-1]=data;
	list=nlist;
    }

    public int pop() {
	int returnVal=list[len-1];
	len--;
	int[] nlist=new int[len];
	for (int i=0;i<len;i++) {
	    nlist[i]=list[i];
	}
	list=nlist;
	return returnVal;
    }

    public boolean empty() {
	return (len==0);
    }

    public int top() {
	return list[len-1];
    }

    public String toString() {
	String s="";
	for (int i=len-1; i>=0;i--) {
	    s+=list[i]+", ";
	}
	return s;		  
    }
    
}
