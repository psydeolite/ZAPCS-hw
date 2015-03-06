import java.util.*;
import java.io.*;

public class Select {
    private Random r=new Random();
    private ArrayList<Integer> array;
    public Select() {
	array=new ArrayList<Integer>();
	array.add(3);
	array.add(6);
	array.add(1);
	array.add(9);
	array.add(25);
	array.add(5);
    }

    public int selectHelp(int k, int start, int end) {
	int ref=r.nextInt(end)+start;
	ArrayList<Integer> newlist=new ArrayList<Integer>();
	newlist.add(ref);
	for (int i=0; i<end;i++) {
	    //go through the list and do the selection/swapping
	}
	if (newlist.indexOf(ref)==k || start>=end) {
	    return ref;
	} else if (newlist.indexOf(ref)<k) {
	    return selectHelp(k, (start+end)/2, end);
	} else {
	    return selectHelp(k, start, (start+end)/2);
	}
    }
		       
    public int select(int k) {
	if (k>array.size()) {
	    System.out.println("Invalid k value");
	    return 0; //temporary
	}
	return selectHelp(k, 0, array.size());
    }

    public static void main(String[] args) {
	Select s=new Select();
	s.select(3);
    }
}
