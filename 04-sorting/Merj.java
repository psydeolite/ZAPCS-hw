public class Merj {
    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	ArrayList<Integer> r= new ArrayList<Integer>();
	while (a.size()+b.size()>0) {
	    if (a.get(0)>b.get(0)) {
		r.add(b.remove(0));
	    } else {
		r.add(a.remove(0));
	    }
	}
	return r;
    }

    public static void main(String[] args) {
	Merj m=new Merj();
	
}
