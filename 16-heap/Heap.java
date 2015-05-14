public class Heap {
    private int[] ar;
    private int length;
    public Heap() {
	ar=new int[100];
	length=0;
    }

    public void insert(int n) {
	
    }

    public void pushDown(){
	for (int i=0; (2*i)+1<length;i++) {
	    if (ar[i]>ar[(2*i)+1]) {
		
	}

    }
}
