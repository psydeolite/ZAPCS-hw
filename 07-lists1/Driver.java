public class Driver {
    public static void main(String[] args) {
	LList franz=new LList();
	franz.add("chopin");
	franz.add("frederic");
	franz.add("<3");
	franz.add("i");
	System.out.println(franz);
	System.out.println(franz.find(3));
	franz.insert(1,"really");
	System.out.println(franz);
    }

}
