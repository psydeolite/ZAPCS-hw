import java.util.*;
import java.io.*;

public class Merj {
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	ArrayList<Integer> r= new ArrayList<Integer>();
	while (a.size()+b.size()>0) {
	    if (a.size()==0) {
		r.addAll(b);
		b.clear();
	    } else if (b.size()==0) {
		r.addAll(a);
		a.clear();
	    } else if (a.get(0)>b.get(0)) {
		r.add(b.remove(0));
	    } else {
		r.add(a.remove(0));
	    }
	}
	return r;
    }

    public static void main(String[] args) {
	Merj m=new Merj();
	ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Integer> b=new ArrayList<Integer>();
	for (int i=0;i<13;i++) {
	    a.add(i);
	}
	for (int s=9;s<23;s++) {
	    b.add(s);
	}
	System.out.println(m.merge(a,b));
    }
}
