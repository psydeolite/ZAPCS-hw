import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	/*LList franz=new LList();
	franz.add("chopin");
	franz.add("frederic");
	franz.add("<3");
	franz.add("i");
	System.out.println(franz);
	System.out.println(franz.get(3));
	franz.add("hey");
	franz.add(2,"really");
	System.out.println(franz);
	franz.remove(0);
	System.out.println(franz);*/
	ArrayList<Integer> intarray=new ArrayList<Integer>();
	Random r=new Random();
	//adds to array
	for (int i=0;i<10;i++) {
	    intarray.add(r.nextInt(20));
	}
	//sum
	long start, elapsed;
	int sum=0;
	start=System.currentTimeMillis();
	for (int i=0;i<intarray.size();i++) {
	    sum+=intarray.get(i);
	}
	elapsed=System.currentTimeMillis()-start;
	System.out.println("Time for intarray sum: "+elapsed+"ms");

	LList franz=new LList();
	//adds to array
	for (int i=0;i<10;i++) {
	    franz.add(r.nextInt(20));
	}
	//sum
	start=System.currentTimeMillis();
	sum=0;
	for (int i=0;i<franz.size();i++) {
	    sum+=franz.get(i);
	}
	elapsed=System.currentTimeMillis()-start;
	System.out.println("Time for LList sum: "+elapsed+"ms");
    }

}
