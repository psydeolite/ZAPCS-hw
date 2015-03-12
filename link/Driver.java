public class Driver {
    public static void main(String[] args) {
	LList elle=new LList();
	elle.add("moryak");
	System.out.println(elle);
	elle.add("hay");
	System.out.println(elle);
	for (int i=0;i<8;i++) {
	    elle.add(""+i+1);
	}
    }

}
