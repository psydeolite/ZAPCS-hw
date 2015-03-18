public class Driver {
    public static void main(String[] args) {
	LList franz=new LList();
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
	System.out.println(franz);
    }

}
