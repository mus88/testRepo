package exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		
		Exercise1 exercise1 = new Exercise1();
		boolean check1 = exercise1.mixStart("mix snacks");
		System.out.println(check1); //should be true
		
		boolean check2 = exercise1.mixStart("pix snacks");
		System.out.println(check2); //should be true
		
		boolean check3 = exercise1.mixStart("9ix snacks");
		System.out.println(check3); //should be true
		
		boolean check4 = exercise1.mixStart("piz snacks");
		System.out.println(check4); //should be false
	}

	/**
	 * @return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. 
	 * mixStart("mix snacks") → true
	 * mixStart("pix snacks") → true 
	 * mixStart("piz snacks") → false
	 */
	private boolean mixStart(String text) {
		// This is my first test git commit
		return false;
	}
}
