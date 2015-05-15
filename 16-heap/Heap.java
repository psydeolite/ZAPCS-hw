import java.util.Random;


public class Heap {
    private int[] ar;
    private int length;
    public Heap() {
	ar=new int[100];
	length=0;
    }

    public void insert(int n) {
	ar[length]=n;
	length++;
	for (int i=0;i<length;i++) {
	    pushDown();
	}
    }

    public removeMin

    public void pushDown(){
	for (int i=0; (2*i)+1<length;i++) {
	    if (ar[i]>ar[(2*i)+1]) {
		int at2=ar[(2*i)+1];	
		ar[(2*i)+1]=ar[i];
		ar[i]=at2;
	    } else if (ar[i] > ar[(2*i)]){
		int at2 = ar[(2*i)];
		ar[(2*i)] = ar[i];
		ar[i]=at2;
	    }
	}
    }

    public String toString(){
	String s = "";
	for(int i = 0; i< length;i++){
	    s += ar[i] + " ";
	}
	return s;
    }
    
    public static void main(String args[]){
	Heap h = new Heap();
	Random rnd = new Random();
	for(int i = 0;i<20;i++){
	    h.insert( rnd.nextInt(20) +1);
	}
	System.out.println(h);
	h.insert(30);
	h.insert(-6);
	System.out.println(h);
    }
	
		

}

