import java.util.*;
import java.io.*;

public class Select {
    private Random r=new Random();
    public int[] array;
    public Select() {
	array=new int[]{3,6,1,9,25,5};
    }

    public void swap(int[] array, int ind1, int ind2) {
	int one=array[ind1];
	int two=array[ind2];
	array[ind1]=two;
	array[ind2]=one;
    }
    
    public int select(int[] ar,int k, int low, int high) {
	int li=low;
	int hi=high-1;
	int pval=ar[low];
	System.out.println("low: "+low+", high: "+high);
	swap(ar, low, high);
	while (li<hi) {
	    if (ar[li]<pval) {
		li++;
	    } else {
		swap(ar, li, hi);
		hi--;
	    }
	}
	swap(ar, li, high);
	if (li<k) {
	    pval=select(ar,k, li+1,high);
	} else if (li>k) {
	    pval=select(ar,k,low,hi-1);
	} 
	return pval;
    }

    public int select(int[] ar, int k) {
	return select(ar,k,0,ar.length-1);
    }
    public void delay() {
	try {
	    Thread.sleep(3000);
	} catch (Exception e) {}
    }
	
    public static void main(String[] args) {
	Select s=new Select();
	System.out.println(s.select(s.array, 2));
    }
}
