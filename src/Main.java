public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		Boolean flag = null;
		Boolean dummy = Boolean.valueOf("TRUe");
		Boolean temp = false;

		System.out.println(flag);
		System.out.println(dummy);
		System.out.println(temp);

		boolean flag_p =false;
		boolean flag_pn = Boolean.parseBoolean(null);

		System.out.println(flag_p);
		System.out.println(flag_pn);
	}
}