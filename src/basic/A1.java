package basic;

public class A1 {
	public static void main(String[] args) {
		int[] myNumbers = {1, 2, 3};

		try{
			System.out.println(myNumbers[0]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}

	}

}
