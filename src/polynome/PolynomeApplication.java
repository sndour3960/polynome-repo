package polynome;

public class PolynomeApplication {

	public static void main(String[] args) {
		int[] t1 = {1,2,3};
		int[] t2 = {0,2,1,4};
		int[] s = {1,4,4,4};
		Polynome pl = new Polynome(t1);
		System.out.println("Polynome = "+pl.toString());
	}

}
